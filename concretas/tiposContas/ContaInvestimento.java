package BancoDigital.concretas.tiposContas;

import BancoDigital.abstratas.Conta;
import BancoDigital.interfaces.Rendimento;

public class ContaInvestimento extends Conta implements Rendimento {

    public ContaInvestimento(int numero, double saldo, String titular) {
        super(numero, saldo, titular);
    }

    // aplicando o conceito de polimorfismo
    @Override
    public void atualizarSaldo() {
        System.out.println("Saldo conta investimento: " + getSaldo());
    }

    @Override
    public double calcularRendimento(double valor, int meses) {
        // jutos compostos usando metodo potencia
        double montanteFinal = valor * Math.pow((1 + 0.05), meses);
        double montanteInicial = valor;

        System.out.println("-----------------------------------------------");
        System.out.println("Juros por mes Conta Investimento:");

        // ver rendimento mensal juros copostos
        for (int i = 1; i <= meses; i++) {
            montanteInicial = montanteInicial + montanteInicial * 0.05;
            System.out.printf("Mes %d rendeu: %.2f\n", i, montanteInicial);
        }

        return montanteFinal;
    }

}
