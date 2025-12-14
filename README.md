# BancoDigital

Projeto em **evolução contínua**, desenvolvido com foco no aprendizado e na aplicação prática de **Java**, iniciando com Java puro e evoluindo gradualmente para uma arquitetura moderna com **Maven, Spring Boot, JPA e PostgreSQL**.

---

## Sobre o projeto

O **BancoDigital** é uma aplicação que simula um sistema bancário, criada inicialmente **sem o uso de frameworks**, com o objetivo de consolidar os fundamentos da **Programação Orientada a Objetos (POO)** antes de avançar para tecnologias mais robustas.

A cada etapa, o projeto vem sendo **refatorado e modernizado**, mantendo o código existente e evoluindo sua arquitetura.

---

## Fase inicial — Java puro

Na primeira etapa do projeto, foram aplicados conceitos fundamentais de POO, incluindo:

- Classes abstratas e concretas  
- Interfaces  
- Herança  
- Polimorfismo  
- Encapsulamento  

Além disso, foram implementadas **regras de negócio bancárias**, como:

- Tipos de contas (corrente, poupança, investimento)
- Cálculo de **juros simples** e **juros compostos**
- Uso de interfaces para abstração de comportamentos

Essa fase teve como foco a **base conceitual do Java**, sem dependência de frameworks.

---

## Evolução do projeto

Com a base consolidada, o projeto entrou em uma nova fase, onde passou por melhorias estruturais e organizacionais:

- Integração  do **Maven** para:
  - Gerenciamento de dependências
  - Padronização do build
- Reorganização e renomeação de pacotes
- Aplicação da arquitetura **MVC (Model, View, Controller)**
- Separação clara de responsabilidades entre camadas

---

## Fase atual — Spring Boot & persistência

Atualmente, o projeto está sendo evoluído para um cenário mais próximo do mercado, com:

- **Spring Boot**
  - Inicialização e configuração da aplicação
  - Organização das camadas
- **Spring Data JPA**
  - Mapeamento de entidades
  - Persistência de dados
- **PostgreSQL**
  - Banco de dados relacional utilizado no projeto

O foco atual é garantir uma **integração correta entre aplicação e banco de dados**, respeitando boas práticas e organização do código.

---

## Próximos passos

- Finalizar a configuração do PostgreSQL
- Criar e ajustar entidades JPA
- Implementar repositórios e serviços
- Criar endpoints REST
- Evoluir regras de negócio
- Adicionar validações e tratamento de erros
- Implementar novas funcionalidades

---

## Tecnologias utilizadas

- Java 17  
- Maven  
- Spring Boot  
- Spring Data JPA  
- PostgreSQL  
- Git & GitHub  

---

## ▶ Como executar o projeto

### Pré-requisitos
- Java 17
- Maven
- PostgreSQL

### Executar a aplicação
```bash
mvn clean spring-boot:run
