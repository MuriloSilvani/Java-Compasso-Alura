package ProjetoFuncionario;

public abstract class Autenticavel {
    private String senha;

    public boolean autenticacao(String senha) {
        if (this.senha == senha) {
            return true;
        }
        return false;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}