package RevisãoForWhile;

import java.util.Scanner;

public class Ativ45 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in); // Scanner para ler a entrada do usuário

            System.out.print("Digite o valor máximo para a sequência de Fibonacci: ");
            int maxValor = scanner.nextInt(); // Lê o valor máximo informado pelo usuário

            int a = 0, b = 1; // Inicializa os dois primeiros números da sequência de Fibonacci

            System.out.println("Sequência de Fibonacci até " + maxValor + ":");

            // Exibe o primeiro número (0) se o valor máximo for maior ou igual a 0
            if (maxValor >= a) {
                System.out.print(a + " ");
            }

            // Exibe o segundo número (1) se o valor máximo for maior ou igual a 1
            if (maxValor >= b) {
                System.out.print(b + " ");
            }

            // Gera e exibe a sequência de Fibonacci até o valor máximo
            int proximo = a + b; // Soma dos dois primeiros números para gerar o próximo
            while (proximo <= maxValor) {
                System.out.print(proximo + " ");
                a = b; // Atualiza 'a' para o valor de 'b'
                b = proximo; // Atualiza 'b' para o próximo número da sequência
                proximo = a + b; // Calcula o próximo número
            }

            scanner.close(); // Fecha o scanner
        }
    }

