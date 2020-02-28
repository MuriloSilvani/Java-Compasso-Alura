/**
 * Cliente
 */
public class Cliente {
    private String nome;
    private String cpf;
    private String telefone;

    private static int total;

    public int getTotal() {
        return total;
    }

    public boolean validaCpf(String cpf) {

        // int[] arrayCpf = new int[cpf.length()];
        // int total = 0;

        // for (int i = 0; i < arrayCpf.length; i++) {
        // // arrayCpf[i] = Integer.parseInt(cpf.charAt(i));
        // arrayCpf[i] = (int) Integer.parseInt((String) cpf.charAt(i) == "");
        // total += arrayCpf[i];

        // System.out.println("- " + arrayCpf[i]);
        // }
        // System.out.println("total: " + total);

        return true;
    }

    public Cliente(String nome, String cpf, String telefone) {
        total++;
        this.setNome(nome);
        this.setCpf(cpf);
        this.setTelefone(telefone);
        System.out.println("Cliente criado COM sucesso!");
    }

    public void showClient() {
        System.out.println("\tNome: " + this.nome);
        System.out.println("\tCpf: " + this.cpf);
        System.out.println("\tTelefone: " + this.telefone);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        if (validaCpf(cpf)) {
            this.cpf = cpf;
        } else {
            System.out.println("Cpf Inválido!");
        }
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}