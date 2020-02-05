package projetoByteBank;

public class Main {
    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente(111, 111);
        cc.deposita(100);

        ContaPoupanca cp = new ContaPoupanca(111, 222);
        cp.deposita(100);

        cc.transfere(10, cp);

        System.out.println(cc.getNumero() + ": " + cc.getSaldo());
        System.out.println(cp.getNumero() + ": " + cp.getSaldo());
    }
}