public class ativ12 {
    public static void main(String[] args) {
        int n = 10;
        int a = 0, b = 1;

        System.out.println("Os primeiros 10 termos da sequência de Fibonacci são:");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int proximo = a + b;
            a = b;
            b = proximo;
        }

    }
}
