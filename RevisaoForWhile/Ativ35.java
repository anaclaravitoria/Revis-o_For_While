package RevisãoForWhile;

import java.util.Scanner;

public class Ativ35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int i = 1;
        System.out.print("Digite um número: ");
        num = sc.nextInt();

        do {
            System.out.println(num + " X " + i + " = " + num * i);
            i++;
        }while (i <= 10);

        sc.close();
    }
}
