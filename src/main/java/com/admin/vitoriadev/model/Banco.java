package com.admin.vitoriadev.model;

import java.util.ArrayList;
import java.util.List;

//conta tem varias agencias
public class Banco {
    private int numeroBanco;

    // colecao de agencias bancarias - 1 banco varias agencias
    private List<AgenciaBancaria> agencia = new ArrayList<>();

    public Banco(int numeroBanco) {
        this.numeroBanco = numeroBanco;
    }

    public int getNumeroBanco() {
        return numeroBanco;
    }

    public void setNumeroBanco(int numeroBanco) {
        this.numeroBanco = numeroBanco;
    }

    public List<AgenciaBancaria> getAgencia() {
        return agencia;
    }

    public void addAgencia(AgenciaBancaria a) {
        agencia.add(a);

    }

    public void editarAgencia() {
    }

    public void listarAgencia() {
        System.out.println("Banco: " + getNumeroBanco());
        for (AgenciaBancaria a : agencia) {
            System.out.println("AGENCIAS: " + a.getNome());
        }
    }

    // O Banco faz isso olhando para suas agências, e somando os resultados delas.
    public void recuperarSaldo() {

    }

    public void contaMaiorSaldo() {

    }

    public void contaMenorSaldo() {

    }

}
