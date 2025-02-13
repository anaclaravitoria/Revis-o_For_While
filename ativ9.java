

import java.util.Scanner;

public class ativ9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número :\n");
        int numero = sc.nextInt();
        int resultado = 0;
        for (int i = 1; i<=10; i++){
            resultado = numero * i;
            System.out.println(numero+ "x" +i+ "=" +resultado);

        }

    }
}
