package RevisãoForWhile;

import java.util.Scanner;

public class Ativ47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner para ler a entrada do usuário

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt(); // Lê o número informado pelo usuário

        // Variáveis para verificar se o número é primo
        int i = 2; // Começamos a verificação a partir de 2
        boolean ehPrimo = true; // Inicializa como primo

        // Verifica se o número é divisível por qualquer número entre 2 e o próprio número-1
        do {
            if (numero % i == 0) { // Se o número for divisível por i, não é primo
                ehPrimo = false;
                break; // Se encontrar um divisor, interrompe o loop
            }
            i++; // Incrementa o valor de i para verificar o próximo divisor
        } while (i <= Math.sqrt(numero)); // Só precisa verificar até a raiz quadrada do número

        // Exibe o resultado
        if (numero <= 1) {
            System.out.println("O número deve ser maior que 1.");
        } else if (ehPrimo) {
            System.out.println("O número " + numero + " é primo.");
        } else {
            System.out.println("O número " + numero + " não é primo.");
        }

        scanner.close(); // Fecha o scanner
    }
}