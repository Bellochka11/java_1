// реализовать консольное приложение которое
// 1. принимает от пользователя и "запоминает" строки
// 2. если введено print выводит строки так чтобы последняя введенная была первой в списке а первая последней и чистит весь перечень
// [qwe,asd,zxc] пишем print и выводит zxc,asd,qwe и []

import java.util.Scanner;
import java.util.Stack;

public class sem4_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter: ");
        String stroka = in.nextLine();
        Stack<String> list1 = new Stack<String>();
        while (!stroka.equals("exit")) { // equals - не равно
            if (stroka.equals("print")) { // startsWith- содержит ли проверяет на наличие
                while (!list1.empty()) { // empty - проверяет пустой или нет
                    System.out.println(list1.pop()); // pop-удаляет последний элемент и возвращает его
                }
            } else {
                list1.push(stroka); //push-создал список
            }
            System.out.println(list1);
            System.out.println("Enter: ");
            stroka = in.nextLine();
        }
        in.close();
    }
}
