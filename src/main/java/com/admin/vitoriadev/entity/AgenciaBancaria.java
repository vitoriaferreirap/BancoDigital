package com.admin.vitoriadev.entity;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.annotations.ManyToAny;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class AgenciaBancaria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    // aplicando conceito de encapsulamento - ninguel fora da class pode alterar
    private int numero;
    private String nome;

    // colecao de contas - lista vai armazenar varios obj do tipo conta
    // UMA agencia aponta para varias contas
    @OneToMany(mappedBy = "agencia") // mapeada pelo atributo agencia da classe Conta
    private List<Conta> contas = new ArrayList<>();

    // Esta agência TEM UMA REFERÊNCIA para um banco EXISTENTE.
    // MUITAS agências podem apontar para O MESMO banco.
    // esta agencia pertence a esse banco - ligacao do banco de dados
    @ManyToOne
    @JoinColumn(name = "banco_id") // nasce fk
    private Banco banco;

    // construtor padrao
    public AgenciaBancaria(int numero, String nome) {
        this.numero = numero;
        this.nome = nome;
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

    public List<Conta> getContas() {
        return contas;
    }

    // metodos que manipula o arraylist das contas
    public void addConta(Conta c) {
        contas.add(c);

    }

    public void editarConta() {

    }

    public void removerConta() {

    }

    public void listarContas() {
        for (Conta c : contas) {
            System.out.println("CONTAS: " + c.getTitular());
        }
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
