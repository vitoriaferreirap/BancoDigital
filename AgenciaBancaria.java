package BancoDigital;

import java.util.ArrayList;

//agencia te varias contas
public class AgenciaBancaria {
    // aplicando conceito de encapsulamento - ninguel fora da class pode alterar
    private int numero;
    private String nome;

    // colecao de contas - lista vai arazenar varios obj do tipo conta
    private ArrayList<Conta> contas = new ArrayList<>();

    // construtor padrao
    public AgenciaBancaria() {

    }

    // contrutor com args

    // getters e setter - aplicando conceito de encapsulamento
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // metodos que manipula o arraylist das contas
    public void addConta() {

    }

    public void editarConta() {

    }

    public void removerConta() {

    }

    public void listarContas() {

    }

    // classe AgenciaBancaria e Banco usam esses metodos
    // A Agência faz isso olhando para suas contas.
    public void recuperarSaldo() {

    }

    public void contaMaiorSaldo() {

    }

    public void contaMenorSaldo() {

    }

}
