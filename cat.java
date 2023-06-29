
// Реализовать класс Cat для вет. клиники
// Добавить в него поля:
// Имя, возраст, Привит ли кот (boolean), дефолт - false, пол
// Добавить методы:
// Кот Имя мяукнул n раз
// Прививка кота, если был привит - сообщить об этом
// Так же придумать 1-2 своих метода

public class cat {
    String name = ""; //имя
    Integer age;//возраст
    Boolean vaccin = false;//привит
    Boolean sex = false;//пол
    Integer lives_limit = 2; // жизни кота
    Integer Meows = 0;//мяукнул

    public int car_accident() { //машина сбила кота
        if (lives_limit != 0) { //если его жизни не равны 0
            lives_limit--; //уменьшаем жизнь на 1
        }
        if (lives_limit == 0) { //если жизней не осталось
            System.out.println(" R.I.P"); //котик умер
        }
        return lives_limit;
    }

    public void vaccine() {
        if (!vaccin) { //если не вакринирован
            this.vaccin = true; //становится вакцинирован
            System.out.println(this.name + " IS vaccinated! PAY! "); //this - обращение к объекту привита
        } else {
            System.out.println(this.name + " IS vaccinated! FEED! ");//не привит
        }
    }
    public void spring(int quantaty) { //сколько мяукнул
        this.Meows = quantaty;
        System.out.println("Cat " + this.name + " meows " + Meows + " times");;
    }
}