package com.admin.vitoriadev.entity.tiposContas;

import com.admin.vitoriadev.interfaces.Rendimento;
import com.admin.vitoriadev.entity.Conta;
import jakarta.persistence.Entity;

// aplicando conceito de herança
@Entity
public class ContaPoupanca extends Conta implements Rendimento {
    // Só quem herda da classe abstrata precisa implementar os métodos abstract.
    // cada tipo de conta implementa esse método de forma diferente

    private double totalRendimentoPP;

    public ContaPoupanca(int numero, double saldo, String titular) {
        super(numero, saldo, titular);
    }

    // aplicando o conceito de polimorfismo
    @Override
    public void atualizarSaldo() {
        System.out.println("Saldo conta poupanca: " + getSaldo());
    }

    @Override // é obrigatório conceitualmente, porque você está sobrescrevendo um método
    public double calcularRendimento(int meses) { // regra
        // juros simples
        return (getSaldo() * 0.05) * meses;
    }

    // aplica o rendimento calculado e altera o estado da entidade (persistido pelo
    // JPA)
    public void aplicarRendimentoPP(double rendimentoCalculadoPP) {
        this.totalRendimentoPP += rendimentoCalculadoPP;
        // novo saldo da conta POUPANCA
        setSaldo(getSaldo() + rendimentoCalculadoPP);
    }

    public double getTotalRendimentoPP() {
        return totalRendimentoPP;
    }

}
