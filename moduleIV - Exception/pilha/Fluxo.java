
public class Fluxo {
    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
            metodo1();
        } catch (ArithmeticException | NullPointerException e) {
            String message = e.getMessage();
            System.out.println("Exception " + message);
        }
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        try {
            metodo2();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Fim do metodo1");
    }

    private static void metodo2() throws ExceptionCustom {
        System.out.println("Ini do metodo2");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);

            // Conta c = null;

            // c.deposita();

        }
        System.out.println("Fim do metodo2");
    }
}