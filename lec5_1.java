import java.util.HashMap;
import java.util.Map;
// put(K,V) – добавить пару если или изменить значение,если ключ имеется.
// putIfAbsent(K,V) – произвести добавление если ключ не найден.
// get(K) - получение значения по указанному ключу.
// remove(K) – удаляет пару по указанному ключу.
// containsValue(V) – проверка наличия значения.
// containsKey(V) – проверка наличия ключа.
// keySet() – возвращает множество ключей.
// values() – возвращает набор значений.


/**
 * lec5_1
 */
public class lec5_1 {

    public static void main(String[] args) {

        Map<Integer, String> db = new HashMap<>();
        db.put(1, "один"); // добавили ключ и значение 
        System.out.println(db);
        db.put(2, "два");
        System.out.println(db);
        db.put(3, "три");
        System.out.println(db);
        db.put(31, "три один");
        System.out.println(db);
        db.put(13, "один три");
        System.out.println(db);
        db.put(null, "!null");
        System.out.println(db);
        db.put(null, null);
        System.out.println(db);

    }

}
