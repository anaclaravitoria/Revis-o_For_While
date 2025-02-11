package RevisãoForWhile;

public class Ativ53 {public static void main(String[] args) {
    int n = 1;
    int termo = 0;
    int contador = 1;

    do {
        termo += n;
        System.out.println(termo);
        n++;
        contador++;
    } while (contador <= 10);
}
}
