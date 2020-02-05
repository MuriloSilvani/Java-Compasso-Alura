package ProjetoFuncionario;

public class Gerente extends Funcionario {

    @Override
    public double getBonificacao() {
        return super.getSalario() * 0.4;
    }

    public Gerente(String nome, String cpf, double salario, String senha) {
        super(nome, cpf, salario);
    }

}