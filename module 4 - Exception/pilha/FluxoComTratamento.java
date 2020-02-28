public class FluxoComTratamento {

    public static void main(String[] args) {
        System.out.println("Início do main");
        try {
            metodo1();
        } catch (ExceptionCustom e) {
            e.printStackTrace();
        }
        System.out.println("Fim do main");
    }

    private static void metodo1() throws ExceptionCustom {
        System.out.println("Início do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() throws ExceptionCustom {
        System.out.println("Ini do metodo2");
        throw new ExceptionCustom("Deu erro");

        // System.out.println("Fim do metodo2");
    }
}