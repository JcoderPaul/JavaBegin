package myFirstAbstractInterface.Workers;
/*
Абстрактный класс (нечто обобщенное) не может иметь объекты, но от него могут создаваться ссылки,
должен содержать хотя бы один абстрактный метод, естественно может иметь наследников, как обычных,
так и абстрактных (с любой глубиной вложения).

Класс в принципе (а абстрактный в частности) описывает, как наш будущий объект (группа объектов)
будут выглядеть, а интерфейс описывает, что может делать объект (объекты) его реализующие.
*/
public abstract class Employ {
    double salary = 100.5;
    int age;
    int experience;

    public abstract void canEat(String name_of_food);

    public abstract void canSleep(int time_of_sleep);

    public abstract void canWork(double time_of_work);

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
