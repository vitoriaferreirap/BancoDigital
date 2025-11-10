package BancoDigital;

// aplicando conceito de herança
public class Poupanca extends Conta {
    // Só quem herda da classe abstrata precisa implementar os métodos abstract.
    // cada tipo de conta implementa esse método de forma diferente

    // aplicando o conceito de polimorfismo
    @Override
    public void atualizarSaldo() {
        // aplicar juros
        setSaldo(getSaldo() * 1.00);
    }

}
