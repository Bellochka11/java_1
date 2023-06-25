//реализовать консольное приложение которое
// принимает от пользователя строку вида text
// 1. нужно сохранить text  в связный список
// 2. если введено print~num, выводит строку из позиции num в связном списке и удаляет ее из списка
//3. выход из программы - exit
//[qwe,rty,zxc] print~1 выведет rty и [qwe,zxc], потом print~1 выведет zxc и [qwe]

import java.util.LinkedList;
import java.util.Scanner;

public class sem4_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter: ");
        String stroka = in.nextLine();
        LinkedList<String> list1 = new LinkedList<String>();
        while (!stroka.equals("exit")) { // equals - не равно
            if (stroka.startsWith("print~")) { // startsWith- содержит ли проверяет на наличие
                int value = Integer.parseInt(stroka.split("~")[1]); // разделяем print и число и это число присваиваем к валью
                list1.remove(value); //remove-удаление
            }
            else{
                list1.add(stroka);
            }
            System.out.println(list1);
            System.out.println("Enter: ");
            stroka = in.nextLine();
        }
    }
}
