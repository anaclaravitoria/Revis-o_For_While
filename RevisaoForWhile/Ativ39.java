package RevisãoForWhile;

import java.util.Scanner;

public class Ativ39 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int numero;

            do {
                System.out.print("Digite um número: ");
                numero = scanner.nextInt();

                if (numero >= 0) {
                    System.out.println("Número positivo: " + numero);
                }
            } while (numero >= 0);

            System.out.println("Número negativo inserido. Programa encerrado.");
            scanner.close();
        }
    }



