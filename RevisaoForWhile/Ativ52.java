package RevisãoForWhile;

public class Ativ52 {
    public static void main(String[] args) {
        int numero = 2;
        int contador = 0;

        do {
            boolean primo = true;
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    primo = false;
                    break;
                }
            }

            if (primo) {
                System.out.println(numero);
                contador++;
            }

            numero++;
        } while (contador < 10);
    }
}

