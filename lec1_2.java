public class lec1_2 { //массив из 2 элементов. как сделать его из 3 элементов?
    public static void main(String[] args) {
        int[] a = new int[] { 1, 9 };
        int[] b = new int[3];
        System.arraycopy(a, 0, b, 0, a.length); //копируем данные из массива а в массив б с 0 индексов до конца
        for (int i : a) {
            System.out.printf("%d ", i);
        } // 1 9
        for (int j : b) {
            System.out.printf("%d ", j);
        }
        // 0 9 0 0 0 0 0 0 0 0
    }
}