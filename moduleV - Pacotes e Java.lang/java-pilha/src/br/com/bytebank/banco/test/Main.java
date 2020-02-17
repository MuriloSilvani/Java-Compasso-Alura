package br.com.bytebank.banco.test;

import br.com.bytebank.banco.especial.ContaEspecial;
import br.com.bytebank.banco.model.SaldoInsuficienteException;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n\n");

        ContaEspecial cc = new ContaEspecial(111, 111);
        cc.deposita(200.0);

        try {
            cc.saca(100.0);
        } catch (SaldoInsuficienteException e) {
            e.printStackTrace();
        }

        System.out.println(cc.getSaldo());

    }
}