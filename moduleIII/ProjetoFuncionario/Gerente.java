package ProjetoFuncionario;

public class Gerente extends Funcionario {
    private String senha;

    public double getBonificacao() {
        return super.getSalario() * 0.1;
    }

    public Gerente(String nome, String cpf, double salario, String senha) {
        super(nome, cpf, salario);
        this.senha = senha;
    }

    public boolean autenticacao(String senha) {
        if (this.senha == senha) {
            return true;
        }
        return false;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}