package RevisaoForWhile;

public class Ativ29 {
    public static void main(String[] args) {
                int[] vetor = {64, 25, 12, 22, 11};

                for (int i = 0; i < vetor.length - 1; i++) {

                    int menorIndice = i;
                    for (int j = i + 1; j < vetor.length; j++) {
                        if (vetor[j] < vetor[menorIndice]) {
                            menorIndice = j;
                        }
                    }

                    if (menorIndice != i) {
                        int temp = vetor[i];
                        vetor[i] = vetor[menorIndice];
                        vetor[menorIndice] = temp;
                    }
                }

                System.out.print("Vetor ordenado: ");
                for (int i = 0; i < vetor.length; i++) {
                    System.out.print(vetor[i] + " ");
                }
            }
        }

