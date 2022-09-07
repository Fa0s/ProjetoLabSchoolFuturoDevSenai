public class Pedagogo extends Pessoa{
    private int atendimentos = 0;

    public Pedagogo(String nome, String telefone, String dataNascimento, String cpf) {
        super(nome, telefone, dataNascimento, cpf);
    }

    public void atendimentoPedagogico(Pedagogo x ,Aluno y ){
        System.out.println("\nPedagogo "+x+" esta em atendimento pedadógico com o aluno "+y);
        atendimentos++;
    }



}
