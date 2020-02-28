package projetoByteBank;

public class ContaCorrente extends Conta implements Tributavel {

    CalculadorImposto calcImp = new CalculadorImposto();

    public ContaCorrente(int agencia, int numero) {
        super(agencia, numero);
        this.calcImp.getValorImposto(this.getSaldo());
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

    @Override
    public double getValorImposto() {
        return this.calcImp.getValorImposto(this.getSaldo());
    }

}