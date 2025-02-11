package RevisãoForWhile;

import java.util.Scanner;

public class Ativ42 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String str = scanner.nextLine();

        int i  = str.length() - 1;
        do {
            System.out.println(str.charAt(i));
            i--;
        } while (i >= 0);

        scanner.close();
    }
}