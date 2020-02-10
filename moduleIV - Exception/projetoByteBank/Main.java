package projetoByteBank;

public class Main {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(111, 111);
        cc.deposita(1000);

        cc.saca(100);

    }
}