import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Pedagogo extends Pessoa{
    static ArrayList<Pedagogo> listaDePedagogos = new ArrayList<>();
    private int numeroDeAtendimentos = 0;
    public Pedagogo(String nome, String telefone, String dataNascimento, String cpf) {
        super(nome, telefone, dataNascimento, cpf);
    }
    public static void adicionarPedagogo(ArrayList<Pedagogo> pedagogos){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do Pedagogo: ");
        String nome = scanner.nextLine();

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
                System.out.println("\n[" + (i+1) + "] " + listaDePedagogos.get(i)); // quando for necessario selecionar um determinado aluno precisa dar -1,pois o index so
                                                                                    // esta sendo exibido a partir de 1.
            }
        }
    }

    public static void listarPorAtendimentos() {
        listaDePedagogos.sort((Pedagogo1,Pedagogo2) ->{
            return Pedagogo1.getNumeroDeAtendimentos() < Pedagogo2.getNumeroDeAtendimentos() ? -1 :1;});
        Collections.reverse(listaDePedagogos);
        listarPedagogos();
    }

    public static void atendimentoPedagogico(){     //esta adicionando atendimentos em todos os alunos
        Scanner scanner = new Scanner(System.in);
        System.out.println("Selecione o Aluno a receber o atendimento: ");
        Aluno.listarAlunos();
        int idiceAluno = scanner.nextInt();
        Aluno aluno = Aluno.getListaDeAlunos().get(idiceAluno-1);

        System.out.println("Selecione o pedagogo a realizar o atendimento: ");
        listarPedagogos();
        int idicePedagogo = scanner.nextInt();
        Pedagogo pedagogo = Pedagogo.getListaDePedagogos().get(idicePedagogo-1);

        System.out.println("\nPedagogo "+pedagogo.getNome()+" esta em atendimento pedagógico com o aluno "+aluno.getNome());

        pedagogo.adicionaAtendimento();
        aluno.adicionaAtendimento();
    }

    private void adicionaAtendimento(){
        numeroDeAtendimentos++;
    }
    public static void adicionaAtendimento(Pedagogo pedagogo){
        pedagogo.adicionaAtendimento();
    }
    public static ArrayList<Pedagogo> getListaDePedagogos() {
        return listaDePedagogos;
    }

    public static void setListaDePedagogos(ArrayList<Pedagogo> listaDePedagogos) {
        Pedagogo.listaDePedagogos = listaDePedagogos;
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
        return super.toString()+"\nNumero de atendimentos pedagogicos: "+ numeroDeAtendimentos;
    }
}
