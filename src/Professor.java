import java.util.ArrayList;
import java.util.Scanner;

public class Professor extends Pessoa{
    private static String formacaoAcademica = "";
    private static String experienciaDev = "";
    private static String estado = "";

    static ArrayList<Professor> listaDeProfessores = new ArrayList<>();


    public Professor(String nome, String telefone, String dataNascimento, String cpf) {
        super(nome, telefone, dataNascimento, cpf);
        this.formacaoAcademica = formacaoAcademica;
        this.experienciaDev = experienciaDev;
        this.estado = estado;
        defineFormacaoAcademica();
        defineExperienciaDev();
        defineEstado();
    }
    public static void adicionarProfessor(ArrayList<Professor> professores) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do Professor: ");
        String nome = scanner.next();

        System.out.println("Digite o telefone: ");
        String telefone = scanner.next();

        System.out.println("Digite a data de nascimento: ");
        String dataNascimento = scanner.next();

        System.out.println("Digite o cpf: ");
        String cpf =  scanner.next();

        professores.add(new Professor(nome,telefone,dataNascimento,cpf));
    }

    public static String defineFormacaoAcademica(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nSelecione a Graduação do Professor: " +
                "\n1 Graduação incompleta" +
                "\n2 Graduação completa" +
                "\n3 Mestrado" +
                "\n4 Doutorado");
        int graduacao = scanner.nextInt();
        switch (graduacao) {
            case 1:
                formacaoAcademica = "Graduação incompleta";
                break;
            case 2:
                formacaoAcademica = "Graduação completa";
                break;
            case 3:
                formacaoAcademica = "Mestrado";
                break;
            case 4:
                formacaoAcademica = "Doutorado";
                break;
            default:
                System.out.println("Entrada inválida!");
                defineFormacaoAcademica();
                break;
        }

        return formacaoAcademica;
    }

    public static String defineExperienciaDev(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nSelecione a experiência em desenvolvimento do Professor: " +
                "\n1 Front-End" +
                "\n2 Back-End" +
                "\n3 Full-Stack");
        int experiencia = scanner.nextInt();
        switch (experiencia) {
            case 1:
                experienciaDev = "Front-End";
                break;
            case 2:
                experienciaDev = "Back-End";
                break;
            case 3:
                experienciaDev = "Full-Stack";
                break;
            default:
                System.out.println("Entrada inválida!");
                defineExperienciaDev();
                break;
        }

        return formacaoAcademica;
    }

    public static String defineEstado(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nSelecione a estado do Professor: " +
                "\n1 Ativo" +
                "\n2 Inativo");
        int menuEstado = scanner.nextInt();
        switch (menuEstado) {
            case 1:
                estado = "Ativo";
                break;
            case 2:
                estado = "Inativo";
                break;
            default:
                System.out.println("Entrada inválida!");
                defineEstado();
                break;
        }

        return estado;
    }


    public static void listarProfessores() {
        if (listaDeProfessores.size() == 0)
            System.out.println("\nSua lista de professores está vazia!\n");
        else {
            System.out.println("\n Lista de Professores: ");
            for (int i = 0; i < listaDeProfessores.size(); i++) {
                System.out.println("\n[" + (i+1) + "] " + listaDeProfessores.get(i));
            }
        }
    }

    public static void ListarProfessoresPorExperiencia() {
    }

    public static void ListarProfessoresPorAtividade() {
    }
}
