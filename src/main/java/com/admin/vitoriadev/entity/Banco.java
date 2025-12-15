package com.admin.vitoriadev.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

//conta tem varias agencias
@Entity
public class Banco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

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
