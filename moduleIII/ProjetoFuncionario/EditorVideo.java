package ProjetoFuncionario;

public class EditorVideo extends Funcionario {

    @Override
    public double getBonificacao() {
        return super.getSalario() * 0.15;
    }

    public EditorVideo(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

}