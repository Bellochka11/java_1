/**
 * Дан массив двоичных чисел, например [1,1,0,1,1,1],
 * вывести максимальное количество подряд идущих 1.
 */
public class sem1_2 {

    public static void main(String[] args) {
        int[] array = { 1, 1, 0, 1, 1, 1 };
        int count = 0; // итоговый
        int current = 0; // текущий
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) { // бежим по индексам
                current += 1;
            } else {
                if (current > count) {
                    count = current;
                }
                current = 0; //обнуляем чтобы смогли посчитать следующие единицы если встретился 0 на пути
            }
        }
        if (current > count) {
            count = current;
        }
        System.out.println(count);

    }
}