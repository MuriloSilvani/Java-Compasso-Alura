package ProjetoFuncionario;

public class AutenticacaoUtil {
    private String senha;

    public AutenticacaoUtil(String senha) {
        this.senha = senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean autenticacao(String senha) {
        if (this.senha == senha) {
            return true;
        }
        return false;
    }
}