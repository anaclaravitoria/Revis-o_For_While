package RevisaoForWhile;

import java.util.Scanner;

public class Ativ16 {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);


                System.out.print("Digite uma string: ");
                String input = scanner.nextLine();

                System.out.println("Os caracteres da string são:");
                for (int i = 0; i < input.length(); i++) {
                    System.out.println(input.charAt(i));
                }

                scanner.close();
        }

    }

