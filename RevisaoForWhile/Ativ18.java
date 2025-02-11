package RevisaoForWhile;

import java.util.Scanner;

public class Ativ18 {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.print("Digite uma string: ");
                String input = scanner.nextLine();

                // Removendo espaços e convertendo para minúsculas para facilitar a comparação
                input = input.replaceAll("\\s+", "").toLowerCase();

                boolean isPalindromo = true;

                for (int i = 0; i < input.length() / 2; i++) {
                    if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                        isPalindromo = false;
                        break;
                    }
                }

                if (isPalindromo) {
                    System.out.println("A string é um palíndromo.");
                } else {
                    System.out.println("A string não é um palíndromo.");
                }

                scanner.close();
            }
        }



