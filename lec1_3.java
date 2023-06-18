//КОЛЛЕКЦИИ
import java.util.ArrayList;
import java.util.List;

public class lec1_3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(); //<Integer> значит что будем работать с инт, можно не указывать, тогда будем работать со всеми значениями обджект
        list.add(2809); // преобразуем инт в обджект
        // list.add("string line"); // не можем положить строку т.к. написали <Integer> можем положить только инт значения
        for (Object o : list) {
            System.out.println(o);
            // Проблема извлечения данных
        }
    }
}
//ФУНКЦИОНАЛ:
// add(args) – добавляет элемент в список ( в т.ч. на нужную позицию)
// get(pos) – возвращает элемент из списка по указанной позиции
// indexOf(item) – первое вхождение или -1
// lastIndexOf(item) – последнее вхождение или -1
// remove(pos) – удаление элемента на указанной позиции и его возвращение
// set(int pos, T item) – gjvtoftn значение item элементу, который находится
// на позиции pos
// void sort(Comparator) – сортирует набор данных по правилу
// subList(int start, int end) – получение набора данных от позиции start до end

// СПОСОБЫ ОБЪЯВЛЕНИЯ ЛИСТОВ:
// ArrayList<Integer> list1 = new ArrayList<Integer>();
// ArrayList<Integer> list2 = new ArrayList<>();
// ArrayList<Integer> list3 = new ArrayList<>(10);
// ArrayList<Integer> list4 = new ArrayList<>(list3);
