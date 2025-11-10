package BancoDigital;

public class Corrente extends Conta {
    // Só quem herda da classe abstrata precisa implementar os métodos abstract.

    // aplicando o conceito de polimorfismo
    @Override
    public void atualizarSaldo() {
        // aplicar juros
        setSaldo(getSaldo() - 10);
    }
}
