package ProjetoFuncionario;

class Main {
    public static void main(String[] args) {

        Gerente g1 = new Gerente("Gerente", "23556841306", 5000.0, "2222");
        Funcionario f1 = new Funcionario("Funcionario", "23556841306", 5000.0);
        EditorVideo e1 = new EditorVideo("EditorVideo", "23556841306", 5000.0);

        ControleBonificacao controle = new ControleBonificacao();

        controle.registra(g1);
        System.out.println(controle.getSoma());
        // controle.registra(f1);
        // System.out.println(controle.getSoma());
        // controle.registra(e1);
        // System.out.println(controle.getSoma());

    }
}