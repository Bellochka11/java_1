// Реализовать класс Cat для вет. клиники
// Добавить в него поля:
// Имя, возраст, Привит ли кот (boolean), дефолт - false, пол
// Добавить методы:
// Кот Имя мяукнул n раз
// Прививка кота, если был привит - сообщить об этом
// Так же придумать 1-2 своих метода

public class sem6_2 {
    public static void main(String[] args) {
        cat slon = new cat(); //объект класса cat
        slon.name = "Слоняра"; //задали его имя
        slon.age = 36; //возраст
        slon.sex = true;
        System.out.println(slon.lives_limit); //кол-во жизней
        slon.car_accident(); //авария жизнь уменьшилась на 1
        System.out.println(slon.lives_limit); //кол-во жизней стало меньше на 1
        slon.car_accident();//авария жизнь уменьшилась на 1
        slon.vaccine();
        slon.vaccine();
        slon.spring(13); //мяукнул 13 раз
    }
}