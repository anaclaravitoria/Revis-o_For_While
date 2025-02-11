package RevisaoForWhile;

import java.util.Scanner;

public class Ativ21 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();
            int soma = 0;


            for (int temp = numero; temp != 0; temp /= 10) {
                soma += temp % 10;
            }


            System.out.println("A soma dos dígitos de " + numero + " é: " + soma);


            scanner.close();
        }
    }



