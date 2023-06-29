import java.util.HashMap;
import java.util.Map;

public class lec5_3 {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>(); //выделяем значение массива 16
        Map<Integer, String> map2 = new HashMap<>(9);//выделяем значение массива 9
        Map<Integer, String> map3 = new HashMap<>(9, 1.0f); //кол-во элементов и до которого момента нужно заполнять значение чтобы было удвоение элемента в хранилище
    }
}
