//написать метод который принимает массив элементов, помещает их в очередь и выводит на консоль содержимое очереди

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class sem4_4 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            int val = rnd.nextInt(-100, 100);
            arr[i] = val;
        }
        inArray(arr);
    }

    public static void inArray(int[] array) {
        Queue<Integer> result = new LinkedList<>();
        for (int i : array) {
            result.add(i);
        }
        System.out.println(result);
    }
}
