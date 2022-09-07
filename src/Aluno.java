import java.util.Scanner;
public class Aluno extends Pessoa {
    private String matricula;
    public Aluno(String nome, String telefone, String dataNascimento, String cpf) {
        super(nome, telefone, dataNascimento, cpf);
        matricular();
    }
    public void matricular() {
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


        }
    }
@Override
    public String toString() {
        super.toString();
        return super.toString()+ "\nA matricula do aluno "+getNome()+" está: "+matricula;
    }
}