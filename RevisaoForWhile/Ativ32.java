package RevisaoForWhile;

import java.util.Scanner;

public class Ativ32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int soma = 0;

        do {
            System.out.println("Digite os número:");
            num = sc.nextInt();
            soma += num;
        }while (num!=0);{
            System.out.println("Soma dos números digitados é:" +soma);

        }
    }
}
