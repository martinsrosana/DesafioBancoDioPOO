package com.bancodio.bancodiooo;

public class CaixaAtendimento {

    public static void main(String [] args){

        Cliente rosana = new Cliente();
        rosana.setNome("Rosana");
        Conta cc = new ContaCorrente(rosana);
        cc.depositar(150);
        Conta cp = new ContaPoupanca(rosana);

        cc.transferir(50, cp);
        cc.imprimirExtrato();
        cp.imprimirExtrato();

    }
}
