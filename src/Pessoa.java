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
        return  "Nome: "+nome+
                "\nTelefone: "+telefone+"" +
                "\nData de Nascimento: "+dataNascimento+
                "\nCPF: "+cpf+
                "\nNumero Identificador: "+ID;
    }
}
