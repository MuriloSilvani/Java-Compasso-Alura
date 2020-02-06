package ProjetoFuncionario;

class Main {
        public static void main(String[] args) {

                SistemaInterno si = new SistemaInterno();

                Gerente g1 = new Gerente("Gerente", "23556841306", 5000.0, "2222");

                si.autentica(g1);
        }
}