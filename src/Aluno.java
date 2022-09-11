import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Aluno extends Pessoa {
    private static ArrayList <Aluno> listaDeAlunos = new ArrayList<>();
    private String matricula;
    private String notaProcessoSeletivo;
    private int numeroDeAtendimentos = 0;

    public Aluno(String nome, String telefone, String dataNascimento, String cpf, String notaProcessoSeletivo) {
        super(nome, telefone, dataNascimento, cpf);
        this.notaProcessoSeletivo = notaProcessoSeletivo;

        matricular();
    }
    public static void adicionarAluno(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do Aluno: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o telefone: ");
        String telefone = scanner.next();

        System.out.println("Digite a data de nascimento: ");
        String dataNascimento = scanner.next();

        System.out.println("Digite o cpf: ");
        String cpf =  scanner.next();

        System.out.println("Digite a Nota obtida no processo seletivo: ");
        String notaProcessoSeletivo = scanner.next();

        Aluno.getListaDeAlunos().add(new Aluno(nome,telefone,dataNascimento,cpf,notaProcessoSeletivo));
    }

    public static void listarAlunos() {
        if (listaDeAlunos.size() == 0)
            System.out.println("\nSua lista de alunos está vazia!");
        else {
            System.out.println("\n Lista de Alunos:");
            for (int i = 0; i < listaDeAlunos.size(); i++) {
                System.out.println("\n[" + (i+1) + "] " + listaDeAlunos.get(i));

            }
        }
    }

    public static void listarPorMatricula() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Aluno> alunosPorMatricula = new ArrayList<>();
        String filtroAlunos = "";
        System.out.println("\nSelecione o tipo de matricula a ser filtrada: ");
        System.out.println("{ 1 } Ativo");
        System.out.println("{ 2 } Irregular");
        System.out.println("{ 3 } Atendimento pedagógico");
        System.out.println("{ 4 } Inativo");
        int selecao = scanner.nextInt();

        switch (selecao) {
            case 1:
                filtroAlunos = "Ativa";
                break;
            case 2:
                filtroAlunos = "Irregular";
                break;
            case 3:
                filtroAlunos = "Atendimento Pedagógico";
                break;
            case 4:
                filtroAlunos = "Inativo";
                break;
            default:
                System.out.println("Opção inválida!");
                listarPorMatricula();
                break;
        }
        for (Aluno listaDeAluno : listaDeAlunos) {
            if (filtroAlunos.equalsIgnoreCase(listaDeAluno.getMatricula())) {
                alunosPorMatricula.add(listaDeAluno);
            }
        }
        if (listaDeAlunos.size() == 0)
            System.out.println("\nNão ha alunos com a matricula selecionada!");
        else {
            for (Aluno aluno : alunosPorMatricula) {
                System.out.println(aluno.toString());
            }
        }
    }

    public void matricular() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Digite o estado da matricula:\s
                1 Para Ativo
                2 Para Irregular
                3 Para em Atendimento Pedagógico
                4 Para Inativo""");
        int status = scanner.nextInt();
        switch (status) {
            case 1 -> matricula = "Ativa";
            case 2 -> matricula = "Irregular";
            case 3 -> matricula = "Atendimento Pedagógico";
            case 4 -> matricula = "Inativo";
            default -> {
                System.out.println("Entrada inválida!");
                matricular();
            }
        }

    }

    public static void alterarMatricula() {
        Scanner scanner = new Scanner(System.in);
        listarAlunos();
        int indice = scanner.nextInt();
        Aluno aluno = Aluno.getListaDeAlunos().get(indice - 1);
        aluno.matricular();

    }

    public void adicionaAtendimento(){
        numeroDeAtendimentos++;
        setMatricula("Em Atendimento Pedagógico");
    }

    public static void listarPorAtendimentos() {
        listaDeAlunos.sort((Aluno1,Aluno2) ->{
            return Aluno1.getNumeroDeAtendimentos() < Aluno2.getNumeroDeAtendimentos() ? -1 :1;});
        Collections.reverse(listaDeAlunos);
        listarAlunos();
    }

    public static ArrayList<Aluno> getListaDeAlunos() {
        return listaDeAlunos;
    }

    public static void setListaDeAlunos(ArrayList<Aluno> listaDeAlunos) {
        Aluno.listaDeAlunos = listaDeAlunos;
    }

    public  String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getNumeroDeAtendimentos() {
        return numeroDeAtendimentos;
    }

    public void setNumeroDeAtendimentos(int numeroDeAtendimentos) {
        this.numeroDeAtendimentos = numeroDeAtendimentos;
    }

    @Override
    public String toString() {
        super.toString();
        return super.toString()+" Nota: "+notaProcessoSeletivo+ " | Matricula: "+matricula+" | Atendimentos pedagógicos: "+numeroDeAtendimentos+" |";
    }

}
