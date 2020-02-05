package ProjetoFuncionario;

public class Administrador extends Funcionario {

    @Override
    public double getBonificacao() {
        return super.getSalario() * 0.3;
    }

    public Administrador(String nome, String cpf, double salario, String senha) {
        super(nome, cpf, salario);
    }
}