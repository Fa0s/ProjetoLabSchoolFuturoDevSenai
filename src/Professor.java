import java.util.ArrayList;
import java.util.Scanner;

public class Professor extends Pessoa{
    private String graduacao;
    private String experienciaDev="";
    private String estado;

    static ArrayList<Professor> listaDeProfessores = new ArrayList<>();


    public Professor(String nome, String telefone, String dataNascimento, String cpf) {
        super(nome, telefone, dataNascimento, cpf);
        defineFormacaoAcademica();
        defineExperienciaDev();
        defineEstado();
    }
    public static void adicionarProfessor(ArrayList<Professor> professores) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do Professor: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o telefone: ");
        String telefone = scanner.next();

        System.out.println("Digite a data de nascimento: ");
        String dataNascimento = scanner.next();

        System.out.println("Digite o cpf: ");
        String cpf =  scanner.next();

        professores.add(new Professor(nome,telefone,dataNascimento,cpf));
    }

    public String defineFormacaoAcademica(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nSelecione a Graduação do Professor: " +
                "\n1 Graduação incompleta" +
                "\n2 Graduação completa" +
                "\n3 Mestrado" +
                "\n4 Doutorado");
        int graduacao = scanner.nextInt();
        switch (graduacao) {
            case 1:
                this.graduacao = "Graduação incompleta";
                break;
            case 2:
                this.graduacao = "Graduação completa";
                break;
            case 3:
                this.graduacao = "Mestrado";
                break;
            case 4:
                this.graduacao = "Doutorado";
                break;
            default:
                System.out.println("Entrada inválida!");
                defineFormacaoAcademica();
                break;
        }

        return this.graduacao;
    }

    public String defineExperienciaDev(){
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

        return graduacao;
    }

    public String defineEstado(){
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

    public static void ListarProfessoresPorExperienciaDev() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Professor> professoresDev = new ArrayList<>();
        String filtroDev="";
        System.out.println("Selecione a area de desenvolvimento:");
        System.out.println("{ 1 } Front-End");
        System.out.println("{ 2 } Back-End");
        System.out.println("{ 3 } Full-Stack");
        int selecao = scanner.nextInt();

        switch (selecao){
            case 1:
                filtroDev = "Front-end";
                break;
            case 2:
                filtroDev = "Back-End";
                break;
            case 3:
                filtroDev = "Full-Stack";
            default:
                System.out.println("Opção inválida!");
        }
        for (Professor listaDeProfessore : listaDeProfessores) {
            if (filtroDev.equalsIgnoreCase(listaDeProfessore.getExperienciaDev())) {
                professoresDev.add(listaDeProfessore);
            }
        }

        for (Professor professor : professoresDev) {
            System.out.println(professor.toString());
        }
    }


    public static void ListarProfessoresPorAtividade() {
    }

    public String getGraduacao() {
        return graduacao;
    }

    public void setGraduacao(String graduacao) {
        this.graduacao = graduacao;
    }

    public String getExperienciaDev() {
        return experienciaDev;
    }

    public void setExperienciaDev(String experienciaDev) {
        this.experienciaDev = experienciaDev;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public static ArrayList<Professor> getListaDeProfessores() {
        return listaDeProfessores;
    }

    public static void setListaDeProfessores(ArrayList<Professor> listaDeProfessores) {
        Professor.listaDeProfessores = listaDeProfessores;
    }

    @Override
    public String toString() {
        super.toString();
        return super.toString()+"\nGraduação "+graduacao+"\nExperiência em desenvolvimento: "+experienciaDev+"\nEstado: "+estado;
    }

}
