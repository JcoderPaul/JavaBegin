package myFirstSuperConstructor;

public class myConstructor_HW_2 {
    public static void main(String[] args) {
        Dog dog_1 = new Dog("Трисон");
        System.out.println("Лап у меня - > " + dog_1.paw);
        Cat cat_1 = new Cat("Тихоня");
        cat_1.catSleep();
    }
}

class Animal{
    // Объявляем, но не задаем, некую переменную свойственную всем Animal
    int eyes;

    public Animal() {
        System.out.println("Запустился конструктор Animal");
    }

    public void eat(){
        System.out.println("Animal ест (eat)");
    }
    public void drink(){
        System.out.println("Animal пьет (drink)");
    }

    public int getEyes() {
        return eyes;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }
}

class Pat extends Animal{
    // Объявляем переменные и часть инициализируем
    String name;
    int paw = 4;
    int tail = 1;

    public Pat() {
        System.out.println("Запустился конструктор Pat");
        eyes = 2;
    }

    public void run(){
        System.out.println("Pat бегает (run)");
    }

    public void jump(){
        System.out.println("Pat прыгает (jamp)");
    }
}

class Dog extends Pat{

    public Dog(String name) {
        System.out.println("Запустился конструктор Dog");
        this.name = name;
        System.out.println("Я пёсель и меня зовут -> " + name);
    }

    public void dogPlay(){
        System.out.println("Пёсель играет");
    }
}

class Cat extends Pat{

    public Cat(String name) {
        System.out.println("Запустился конструктор Cat");
        this.name = name;
        System.out.println("Я котейко и меня зовут -> " + name);
    }

    public void catSleep(){
        System.out.println("Котейко спит");
    }
}