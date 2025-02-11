package RevisãoForWhile;

public class Ativ51 {
    public static void main(String[] args) {
        int numero = 2;
        int contador = 0;

        do {
            int somaDivisores = 0;
            for (int i = 1; i < numero; i++) {
                if (numero % i == 0) {
                    somaDivisores += i;
                }
            }

            if (somaDivisores == numero) {
                System.out.println(numero);
                contador++;
            }

            numero++;
        } while (contador < 10);
    }
}

