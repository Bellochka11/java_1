//создать список типа ArrayList поместить в него как строки так и целые числа. пройти по списку и удалить целые числа

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class sem3_2 {
    public static void main(String[] args) {
        List<Object> array = new ArrayList<>(Arrays.asList("Земля",12, "Земля", "Земля", 2,1,"Земля", "Земля"));
        // for (int i = 0; i < array.size(); i++) {
        //     if (array.get(i) instanceof Integer) { //если элемент принадлежит инт
        //         array.remove(i); //удаление
        //         i--;
        //     }
        // }

        Iterator iter = array.iterator();
        while(iter.hasNext()){ //пока есть следующий
            if (iter.next() instanceof Integer) { //если принадлежит инт
                iter.remove(); //удаление
            }
        }
        System.out.println(array);
    }
    
}
