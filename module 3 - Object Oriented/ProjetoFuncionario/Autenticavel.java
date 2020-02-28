package ProjetoFuncionario;

public abstract interface Autenticavel {

    public abstract void setSenha(String senha);

    public abstract boolean autenticacao(String senha);

}