// // дано четное число n и символы с1 и с2 написать метод 
//который вернет строку длины n которая состоит из чередующихся символов с1 и с2 начиная с с1
public class sem2_2 {
    public static void main(String[] args) {
        int number = 10;
        char c1 = 'a';
        char c2 = 'b';
        metod(c1, c2, number); //вызываем метод и передаем туда переменные
    }
    public static void metod(char c1, char c2, int number) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < number/2; i++) { //number/2 т.к. нужно 5 итераций, а не 10
            sb.append(c1).append(c2); // добавляем сначала с1 а потом с2
        }
        System.out.println(sb); //вывод
    }
}
