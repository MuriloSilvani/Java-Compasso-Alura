package projetoByteBank;

public class Main {
    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente(111, 111);
        cc.deposita(1000);

        System.out.println("Imposto: " + cc.getValorImposto());

        SeguroVida sv = new SeguroVida(1000);

        System.out.println("Imposto: " + sv.getValorImposto());

    }
}