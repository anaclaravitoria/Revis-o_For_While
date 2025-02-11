package RevisaoForWhile;

import java.util.Scanner;

public class Ativ19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número para calcular seu fatorial");
        int num = sc.nextInt();

        long fatorial = 1;
        if (num < 0) {
            System.out.println("O fatorial de números negativos não é definido");
        } else {
                for (int i = 1; i <= num; i++){
                    fatorial *= i;
                }
                System.out.print("O fatorial de "+ num + " é:"+ fatorial);
        }
    }
}
