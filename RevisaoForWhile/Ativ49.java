package RevisãoForWhile;

import java.util.Random;

public class Ativ49 {
    public static void main(String[] args) {
        Random random = new Random();
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder senha = new StringBuilder();
        int i = 0;

        do {
            int index = random.nextInt(caracteres.length());
            senha.append(caracteres.charAt(index));
            i++;
        } while (i < 6);

        System.out.println("Senha gerada: " + senha.toString());
    }
}

