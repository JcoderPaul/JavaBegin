package myFirstInheritance_1;
/*
Простой пример наследования. Класс Human является родителем для классов Student и Teacher, и Rector,
который находится в другом пакете и посему видит не все методы и переменные родителя,
в свою очередь, классы Student и Teacher (Rector) имеют несколько названий: дочерний класс, класс наследник
или подкласс, производный класс, расширенный класс (Derived, Child, SubClass, Extended).

В данном примере большинство параметров и методов имеют модификацию default и значит видны только в данном
классе и пакете. В другом пакете даже у наследника эти параметры не видны, их надо делать public,
в нашем примере метод 'public void canSleep()' и переменная рост 'public int growth' доступны классу Rector.

Все публичные (public) методы и переменные наследуются, чего не скажешь об остальных.
По факту все определяется scope-ом или областью видимости.
*/
public class myFirstInheritance_1 {
    public static void main(String[] args) {
        Student stud_1 = new Student();
        stud_1.age = 19;
        stud_1.name = "Вася";
        stud_1.growth = 178;
        stud_1.specialization = "Инженер";
        stud_1.must_learn();
        stud_1.canEat();
        stud_1.canGo();
        System.out.println(stud_1);
    }
}

class Student extends Human{
    void must_learn (){
        System.out.println("Я учусь.");
    }

    @Override
    public String toString() {
        return "Student { " +
                "name = ' " + name + '\'' +
                ", age = " + age +
                ", growth = " + growth +
                ", specialization = " + specialization +
                '}';
    }
}

class Teacher extends Human{
    void must_teach (){
        System.out.println("Я преподаю.");
    }

    @Override
    public String toString() {
        return "Teacher { " +
                "name = '" + name + '\'' +
                ", age = " + age +
                ", growth = " + growth +
                ", specialization = " + specialization +
                '}';
    }
}