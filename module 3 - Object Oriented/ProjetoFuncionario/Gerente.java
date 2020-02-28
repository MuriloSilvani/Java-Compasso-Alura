package ProjetoFuncionario;

public class Gerente extends Funcionario implements Autenticavel {

    private AutenticacaoUtil autenticador;

    public Gerente(String nome, String cpf, double salario, String senha) {
        super(nome, cpf, salario);
        this.autenticador = new AutenticacaoUtil(senha);
    }

    @Override
    public double getBonificacao() {
        return super.getSalario() * 0.4;
    }

    @Override
    public void setSenha(String senha) {
        this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autenticacao(String senha) {
        return this.autenticador.autenticacao(senha);
    }
}