package com.bancodio.bancodiooo;

public class ContaCorrente extends Conta {


    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("===Extrato conta Corrente===");
        super.imprimirInfosComuns();
    }

}