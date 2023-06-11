import java.util.Scanner; //ввод из терминала

public class sem1_1 { // навзание файла
    public static void main(String[] args) { // "cp866" кодировка чтобы русские буквы показывались
        Scanner sc = new Scanner(System.in, "cp866"); // объект который открывает доступ к терминату. поток на вход. sc - имя переменной
        System.out.print("Введите имя: ");
        String name = sc.nextLine(); // считываем с помощью sc.nextLine() (.next(), .nextInt() - варианты) name - переменная
        //System.out.println(name);
        System.out.printf("Привет, %s", name);
        //System.out.printf("%s, %d", name, 4);
        sc.close(); // закрыли поток
         // sc.nextLine() - считывает строчку до перехода  .next() - считывает элемент .nextInt() - считывает число без перехода
    }
}
