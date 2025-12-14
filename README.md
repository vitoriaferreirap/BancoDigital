# BancoDigital

## Descrição

O **BancoDigital** é um projeto em desenvolvimento que iniciou como uma **aplicação Java de console**, com o objetivo de praticar **Java puro**, estruturas de dados, algoritmos e Programação Orientada a Objetos, **sem o uso de frameworks**.

Após a consolidação dessa base, o projeto entrou em uma nova fase, sendo evoluído para uma **API REST**, com foco em organização, escalabilidade e boas práticas de desenvolvimento.

---

## Objetivos do Projeto

- Praticar Java puro antes do uso de frameworks
- Aplicar conceitos de Programação Orientada a Objetos
- Utilizar estruturas de dados para organizar e manipular informações
- Implementar regras de negócio do domínio bancário
- Evoluir a aplicação de **console para API REST**
- Aplicar boas práticas de arquitetura

---

## Conceitos Aplicados (Java Puro)

- Classes abstratas e concretas  
- Interfaces  
- Herança  
- Polimorfismo  
- Encapsulamento  

### Estruturas de Dados

- Uso de `List` e `ArrayList` para:
  - Armazenar contas bancárias
  - Gerenciar usuários e operações
  - Percorrer e manipular dados do sistema

### Regras de Negócio

- Implementação de juros simples  
- Implementação de juros compostos  
- Uso de interfaces para definição de comportamentos financeiros  

---

## Evolução Técnica

- Aplicação inicial em **console (Java puro)**
- Adoção do **Maven** para gerenciamento e organização do projeto
- Reestruturação de pacotes
- Aplicação do padrão arquitetural **MVC**
- Criação de uma **API REST com Spring Boot**
- Integração com **PostgreSQL** utilizando **JPA**

---

## Tecnologias Utilizadas

- Java 17  
- Maven  
- Spring Boot  
- Spring Web  
- Spring Data JPA  
- PostgreSQL  
- Git e GitHub  

---

## Como Executar o Projeto

### Pré-requisitos

- Java 17
- Maven

### Executar a aplicação

```bash
mvn spring-boot:run
