public class sem2_1 {
    public static void main(String[] args) {
        String stroka = "qwerty";
        StringBuilder sb = new StringBuilder(); // StringBuilder применяется для сбора строчек
        sb.append('a');
        sb.append(stroka);
        System.out.println(sb.toString());
    }
}
