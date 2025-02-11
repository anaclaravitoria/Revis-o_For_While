package RevisãoForWhile;

import java.util.Scanner;

public class Ativ40 {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                int numero;
                int contador = 0;

                do {
                    System.out.print("Digite um número: ");
                    numero = scanner.nextInt();

                    if (numero != 0) {
                        contador++;
                    }
                } while (numero != 0);

                System.out.println("Você digitou " + contador + " números antes de digitar zero.");
                scanner.close();
            }
        }



