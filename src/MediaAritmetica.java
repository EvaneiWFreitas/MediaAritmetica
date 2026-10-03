/**
 * Programa para calcular a média aritmética de quatro notas.
 *
 * <p>O programa solicita ao usuário quatro notas, calcula a média
 * aritmética e informa se o aluno foi aprovado ou reprovado.</p>
 *
 * <p>Após cada cálculo, o programa pergunta ao usuário se deseja
 * realizar um novo cálculo. O programa continuará executando
 * enquanto o usuário responder "S".</p>
 *
 * @author Evanei William Nascimento de Freitas
 * @version 1.0
 */
import java.util.Scanner;
public class MediaAritmetica {

    public static void main(String[] args) {

        // Cria o objeto Scanner para receber dados digitados pelo usuário.
        Scanner sc = new Scanner(System.in);

        // Declaração das variáveis que armazenarão as notas.
        float n1, n2, n3, n4;

        // Variável que armazenará o resultado da média.
        float media;

        // Define a opção inicial como "s" para iniciar o programa.
        String continuar = "s";

        // Exibe o cabeçalho do programa.
        System.out.println("#################################");
        System.out.println("     PROGRAMA MÉDIA ARITMÉTICA");
        System.out.println("#################################");

        /*
         * O laço while permite que o usuário realize
         * vários cálculos sem precisar executar o programa novamente.
         *
         * O método equalsIgnoreCase() permite aceitar tanto "S"
         * quanto "s".
         */
        while (continuar.equalsIgnoreCase("s")) {

            System.out.println("\n--- NOVO CÁLCULO ---");

            // Solicita a primeira nota.
            System.out.print("Informe a Primeira Nota : ");
            n1 = sc.nextFloat();

            // Solicita a segunda nota.
            System.out.print("Informe a Segunda Nota  : ");
            n2 = sc.nextFloat();

            // Solicita a terceira nota.
            System.out.print("Informe a Terceira Nota : ");
            n3 = sc.nextFloat();

            // Solicita a quarta nota.
            System.out.print("Informe a Quarta Nota   : ");
            n4 = sc.nextFloat();

            /*
             * Calcula a média aritmética.
             *
             * A soma das quatro notas é dividida pela quantidade
             * de notas, que neste caso é 4.
             */
            media = (n1 + n2 + n3 + n4) / 4;

            // Exibe o resultado da média.
            System.out.println("\nA sua Média é: " + media);

            /*
             * Verifica a situação do aluno.
             *
             * Se a média for maior ou igual a 7,
             * o aluno será considerado aprovado.
             */
            if (media >= 7) {

                System.out.println("Você foi APROVADO!");

            } else {

                // Caso a média seja menor que 7, o aluno será reprovado.
                System.out.println("Você foi REPROVADO!");
            }

            /*
             * Pergunta ao usuário se deseja realizar
             * um novo cálculo.
             */
            System.out.print("\nDeseja calcular outra média? (S/N): ");

            // Armazena a resposta do usuário.
            continuar = sc.next();
        }

        // Mensagem exibida quando o programa for encerrado
        System.out.println("\nPrograma encerrado!");
        System.out.println("Obrigado por utilizar o Programa Média Aritmetica.");
        System.out.println("Programa Desenvolvido por: Engenheiro de Software, Evanei Freitas.");

        // Fecha o Scanner e libera o recurso utilizado.
        sc.close();
    }
}