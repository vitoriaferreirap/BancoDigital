package BancoDigital.concretas;

import BancoDigital.abstratas.Conta;

// aplicando conceito de herança
public class ContaPoupanca extends Conta {
    // Só quem herda da classe abstrata precisa implementar os métodos abstract.
    // cada tipo de conta implementa esse método de forma diferente

    public ContaPoupanca(int numero, double saldo, String titular) {
        super(numero, saldo, titular);
    }

    // aplicando o conceito de polimorfismo
    @Override
    public void atualizarSaldo() {
        System.out.println("Saldo conta poupanca: " + getSaldo());
    }

}
