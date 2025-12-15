package com.admin.vitoriadev.entity.tiposContas;

import com.admin.vitoriadev.entity.Conta;

public class ContaCorrente extends Conta {
    // Só quem herda da classe abstrata precisa implementar os métodos abstract.

    // chamar o construtor da classe mãe. reutiliza
    public ContaCorrente(int numero, double saldo, String titular) {
        super(numero, saldo, titular);
    }

    // aplicando o conceito de polimorfismo
    @Override
    public void atualizarSaldo() {
        System.out.println("Saldo conta corrente: " + getSaldo());
    }

}
