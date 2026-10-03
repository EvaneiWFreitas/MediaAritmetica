# 📊 Programa Média Aritmética

Programa desenvolvido em **Java** para calcular a média aritmética de quatro notas, informar a média obtida e verificar se o aluno 
foi **aprovado ou reprovado**.

O programa também permite realizar **vários cálculos consecutivos**, permanecendo em execução até que o usuário escolha encerrá-lo.

---

## 📌 Sobre o Projeto

Este projeto foi desenvolvido como um exercício de aprendizagem da linguagem **Java**, com o objetivo de praticar conceitos básicos de 
programação, entrada de dados, operações matemáticas, estruturas condicionais e estruturas de repetição.

A cada execução, o programa solicita quatro notas:

* Primeira nota;
* Segunda nota;
* Terceira nota;
* Quarta nota.

Depois disso, calcula a média aritmética:

**Média = (Nota 1 + Nota 2 + Nota 3 + Nota 4) / 4**

O programa considera:

* **Média maior ou igual a 7:** Aprovado;
* **Média menor que 7:** Reprovado.

Após apresentar o resultado, o usuário pode escolher se deseja realizar um novo cálculo.

---

## 🎯 Objetivos

O projeto tem como principais objetivos praticar:

* Declaração de variáveis;
* Tipos de dados `float` e `String`;
* Entrada de dados utilizando `Scanner`;
* Operadores aritméticos;
* Estrutura condicional `if/else`;
* Estrutura de repetição `while`;
* Comparação de valores;
* Uso do método `equalsIgnoreCase()`;
* Organização de código Java;
* Documentação utilizando **JavaDoc**.

---

## 🛠️ Tecnologias Utilizadas

| Tecnologia | Utilização                       |
| ---------- | -------------------------------- |
| ☕ Java     | Linguagem de programação         |
| 📥 Scanner | Entrada de dados pelo teclado    |
| 🔄 while   | Repetição dos cálculos           |
| 🔀 if/else | Verificação da situação do aluno |
| 📚 JavaDoc | Documentação do código           |

---

## 📂 Estrutura do Projeto

```text
MediaAritmetica/
│
├── src/
│   └── MediaAritmetica.java
│
└── README.md
```

---

## 💻 Código Principal

```java
import java.util.Scanner;

/**
 * Programa para calcular a média aritmética de quatro notas.
 *
 * @author Evanei William Nascimento de Freitas
 * @version 1.0
 */
public class MediaAritmetica {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float n1, n2, n3, n4;
        float media;

        String continuar = "s";

        System.out.println("#################################");
        System.out.println("     PROGRAMA MÉDIA ARITMÉTICA");
        System.out.println("#################################");

        while (continuar.equalsIgnoreCase("s")) {

            System.out.println("\n--- NOVO CÁLCULO ---");

            System.out.print("Informe a Primeira Nota : ");
            n1 = sc.nextFloat();

            System.out.print("Informe a Segunda Nota  : ");
            n2 = sc.nextFloat();

            System.out.print("Informe a Terceira Nota : ");
            n3 = sc.nextFloat();

            System.out.print("Informe a Quarta Nota   : ");
            n4 = sc.nextFloat();

            media = (n1 + n2 + n3 + n4) / 4;

            System.out.println("\nA sua Média é: " + media);

            if (media >= 7) {
                System.out.println("Você foi APROVADO!");
            } else {
                System.out.println("Você foi REPROVADO!");
            }

            System.out.print("\nDeseja calcular outra média? (S/N): ");
            continuar = sc.next();
        }

        System.out.println("\nPrograma encerrado. Obrigado por utilizar!");

        sc.close();
    }
}
```

---

## ▶️ Como Executar

### 1. Verifique se o Java está instalado

Abra o terminal e execute:

```bash
java -version
```

Também é possível verificar o compilador:

```bash
javac -version
```

---

### 2. Compile o programa

No diretório onde está o arquivo `MediaAritmetica.java`, execute:

```bash
javac MediaAritmetica.java
```

Será criado o arquivo:

```text
MediaAritmetica.class
```

---

### 3. Execute o programa

Depois da compilação:

```bash
java MediaAritmetica
```

---

## 🖥️ Exemplo de Execução

```text
#################################
     PROGRAMA MÉDIA ARITMÉTICA
#################################

--- NOVO CÁLCULO ---

Informe a Primeira Nota : 8
Informe a Segunda Nota  : 7
Informe a Terceira Nota : 9
Informe a Quarta Nota   : 10

A sua Média é: 8.5
Você foi APROVADO!

Deseja calcular outra média? (S/N): S

--- NOVO CÁLCULO ---

Informe a Primeira Nota : 5
Informe a Segunda Nota  : 6
Informe a Terceira Nota : 4
Informe a Quarta Nota   : 5

A sua Média é: 5.0
Você foi REPROVADO!

Deseja calcular outra média? (S/N): N

Programa encerrado. Obrigado por utilizar!
```

---

## 🔄 Funcionamento do `while`

Uma das principais características do programa é permitir que o usuário faça vários cálculos.

Isso é possível através da estrutura:

```java
while (continuar.equalsIgnoreCase("s")) {
```

Enquanto a variável `continuar` tiver o valor `s` ou `S`, o programa continuará executando.

Ao final de cada cálculo, o usuário informa:

```text
Deseja calcular outra média? (S/N):
```

Se responder:

```text
S
```

um novo cálculo será iniciado.

Se responder:

```text
N
```

o `while` será encerrado e o programa terminará.

---

## 🧮 Exemplo do Cálculo

Considerando as seguintes notas:

```text
Nota 1 = 8
Nota 2 = 7
Nota 3 = 9
Nota 4 = 10
```

O cálculo será:

```text
(8 + 7 + 9 + 10) / 4

34 / 4

8.5
```

Portanto:

```text
Média = 8.5
Situação = APROVADO
```

---

## 📚 Conceitos de Java Praticados

### Variáveis

```java
float n1, n2, n3, n4;
float media;
```

Utilizadas para armazenar as notas e o resultado da média.

### Entrada de dados

```java
Scanner sc = new Scanner(System.in);
```

Permite receber informações digitadas pelo usuário.

### Operação matemática

```java
media = (n1 + n2 + n3 + n4) / 4;
```

Realiza o cálculo da média aritmética.

### Estrutura condicional

```java
if (media >= 7) {
    System.out.println("Você foi APROVADO!");
} else {
    System.out.println("Você foi REPROVADO!");
}
```

Verifica a situação do aluno.

### Estrutura de repetição

```java
while (continuar.equalsIgnoreCase("s")) {
```

Permite executar vários cálculos sem reiniciar o programa.

---

## 🚀 Possíveis Melhorias Futuras

O projeto pode evoluir posteriormente com novos recursos, como:

* [ ] Validar se as notas estão entre `0` e `10`;
* [ ] Impedir que o usuário digite letras onde são esperados números;
* [ ] Validar a opção `S/N`;
* [ ] Permitir uma quantidade variável de notas;
* [ ] Calcular a média de vários alunos;
* [ ] Exibir a maior e a menor nota;
* [ ] Criar métodos para organizar melhor o código;
* [ ] Criar uma interface gráfica;
* [ ] Armazenar os resultados em um arquivo;
* [ ] Criar testes automatizados.

---

## 👨‍💻 Autor

**Evanei William Nascimento de Freitas**
**Formado em Eng. de Software**
**Pós Graduando em: CYBERCRIME E CYBERSECURITY: PREVENÇÃO E INVESTIGAÇÃO DE CRIMES DIGITAIS**
Projeto desenvolvido para fins de **estudo e prática da linguagem Java**.

---

## 📄 Licença

Este projeto foi desenvolvido para fins educacionais e pode ser utilizado como material de estudo e prática de programação.

---

⭐ **Projeto desenvolvido como parte da jornada de aprendizado em Java.**
