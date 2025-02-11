package RevisaoForWhile;

public class Ativ30 {
    public static void main(String[] args) {
                int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

                int contPares = 0;
                int contImpares = 0;

                for (int i = 0; i < vetor.length; i++) {
                    if (vetor[i] % 2 == 0) {
                        contPares++;
                    } else {
                        contImpares++;
                    }
                }

                System.out.println("Quantidade de números pares: " + contPares);
                System.out.println("Quantidade de números ímpares: " + contImpares);
            }
        }
