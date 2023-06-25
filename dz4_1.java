import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

/**
 * dz4_1
 */
public class dz4_1 {
    public static void main(String[] args) {
         Deque<Integer> deque = new ArrayDeque<>();
        Deque<Integer> deque2 = new ArrayDeque<>();
        deque.add(3);deque.add(2);deque.add(1);
        deque2.add(5);deque2.add(4);deque2.add(3);
        Final(Resault(0, deque, deque2));
    }
    static int DeqInt(int n, Deque<Integer> x){
        String res = x.pollLast()+("")+x.pollLast()+("")+x.poll();
        n = Integer.parseInt(res);        
        return n;
    }
    static int Resault(int n, Deque<Integer> x, Deque<Integer> y){
        System.out.println("1 - сложение; 2 - произведение: ");
        Scanner sc = new Scanner(System.in);
        int op = sc.nextInt();
        if (op == 1){
            int summa = DeqInt(0, x) + DeqInt(0, y);
            return summa;
        }
        else if(op == 2){
            int mult = DeqInt(0, x) * DeqInt(0, y);
            return mult;
        }
        else{
            return Resault(n, x, y);
        }
        
    }
    static void Final(int Resault){
        String number = Integer.toString(Resault);
        char[] ch = number.toCharArray();
        int[] intarr = new int[ch.length];
        for (int i = 0; i < ch.length; i++) {
            intarr[i] = Character.getNumericValue(ch[i]);
        }
        System.out.println(Arrays.toString(intarr));
    }
}