package RevisaoForWhile;

public class Ativ28 {
    public static void main(String[] args) {
                // Definindo um vetor de inteiros
                int[] vetor = {1, 2, 3, 4, 5};

                // Variável para armazenar a soma
                int soma = 0;

                // Loop para percorrer o vetor e somar seus elementos
                for (int i = 0; i < vetor.length; i++) {
                    soma += vetor[i]; // Adiciona o valor do elemento atual à soma
                }

                // Calcula a média
                double media = (double) soma / vetor.length;

                // Exibe a média
                System.out.println("A média dos números do vetor é: " + media);
            }
        }
