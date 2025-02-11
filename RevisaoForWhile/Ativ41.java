package RevisãoForWhile;

import java.util.Scanner;

public class Ativ41 {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

                System.out.print("Digite uma string: ");
                String str = scanner.nextLine();

                int i = 0;
                do {
                    System.out.println(str.charAt(i));
                    i++;
                } while (i < str.length());

                scanner.close();
            }
        }



