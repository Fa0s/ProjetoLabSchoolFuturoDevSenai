import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Aluno.adicionarAluno(Aluno.getListaDeAlunos());
        Aluno.adicionarAluno(Aluno.getListaDeAlunos());

        Aluno.listarAlunos();


        Pedagogo.adicionarPedagogo(Pedagogo.getListaDePedagogos());
        Pedagogo.adicionarPedagogo(Pedagogo.getListaDePedagogos());

        Pedagogo.listarPedagogos();

        Pedagogo.atendimentoPedagogico();

        Aluno.listarAlunos();
        Pedagogo.listarPedagogos();
        //Menu.menuPrincipal();

        }
}
