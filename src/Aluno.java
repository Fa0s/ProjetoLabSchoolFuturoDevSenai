import java.util.ArrayList;
import java.util.Scanner;
public class Aluno extends Pessoa {
    static ArrayList <Aluno> listaDeAlunos = new ArrayList<>();
    private static String matricula;

    private int numeroDeAtendimentos = 0;

    public Aluno(String nome, String telefone, String dataNascimento, String cpf) {
        super(nome, telefone, dataNascimento, cpf);
        matricular();
    }
    public static void adicionarAluno(ArrayList<Aluno> alunos){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do Aluno: ");
        String nome = scanner.next();

        System.out.println("Digite o telefone: ");
        String telefone = scanner.next();

        System.out.println("Digite a data de nascimento: ");
        String dataNascimento = scanner.next();

        System.out.println("Digite o cpf: ");
        String cpf =  scanner.next();

        alunos.add(new Aluno(nome,telefone,dataNascimento,cpf));
    }
    public static void listarAlunos(ArrayList<Aluno> alunos) {
        if (alunos.size() == 0)
            System.out.println("\nSua lista de alunos está vazia!");
        else {
            System.out.println("\n Lista de Alunos:");
            for (int i = 0; i < alunos.size(); i++) {
                System.out.println("[" + (i+1) + "] " + alunos.get(i)); // quando for necessario selecionar um determinado aluno precisa dar -1,pois o index so esta
                                                                        // sendo exibido a partir de 1.
            }
        }
    }
    public static void matricular() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o estado da matricula: " +
                "\n1 Para Ativo" +
                "\n2 Para Irregular" +
                "\n3 Para em Atendimento Pedagógico" +
                "\n4 Para Inativo");
        int status = scanner.nextInt();
        switch (status) {
            case 1:
                matricula = "ativa";
                break;
            case 2:
                matricula = "irregular";
                break;
            case 3:
                matricula = "Em atendimento pedagógico";
                break;
            case 4:
                matricula = "inativa";
                break;
            default:
                System.out.println("Entrada inválida!");
                matricular();
                break;
        }
    }
@Override
    public String toString() {
        super.toString();
        return super.toString()+ "\nA matricula do aluno "+getNome()+" está: "+matricula+"O numero de atendimentos pedagogicos do aluno "+getNome()+"é: "+numeroDeAtendimentos;
    }



    public static ArrayList<Aluno> getListaDeAlunos() {
        return listaDeAlunos;
    }

    public static void setListaDeAlunos(ArrayList<Aluno> listaDeAlunos) {
        Aluno.listaDeAlunos = listaDeAlunos;
    }

    public static String getMatricula() {
        return matricula;
    }

    public static void setMatricula(String matricula) {
        Aluno.matricula = matricula;
    }
}