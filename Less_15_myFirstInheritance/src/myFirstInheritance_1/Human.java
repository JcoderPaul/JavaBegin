package myFirstInheritance_1;

public class Human {
    String name;
    int age;
    public int growth;
    protected String specialization;

    void canEat() {
        System.out.println("Я ем.");
    }

    void canGo() {
        System.out.println("Я иду.");
    }

    public void canSleep() {
        System.out.println("Я сплю.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Human { " +
                "name = ' " + name + '\'' +
                ", age = " + age +
                ", growth = " + growth +
                '}';
    }
}
