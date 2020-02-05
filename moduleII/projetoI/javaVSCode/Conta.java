/**
 * Conta
 */
public class Conta {
    private double saldo;
    private int agencia;
    private int conta;
    private Cliente titular;
    private static int total;

    public int getTotal() {
        return total;
    }

    public boolean transferir(Conta destino, double valor) {
        if (this.sacar(valor)) {
            destino.depositar(valor);
            System.out.println("Transferencia COM sucesso!");
            return true;
        }
        System.out.println("Transferencia SEM sucesso!");
        return false;
    }

    public boolean sacar(double valor) {
        if (this.getSaldo() >= valor) {
            this.setSaldo(this.getSaldo() - valor);
            System.out.println("Saque COM sucesso!");
            return true;
        }
        System.out.println("Saque SEM sucesso!");
        return false;
    }

    public double depositar(double valor) {
        this.setSaldo(this.getSaldo() + valor);
        System.out.println("Depósito COM sucesso!");
        return this.getSaldo();
    }

    public void showConta() {
        System.out.println("===================");
        System.out.println("Saldo: R$" + this.saldo);
        System.out.println("Agencia: " + this.agencia);
        System.out.println("Conta: " + this.conta);
        System.out.println("Titular: ");
        this.titular.showClient();
        System.out.println("===================");
    }

    public Conta(double saldo, int agencia, int conta, Cliente titular) {
        total++;
        super();
        this.setSaldo(saldo);
        this.setAgencia(agencia);
        this.setConta(conta);
        this.setTitular(titular);
        System.out.println("Conta criada COM sucesso!");
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getConta() {
        return this.conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public Cliente getTitular() {
        return this.titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
}
