//Iterator
import java.util.*;

public class lec1_5 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 12, 123, 1234, 12345);
        for (int item : list) { //цикл форич
            System.out.println(item);
        }
        Iterator<Integer> col = list.iterator();
        while (col.hasNext()) { //пока есть следующий элемент
            System.out.println(col.next());

        }
    }
}
