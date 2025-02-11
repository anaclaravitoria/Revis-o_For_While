package RevisãoForWhile;

import java.util.Scanner;

public class Ativ44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escreva um número");
        int num = sc.nextInt();
        int i = 1;
        System.out.print("Os divisores de "+num+ " são: ");

        do {
            if (num % i == 0){
                System.out.println(i);

            }
            i++;
        }while(i <= num);

        sc.close();
    }
}
