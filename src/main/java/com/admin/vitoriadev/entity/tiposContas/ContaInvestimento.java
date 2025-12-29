package com.admin.vitoriadev.entity.tiposContas;

import jakarta.persistence.Entity;

import com.admin.vitoriadev.interfaces.Rendimento;
import com.admin.vitoriadev.entity.Conta;

@Entity
public class ContaInvestimento extends Conta implements Rendimento {

    private double totalRendimento;

    public ContaInvestimento(int numero, double saldo, String titular) {
        super(numero, saldo, titular);
    }

    // aplicando o conceito de polimorfismo
    @Override
    public void atualizarSaldo() {
        System.out.println("Saldo conta investimento: " + getSaldo());
    }

    @Override
    // regra de negocio
    public double calcularRendimento(int meses) {
        // saldo inicial mais o juros
        double montanteFinal = getSaldo() * Math.pow((1 + 0.05), meses);

        // apenas o juros composto
        double rendimento = montanteFinal - getSaldo();

        return rendimento;
    }

    // aplica o rendimento calculado e altera o estado da entidade (persistido pelo
    // JPA)
    public void aplicarRendimento(double rendimentoCalculado) {
        this.totalRendimento += rendimentoCalculado;
        // novo saldo da conta investimento
        setSaldo(getSaldo() + rendimentoCalculado);
    }

    public double getTotalRendimento() {
        return totalRendimento;
    }

}
