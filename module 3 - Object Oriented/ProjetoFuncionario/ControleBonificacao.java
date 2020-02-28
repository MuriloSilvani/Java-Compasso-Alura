package ProjetoFuncionario;

public class ControleBonificacao {

    public double calculaBonificacao(Funcionario f) {
        return f.getBonificacao();
    }

    public double calculaSalario(Funcionario f) {
        return f.getBonificacao() + f.getSalario();
    }

}