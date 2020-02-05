package ProjetoFuncionario;

public class Funcionario {
    private String nome;
    private String cpf;
    // protected = visivel para os filhos (que extendem a class)
    // protected double salario;
    private double salario;

    public double getBonificacao() {
        return this.salario * 0.05;
    }

    public Funcionario(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}