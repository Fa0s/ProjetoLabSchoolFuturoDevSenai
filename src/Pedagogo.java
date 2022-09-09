import java.util.ArrayList;
import java.util.Scanner;

public class Pedagogo extends Pessoa{
    static ArrayList<Pedagogo> listaDePedagogos = new ArrayList<>();
    private static int atendimentos = 0;

    public Pedagogo(String nome, String telefone, String dataNascimento, String cpf) {
        super(nome, telefone, dataNascimento, cpf);
    }

    public static void adicionarPedagogo(ArrayList<Pedagogo> pedagogos){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do Pedagogo: ");
        String nome = scanner.next();

        System.out.println("Digite o telefone: ");
        String telefone = scanner.next();

        System.out.println("Digite a data de nascimento: ");
        String dataNascimento = scanner.next();

        System.out.println("Digite o cpf: ");
        String cpf =  scanner.next();

        pedagogos.add(new Pedagogo(nome,telefone,dataNascimento,cpf));
    }

    public static void listarPedagogos() {
        if (listaDePedagogos.size() == 0)
            System.out.println("\nSua lista de pedagogos está vazia!");
        else {
            System.out.println("\n Lista de Pedagogos:");
            for (int i = 0; i < listaDePedagogos.size(); i++) {
                System.out.println("\n[" + (i+1) + "] " + listaDePedagogos.get(i)); // quando for necessario selecionar um determinado aluno precisa dar -1,pois o index so esta
                // sendo exibido a partir de 1.
            }
        }
    }

    private static int numeroDeAtendimentos = 0;

    public static void atendimentoPedagogico(Aluno aluno){     //esta adicionando atendimentos em todos os alunos
        Scanner scanner = new Scanner(System.in);
        System.out.println("Selecione o Aluno a receber o atendimento: ");
        Aluno.listarAlunos();
        int aluno = scanner.nextInt();

        System.out.println("Selecione o Pedagogo a realizar o atendimento:");
        Pedagogo.listarPedagogos();
        int pedagogo = scanner.nextInt();

        System.out.println("\nPedagogo "+pedagogo+" esta em atendimento pedadógico com o aluno "+aluno);

        atendimentos++;
        Aluno.adicionaAtendimento(aluno);
        Aluno.setMatricula("Em Atendimento Pedagógico");
    }


    public static ArrayList<Pedagogo> getListaDePedagogos() {
        return listaDePedagogos;
    }

    public static void setListaDePedagogos(ArrayList<Pedagogo> listaDePedagogos) {
        Pedagogo.listaDePedagogos = listaDePedagogos;
    }

    public int getAtendimentos() {
        return atendimentos;
    }

    public void setAtendimentos(int atendimentos) {
        this.atendimentos = atendimentos;
    }

    @Override
    public String toString() {
        super.toString();
        return super.toString()+"\nNumero de atendimentos pedagogicos: "+numeroDeAtendimentos;
    }
}
