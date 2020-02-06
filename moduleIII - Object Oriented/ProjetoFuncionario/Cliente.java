package ProjetoFuncionario;

public class Cliente implements Autenticavel {
    private AutenticacaoUtil autenticador;

    public Cliente(String senha) {
        this.autenticador = new AutenticacaoUtil(senha);
    }

    @Override
    public void setSenha(String senha) {
        this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autenticacao(String senha) {
        return this.autenticador.autenticacao(senha);
    }

}