public class Worker {
    int id;
    int salary;//зарплата
    String firstName;//имя
    String lastName;//фамилия

    @Override
    public String toString() {
        return String.format("%s %d", firstName, salary);
    }

    public boolean equals(Object o) { // к нам приходит какой то Object. есть текущий и тот который хотим сравнить
        Worker t = (Worker) o;// сохранили
        return id = t.id && firstName = t.firstName; //если айди и имя совпадают то сотрудники равны
    }

    @Override
    public int hashCode() {
        return id;
    }
}
