import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
// Написать программу, определяющую правильность расстановки скобок в выражении.
// Пример 1: a+(d*3) - истина
// Пример 2: [a+(1*3) - ложь
// Пример 3: [6+(3*3)] - истина
// Пример 4: {a}[+]{(d*3)} - истина
// Пример 5: <{a}+{(d*3)}> - истина
// Пример 6: {a+]}{(d*3)} - ложь
// <({[]})> --- истина

public class sem5_3 {
    public static void main(String[] args) {
        String input = new String("<{a}+{(d*3)}>");
        System.out.println(comparesmentMap(input));
    }

    public static boolean comparesmentMap(String input) { //метод
        char[] symbols = input.toCharArray(); //переводим строчку в массив чаров
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put('}', '{');
        map.put(')', '(');
        map.put(']', '[');
        map.put('>', '<');
        for (Character item : symbols) { //бежим по символам в строке
            if (map.containsValue(item)) { //если встречаем открывающуюся скобку (значение)
                stack.push(item); //добавляем в стек и накапливаем открывающиеся скобки
            }
            if (map.containsKey(item)) { //если встретили ключ (закрывающиеся скобки)
                if (stack.empty() || stack.pop() != map.get(item)) { //проверяем не пустой ли стек сравниваем последнюю закрывающуюся скобку
                    return false;
                }
            }
        }
        return stack.empty(); //если открывающ скобок больше чем закрывающ проверяет пустой или нет
    }
}
