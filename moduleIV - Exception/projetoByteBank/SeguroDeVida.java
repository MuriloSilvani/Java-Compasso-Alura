package projetoByteBank;

public class SeguroDeVida implements Tributavel {

	@Override
	public double getValorImposto() {
		return super.saldo * 0.1;
	}

}
