import java.io.FileReader;
import java.io.FileWriter;

public class Maim {
    public static void main(String[] args) {
        //записать в файл слово TEST 10 раз
        int n = 10;
        String text = "TEST";
        try { //запись в файл
            FileWriter writer = new FileWriter("file.txt"); //false перезапись true добавление еще
            for (int i = 0; i < n; i++) {
                writer.write(text);
                writer.write("\n");
            }
            System.out.println("Получилось");
            writer.close();
        }
        catch (Exception e){ // e - вылавливает все ошибки
            System.out.println("Что то не так");
        }
        try{ //чтение файла
            FileReader file = new FileReader("file.txt");
            char[] arr = new char[20];
            file.read(arr);
            for (char c: arr) {
                System.out.println(c);
            }
            file.close();
        }
        catch(Exception e)
        {
            System.out.println("Что то не так");
        }
    }
}
