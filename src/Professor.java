public class Professor extends Pessoa{
    private String graduacao;
    private String experienciaDev;
    private String estado;


    public Professor(String nome, String telefone, String dataNascimento, String cpf, String graduacao, String experienciaDev, String estado) {
        super(nome, telefone, dataNascimento, cpf);
        this.graduacao = graduacao;
        this.experienciaDev = experienciaDev;
        this.estado = estado;
    }


}
