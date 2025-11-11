package BancoDigital;
//Nao é ua lista, classe é um TIPO de obj que vai ser guardado dentro da lista (cada obj tera tudo que ela tera aqui)

//Em POO, quando algo é muito genérico e não faz sentido existir sozinho, ele vira uma classe abstrata.
// pode ser polpança/corrente ou outra

// aplicando conceito de abstração - conta individual
public abstract class Conta {
    // define o que todas as contas têm em comum.
    private int numero;
    private double saldo;
    private String titular;

    public Conta(int numero, double saldo, String titular) {
        this.numero = numero;
        this.saldo = saldo;
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    // métodos abstratos que todo TIPO de conta que herda de Conta deve ter
    // implementado
    // O polimorfismo só faz sentido onde existe herança
    public abstract void atualizarSaldo();
}