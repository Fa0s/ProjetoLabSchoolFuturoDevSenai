import java.util.ArrayList;
import java.util.UUID;
public class Pessoa {
    private String nome;
    private String telefone;
    private String dataNascimento;
    private String cpf;
    private String ID;

    public Pessoa(String nome, String telefone, String dataNascimento, String cpf) {
        this.nome = nome;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        geraID();
    }

    private void geraID(){
        ID = UUID.randomUUID().toString();
    }

    public String getNome() {
        return nome;
    }

    public static void exibeTodasAsPessoas() {
        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        listaDePessoas.addAll(Aluno.getListaDeAlunos());
        listaDePessoas.addAll(Professor.getListaDeProfessores());
        listaDePessoas.addAll(Pedagogo.getListaDePedagogos());

        if (listaDePessoas.size() == 0) {
            System.out.println("Não existem pessoas cadastradas");
        } else {
            for (int i = 0; i < listaDePessoas.size(); i++) {
                System.out.println("\n[" + (i + 1) + "] " + listaDePessoas.get(i));
            }
        }
    }

    public static void exibeFuncionarios(){
        ArrayList<Pessoa>listaFuncionarios = new ArrayList<>();
        listaFuncionarios.addAll(Professor.getListaDeProfessores());
        listaFuncionarios.addAll(Pedagogo.getListaDePedagogos());
        if (listaFuncionarios.size() == 0) {
            System.out.println("Não existem funcionários cadastradas");
        } else {
            for (int i = 0; i < listaFuncionarios.size(); i++) {
                System.out.println("\n[" + (i+1) + "] " + listaFuncionarios.get(i));
            }
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return  "| Nome: "+nome+" | Cpf: "+cpf+" |" +" Código: "+ID+" |";

    }
}
