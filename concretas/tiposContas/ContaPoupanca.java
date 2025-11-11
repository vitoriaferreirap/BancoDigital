package BancoDigital.concretas.tiposContas;

import BancoDigital.abstratas.Conta;
import BancoDigital.interfaces.Rendimento;

// aplicando conceito de herança
public class ContaPoupanca extends Conta implements Rendimento {
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

    @Override // é obrigatório conceitualmente, porque você está sobrescrevendo um método
    public double calcularRendimento(double valor, int meses) { // regra
        // juros simples
        double juros = (valor * 0.05) * meses; // juros totais
        double montante = valor + juros; // final
        double montanteInicial = valor;

        System.out.println("-----------------------------------------------");
        // ver rendimento mensal juros simples
        System.out.println("Juros por mes Conta Poupanca:");
        for (int i = 1; i <= meses; i++) {
            montanteInicial = montanteInicial + (valor * 0.05);
            System.out.printf("Mes %d rendeu: %.2f\n", i, montanteInicial);
        }

        return montante;
    }

}
