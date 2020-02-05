package projetoByteBank;

public class ContaCorrente extends Conta {

    public ContaCorrente(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public boolean saca(double valor) {
        double valorSaque = valor + valor * 0.01;

        return super.saca(valorSaque);
    }

    @Override
    public void deposita(double valor) {
        this.saldo += valor;
    }

}