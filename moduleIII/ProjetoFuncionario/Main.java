package ProjetoFuncionario;

class Main {
        public static void main(String[] args) {

                Gerente g1 = new Gerente("Gerente", "23556841306", 5000.0, "2222");
                Administrador a1 = new Administrador("Administrador", "23556841306", 5000.0, "3333");

                SistemaInterno si = new SistemaInterno();

                // si.autentica(g1);
                // si.autentica(a1);
        }
}