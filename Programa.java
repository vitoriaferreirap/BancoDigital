package BancoDigital;

import BancoDigital.abstratas.Conta;
import BancoDigital.concretas.AgenciaBancaria;
import BancoDigital.concretas.Banco;
import BancoDigital.concretas.tiposContas.ContaCorrente;
import BancoDigital.concretas.tiposContas.ContaInvestimento;
import BancoDigital.concretas.tiposContas.ContaPoupanca;

public class Programa {
    public static void main(String[] args) {

        /*
         * ARRAYLIST
         * Usar quando:
         * - Você precisa acessar elementos rapidamente pelo índice.
         * - A lista não muda muito (poucas inserções ou remoções).
         * - usa a lista para armazenar e percorrer dados de forma sequencial.
         * Como funciona:
         * - Para acessar um índice, o acesso é direto (muito rápido O(1)).
         * - Para remover ou inserir no meio, precisa mover todos os outros
         * elementos.(O(n))
         * Exemplos práticos:
         * - Lista de clientes exibidos em uma página de cadastro (você só lê e mostra).
         * - Histórico de operações de um usuário, carregado uma vez e exibido.
         * - Lista de produtos exibidos no e-commerce, onde só é feita leitura.
         * - Ranking de usuários por pontuação, que é atualizado raramente.
         */

        // cria banco
        Banco banco1 = new Banco(001);
        Banco banco2 = new Banco(002);

        // cria agencia
        AgenciaBancaria agencia1 = new AgenciaBancaria(01, "AG1");
        AgenciaBancaria agencia2 = new AgenciaBancaria(02, "AG2");
        AgenciaBancaria agencia3 = new AgenciaBancaria(03, "AG3");

        banco1.addAgencia(agencia1);
        banco1.addAgencia(agencia2);
        banco2.addAgencia(agencia3);
        banco1.listarAgencia();
        banco2.listarAgencia();

        // criar conta
        Conta c1 = new ContaCorrente(1, 15.00, "A");
        Conta c2 = new ContaPoupanca(2, 25.00, "B");

        agencia1.addConta(c1);
        agencia2.addConta(c2);

        // saldo atual da conta
        c1.atualizarSaldo();
        c2.atualizarSaldo();

        // deposito
        c1.deposito(20.00);
        c2.deposito(100.00);

        c1.atualizarSaldo();
        c2.atualizarSaldo();

        // calculando simulacao rendimento - polimorfismo via interface
        double res = c2.calcularRendimento(1000.00, 3);
        System.out.println("Rendimento da poupança: " + res);
        System.out.println("-----------------------------------------------");

        // criar conta
        Conta c3 = new ContaInvestimento(1, 0.00, "I1");

        double res2 = c3.calcularRendimento(1000.00, 3);
        System.out.printf("Rendimento do investimento: %.2f", res2);

        /*
         * LINKEDLIST
         * ==========
         *
         * Melhor quando:
         * - Você precisa inserir ou remover elementos com frequência (especialmente no
         * meio).
         * - Você trabalha com dados que entram e saem em sequência (fila, pilha,
         * histórico).
         * - A lista é usada para processar elementos, não para acesso direto por
         * índice.
         *
         * Pior quando:
         * - Você precisa acessar elementos por posição com frequência.
         * - Precisa de muita leitura aleatória (ex: pegar o 5º, 10º ou 100º item toda
         * hora).
         *
         * Como funciona:
         * - Cada elemento aponta para o próximo (e às vezes para o anterior).
         * - Inserir ou remover é rápido, porque só ajusta os ponteiros.
         * - Acessar pelo índice é lento, porque precisa percorrer a lista até chegar
         * lá.
         *
         * Exemplos práticos:
         * - Fila de notificações pendentes para serem exibidas ao usuário.
         * - Processamento de requisições que entram uma atrás da outra (ex: fila de
         * transferências).
         * - Histórico de comandos “desfazer/refazer” em um editor de texto ou sistema
         * de controle.
         * - Sistema de mensagens: cada nova mensagem é adicionada ao fim e a mais
         * antiga removida.
         */

    }
}