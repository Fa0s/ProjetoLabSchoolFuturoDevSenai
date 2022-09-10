import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Aluno extends Pessoa {
    private static ArrayList <Aluno> listaDeAlunos = new ArrayList<>(); //*********** PRIVATE
    private String matricula;

    private int numeroDeAtendimentos = 0;

    public Aluno(String nome, String telefone, String dataNascimento, String cpf) {
        super(nome, telefone, dataNascimento, cpf);
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

        Aluno.getListaDeAlunos().add(new Aluno(nome,telefone,dataNascimento,cpf));
    }
    public static void listarAlunos() {
        if (listaDeAlunos.size() == 0)
            System.out.println("\nSua lista de alunos está vazia!");
        else {
            System.out.println("\n Lista de Alunos:");
            for (int i = 0; i < listaDeAlunos.size(); i++) {
                System.out.println("\n[" + (i+1) + "] " + listaDeAlunos.get(i)); // quando for necessario selecionar um determinado aluno precisa dar -1,pois o index so esta
                                                                        // sendo exibido a partir de 1.
            }
        }
    }
    public  String matricular() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o estado da matricula: " +
                "\n1 Para Ativo" +
                "\n2 Para Irregular" +
                "\n3 Para em Atendimento Pedagógico" +
                "\n4 Para Inativo");
        int status = scanner.nextInt();
        switch (status) {
            case 1:
                matricula = "Ativa";
                break;
            case 2:
                matricula = "Irregular";
                break;
            case 3:
                matricula = "Em atendimento Pedagogico";
                break;
            case 4:
                matricula = "Inativo";
                break;
            default:
                System.out.println("Entrada inválida!");
                matricular();
                break;
        }

        return matricula;
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

    //_____________________________GETTER E SETTER_______________________________________________
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


    //__________________________________TO STRING___________________________________________________

    @Override
    public String toString() {
        super.toString();
        return super.toString()+ "\nStatus da matricula: "+matricula+"\nNumero de atendimentos pedagogicos: "+numeroDeAtendimentos;
    }

}
