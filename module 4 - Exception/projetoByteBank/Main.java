public class Main {
    public static void main(String[] args) {
        System.out.println("\n\n");

        ContaCorrente cc = new ContaCorrente(111, 111);
        cc.deposita(200.0);

        try {
            cc.saca(100.0);
        } catch (SaldoInsuficienteException e) {
            e.printStackTrace();
        }

        System.out.println(cc.getSaldo());

    }
}