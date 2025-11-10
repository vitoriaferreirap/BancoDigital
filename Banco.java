package BancoDigital;

import java.util.ArrayList;

//conta tem varias agencias
public class Banco {
    private int numero;

    // colecao de agencias bancarias
    private ArrayList<AgenciaBancaria> agencia = new ArrayList<>();

    public Banco() {

    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void addAgencia() {

    }

    public void editarAgencia() {
    }

    public void listarAgencia() {
    }

    // O Banco faz isso olhando para suas agências, e somando os resultados delas.
    public void recuperarSaldo() {

    }

    public void contaMaiorSaldo() {

    }

    public void contaMenorSaldo() {

    }

}
