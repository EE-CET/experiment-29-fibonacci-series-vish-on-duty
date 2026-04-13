import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            if (!sc.hasNextInt()) return;
            int n = sc.nextInt();
            if (n <= 0) return;
            if (n == 1) {
                System.out.println(0);
                return;
            }
            if (n == 2) {
                System.out.println(1);
                return;
            }

            long a = 0, b = 1;
            long fib = 0;
            for (int i = 3; i <= n; i++) {
                fib = a + b;
                a = b;
                b = fib;
            }
            System.out.println(b);
        }
    }
}
