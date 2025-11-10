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

    public String getTutular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    // na classe abstrara usar apenas os metodos comuns para TODAS as contas
    // depositar e sacar
}