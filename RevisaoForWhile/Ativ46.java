package RevisãoForWhile;

import java.util.Scanner;

public class Ativ46 {
    public static void main(String[] args) {
                  Scanner scanner = new Scanner(System.in); // Scanner para ler a entrada do usuário

                System.out.print("Digite um número: ");
                int numero = scanner.nextInt(); // Lê o número informado pelo usuário

                int i = 1; // Inicializa o contador para os múltiplos
                System.out.println("Os primeiros 10 múltiplos de " + numero + " são:");

                do {
                    System.out.println(numero * i); // Exibe o i-ésimo múltiplo do número
                    i++; // Incrementa o contador
                } while (i <= 10); // O loop continua até que i atinja 10

                scanner.close(); // Fecha o scanner
            }
        }