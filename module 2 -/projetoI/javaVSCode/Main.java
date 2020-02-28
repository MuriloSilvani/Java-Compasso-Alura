/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        Cliente pCliente = new Cliente("Murilo Sivani", "12350935906", "49999985044");

        Conta pConta = new Conta(0.0, 01, 01, pCliente);

        pConta.showConta();

    }
}