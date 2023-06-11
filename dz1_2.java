import java.util.Scanner;
// 2) Вывести все простые числа от 1 до 1000
public class dz1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for (int i = 2; i < a; i++) {
            if (prime_numbers(i))
                System.out.println(i);
        }
    }

    public static boolean prime_numbers(int i) {
        int n = 5;
        while (n * n <= i) {
            if (i % n == 0 || i % (n + 2) == 0)
                return false;
            n = n + 6;
        }
        return true;
    }
}
