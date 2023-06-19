//заполнить список названиями планет в произвольном порядке с повторениями вывести название и кол-во его повторений
//[земля, земля, марс, юпитер, земля]
//земля 3, марс 1, юпитер 1.

import java.util.ArrayList;
import java.util.Arrays;

public class sem3_1 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("Земля", "Марс", "Земля", "Юпитер"));
        System.out.println(list1);
        int count = 1;
        ArrayList<String> list2 = new ArrayList<>();

        for (int i = 0; i < list1.size() - 1; i++) {
            if (!list2.contains(list1.get(i))) { // если во втором списке нету элемента из 1 списка
                list2.add(list1.get(i)); //добавлем
                count = 1;
                for (int j = i + 1; j < list1.size() - 1; j++) {
                    if (list1.get(i) == list1.get(j)) {
                        count += 1;
                    }
                }
                System.out.println(list1.get(i) + count);
            }
        }
    }
}