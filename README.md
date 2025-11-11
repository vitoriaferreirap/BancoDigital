# BancoDigital (Projeto didático em Java)

Descrição
---------
Projeto didático para aprofundar conceitos de Programação Orientada a Objetos (POO) em Java, por meio da construção de um pequeno sistema bancário. O foco é entender e aplicar abstração, encapsulamento, herança, polimorfismo, classes abstratas, interfaces e organização de código. A estrutura do projeto foi separada com o objetivo de facilitar o aprendizado e a compreensão dos papéis de cada tipo de classe. Além de praticar POO, o projeto tem o objetivo específico de estudar mais a fundo estruturas de dados (listas, filas, pilhas, mapas, conjuntos) e entender onde e quando usar cada uma em aplicações reais.

Funcionalidades / Objetivos
---------------------------
- Modelar entidades básicas: Banco, Agência, Conta (ContaCorrente, ContaPoupanca, ContaInvestimento).  
- Aplicar encapsulamento com atributos privados e getters/setters.  
- Usar classes abstratas para comportamento comum (ex.: Conta).  
- Demonstrar polimorfismo ao manipular contas por meio do tipo base.  
- Estudar uso de interfaces (ex.: Rendimento) para contratos de comportamento.  
- Explorar estruturas de dados e decisões de uso (ArrayList vs LinkedList, HashMap, etc.).

Conceitos abordados
-------------------
- Abstração: representação simplificada de Banco, Agência e Conta.  
- Encapsulamento: atributos privados + getters/setters.  
- Herança: ContaCorrente e ContaPoupanca estendem Conta.  
- Polimorfismo: tratar diferentes tipos de Conta via referência comum.  
- Classes abstratas e interfaces: separação de comportamentos genéricos e específicos.  
- Estruturas de dados: quando usar ArrayList, LinkedList, filas, pilhas e mapas conforme necessidades de acesso e desempenho.

Estudo de Estruturas de Dados (resumo)
--------------------------------------
- ArrayList: acesso por índice rápido (O(1)). Bom para leitura frequente e poucas inserções/remoções no meio.  
- LinkedList: inserção/remoção no meio/começo eficiente; acesso por índice lento (O(n)). Bom para filas e históricos encadeados.  
- HashMap: acesso por chave muito rápido; ideal para busca/associação por chave.  
- HashSet/TreeSet: coleções de elementos únicos; TreeSet ordena por chave/valor.  
- Escolha baseada em complexidade: priorizar a estrutura que oferece as operações mais frequentes com melhor custo.

Funcionalidades / Objetivos
---------------------------
- Modelar entidades básicas: Banco, Agência, Contas.
- Aplicar encapsulamento com atributos privados e getters/setters.
- Usar classes abstratas para comportamento comum (ex.: Conta).
- Demonstrar polimorfismo ao manipular contas por meio do tipo base.
- Estudar uso de interfaces (ex.: Rendiento) para contratos de comportamento.

