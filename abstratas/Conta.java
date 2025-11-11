package BancoDigital.abstratas;
//Nao é ua lista, classe é um TIPO de obj que vai ser guardado dentro da lista (cada obj tera tudo que ela tera aqui)

//Em POO, quando algo é muito genérico e não faz sentido existir sozinho, ele vira uma classe abstrata.
// pode ser polpança/corrente ou outra

// aplicando conceito de abstração - conta individual
public abstract class Conta {
    // define o que todas as contas têm em comum.
    private int numeroConta;
    private double saldo;
    private String titular;

    public Conta(int numeroConta, double saldo, String titular) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.titular = titular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
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

    // metodo concreto pois, filhos teram o mesmo comportamento
    public void deposito(double d) {
        setSaldo(getSaldo() + d);
        System.out.println("O saldo da conta: " + getNumeroConta() + " apos deposito é " + getSaldo());
    }

    public void sacar(double s) {
        setSaldo(getSaldo() - s);
        System.out.println("O saldo da conta: " + getNumeroConta() + " apos saque é " + getSaldo());

    }
}