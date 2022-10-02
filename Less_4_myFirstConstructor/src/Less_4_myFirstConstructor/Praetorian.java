package Less_4_myFirstConstructor;

public class Praetorian {
    String name;
    int age = 17;
    double experience = 1;
    boolean possessionOfGladius = true;
    boolean possessionOfShortSpear;
    boolean possessionOfKnife;
    // Создаем конструктор принимающий в себя абсолютно все переменные класса
    public Praetorian(String name, int age, double experience, boolean possessionOfGladius,
                      boolean possessionOfShortSpear, boolean possessionOfKnife) {
        this.name = name;
        this.age = age;
        this.experience = experience;
        this.possessionOfGladius = possessionOfGladius;
        this.possessionOfShortSpear = possessionOfShortSpear;
        this.possessionOfKnife = possessionOfKnife;
    }

    public Praetorian(String name) {
        // Используем предыдущий конструктор, который принимает в себя все переменные,
        // для заполнения недостающих данных.
        this(name, 17, 1, true, false,false);
        this.name = name;
    }

    public Praetorian(String name, int age) {
        this(name, age, 1, true, false, false);
        this.name = name;
        this.age = age;
    }

    public Praetorian(String name, int age, double experience) {
        // Используем конструктор, который принимает в себя только два параметра,
        // третий добавляем и остальные идут по умолчанию.
        this(name, age);
        this.experience = experience;
    }

    public Praetorian(String name, int age, double experience, boolean possessionOfGladius) {
        this(name, age, experience);
        this.possessionOfGladius = possessionOfGladius;
    }

    @Override
    public String toString() {
        return "Praetorian -> {" +
                " name = '" + name + '\'' +
                ", age = " + age +
                ", experience = " + experience +
                ", possessionOfGladius = " + possessionOfGladius +
                ", possessionOfShortSpear = " + possessionOfShortSpear +
                ", possessionOfKnife = " + possessionOfKnife +
                '}';
    }
}
