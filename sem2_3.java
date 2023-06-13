// напишите метод который сжимает строчку пример вход:aaaabbbcdd выход:a4b3cd2
public class sem2_3 {
    private static String StrComposer(String str){
        String stroka = "";
        char c = str.charAt(0); // попался первый символ из строки по индексу
        Integer count = 1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                count++; //накапливаем кол-во всех символов
            }
            else{
                stroka += "" + c + count; // добавляем в новую строку символ и его кол-во
                c = str.charAt(i);
                count = 1; // обнуляем каунт
            }
        }
        return stroka + c + count;
    }
    public static void main(String[] args) {
        String stroka = "aaaabbbcdd";
        String newStroka = StrComposer(stroka);
        System.out.println(newStroka);
        
    }
}
