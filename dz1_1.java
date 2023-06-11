import java.util.Scanner;

// Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)


public class dz1_1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int b = iScanner.nextInt();
        System.out.printf("Треугольное и факториал: %d, %d  ", triangular_factor(b), factor(b));
        iScanner.close();
    }
    public static int triangular_factor(int a) {
        return (a * (a + 1)) / 2;

    }
    public static int factor(int a) {
        if(a==1) return 1;
        return a * factor(a-1);

    }
}
