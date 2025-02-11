package RevisaoForWhile;

public class Ativ26 {
    public static void main(String[] args) {
                int base = 5;
                int n = (base * 2) - 1; // A altura do losango (base * 2 - 1)

                // Parte superior do losango (incluindo a linha do meio)
                for (int i = 1; i <= base; i++) {
                    // Imprime espaços para centralizar os números
                    for (int j = 1; j <= base - i; j++) {
                        System.out.print(" ");
                    }
                    // Imprime os números
                    for (int j = 1; j <= (2 * i - 1); j++) {
                        System.out.print(j);
                    }
                    // Pula para a próxima linha
                    System.out.println();
                }

                // Parte inferior do losango
                for (int i = base - 1; i >= 1; i--) {
                    // Imprime espaços para centralizar os números
                    for (int j = 1; j <= base - i; j++) {
                        System.out.print(" ");
                    }
                    // Imprime os números
                    for (int j = 1; j <= (2 * i - 1); j++) {
                        System.out.print(j);
                    }
                    // Pula para a próxima linha
                    System.out.println();
                }
            }
        }
