/**
 * TesteConexao
 */
public class TesteConexao {

    public static void main(String[] args) {
        System.out.println("\n\n");

        try (Conexao conexao = new Conexao()) {
            conexao.leDados();

        }
    }
}