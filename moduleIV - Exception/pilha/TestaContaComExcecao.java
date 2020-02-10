/**
 * TestaContaComExcecao
 */
public class TestaContaComExcecao {

    public static void main(String[] args) {

        Conta c = new Conta();

        try {
            c.deposita();
        } catch (ExceptionCustom e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}