package RevisaoForWhile;

import java.util.Scanner;

public class Ativ17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite uma string: ");
        String input = scanner.nextLine();

        System.out.println("Os caracteres da string são:");
        for (int i = input.length() - 1; i >= 0; i--) {
            System.out.println(input.charAt(i));
        }

        scanner.close();
    }
}
