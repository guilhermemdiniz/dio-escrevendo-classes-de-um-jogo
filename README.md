# Jogo de Heróis em Java

Este projeto implementa um sistema de batalha entre heróis de diferentes tipos, como **Mago**, **Ninja**, **Guerreiro** e **Monge**, usando conceitos de **polimorfismo** e **herança**. Cada tipo de herói tem um método específico de ataque e dano, e o usuário pode interagir com o sistema para simular uma batalha.

## Estrutura do Projeto

O projeto é estruturado da seguinte maneira:

```src/
├── Main.java                  # Classe principal para interagir com o usuário e gerenciar o menu de batalha
└── Hero/
    ├── Hero.java              # Classe abstrata base para todos os heróis
    ├── HeroFactory.java       # Fábrica para criação de heróis com base no tipo
    ├── Mago.java              # Classe que implementa o herói Mago
    ├── Guerreiro.java         # Classe que implementa o herói Guerreiro
    ├── Monge.java             # Classe que implementa o herói Monge
    └── Ninja.java             # Classe que implementa o herói Ninja
```


### Classes e Funcionalidades

#### **Hero.java**

- **Classe abstrata** que define os atributos comuns para todos os heróis, como `nome`, `idade`, `tipo` e `dano`.
- Contém o método abstrato `atacar()`, que será implementado nas classes filhas.
  
#### **Mago.java**, **Ninja.java**, **Guerreiro.java**, **Monge.java**

- Cada uma dessas classes **herda** de `Hero` e implementa o método `atacar()` de maneira específica para seu tipo:
  - **Mago**: Ataca com magia, causando dano de 50 pontos.
  - **Ninja**: Ataca com shuriken, causando dano de 40 pontos.
  - **Guerreiro**: Ataca com espada, causando dano de 70 pontos.
  - **Monge**: Ataca com artes marciais, causando dano de 60 pontos.

#### **HeroFactory.java**

- Implementa o padrão de design **Factory**, criando instâncias de heróis com base no tipo fornecido. Ele valida a entrada para garantir que a idade seja positiva e razoável.
  
#### **Main.java**

- **Interação com o usuário**: Permite que o usuário crie heróis, defina sua quantidade de ataques e calcule o dano causado.
- Utiliza o **polimorfismo** ao chamar o método `atacar()` dos heróis criados, independentemente do tipo, e cada herói executa sua própria versão do ataque.
- Inclui **tratamento de exceções** para garantir que entradas inválidas sejam tratadas adequadamente, como idade negativa ou não numérica.

## Conceitos Utilizados

### Polimorfismo

- O método `atacar()` é declarado na classe `Hero` como abstrato e implementado nas subclasses (`Mago`, `Ninja`, `Guerreiro`, `Monge`). Isso permite que cada herói tenha seu próprio comportamento ao atacar, mesmo que todos compartilhem a mesma classe abstrata.

### Herança

- As classes `Mago`, `Ninja`, `Guerreiro` e `Monge` **herdam** de `Hero`, o que significa que elas têm acesso aos atributos e métodos definidos em `Hero` (como `nome`, `tipo`, `dano`) e podem sobrescrever ou estender esses comportamentos conforme necessário.

### Tratamento de Exceções

- A classe `HeroFactory` lida com exceções ao criar heróis, garantindo que o tipo de herói seja válido e que a idade fornecida seja razoável.
- A interação com o usuário em `Main` também inclui tratamento de exceções, como a verificação de idade válida e capturar erros de entrada.

## Como Usar

1. **Compile o projeto**:
   ```bash
   javac src\Hero\*.java src\Main.java

2. **Execute o programa**:
   ```bash
   java -cp src Main

O programa pedirá para você inserir o nome, idade e tipo do herói, além de informar a quantidade de ataques que o herói fará. O dano causado será calculado com base no número de ataques e no tipo de herói.

## Exemplo de Interação ##

```
======================================================================
|                             BATALHA                                |
======================================================================

Nome do Heroi: Goku

Idade: 42

Tipo: Guerreiro

==== ATAQUE ====
Quantidade de ataques (dano por ataque: 70)
3

Goku (guerreiro, 42 anos) atacou usando espada!
Goku (guerreiro, 42 anos) atacou usando espada!
Goku (guerreiro, 42 anos) atacou usando espada!

*=*=*= ATAQUE FINALIZADO =*=*=*
=================================================================
|||||||||||||||||||||
=================================================================
====> DANO CAUSADO: 210
Continuar? 
[1] - SIM
[2] - NÃO

```

