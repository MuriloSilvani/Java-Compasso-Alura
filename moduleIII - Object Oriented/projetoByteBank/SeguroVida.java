package projetoByteBank;

/**
 * SeguroVida
 */
public class SeguroVida implements Tributavel {

    private double custo;
    private CalculadorImposto calcImp = new CalculadorImposto();

    public SeguroVida(double custo) {
        this.custo = custo;
        this.calcImp.getValorImposto(this.custo);
    }

    @Override
    public double getValorImposto() {
        return this.calcImp.getValorImposto(this.custo);
    }

}