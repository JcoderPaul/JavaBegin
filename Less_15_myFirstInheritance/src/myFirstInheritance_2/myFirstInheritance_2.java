package myFirstInheritance_2;

import myFirstInheritance_1.*;
/*
Многие утверждают, что модификатор protected менее жесткий нежели default и переменные
и методы с этим модификатором будут доступны наследникам из других пакетов, а вот у меня
чет не выходит.

И оказалось все немного не так, как я думал - текущий класс 'public class myFirstInheritance_2'
не является наследником Human, а значит не имеет доступ, к protected переменным и методам, класса Human.
Да, у него есть main метод, и в нем создается объект Rector, который является наследником Human, но
!!! это не означает, что его объект имеет доступ к protected переменной из основного метода класса
'myFirstInheritance_2' !!!
*/
public class myFirstInheritance_2 {
    public static void main(String[] args) {
        Rector ugatuRector = new Rector();
        ugatuRector.canSleep();
        ugatuRector.growth = 167;
        ugatuRector.setName("Василий");
        ugatuRector.setAge(56);
        ugatuRector.setSpec("Менеджер высшего звена");
        System.out.println(ugatuRector);
    }
}
/*
В текущем пакете класс Rector (который находится с другом пакете) наследник Human, не видит
default (protected и private) переменные и методы родителя. Мы можем обеспечить доступ к закрытым
переменным при помощи публичных геттеров и сеттеров родителя, а также изменить модификаторы
доступа у нужных методов (или создать их в данном классе заново, о варианте с интерфейсами позже)

Все публичные (public) методы и переменные наследуются, чего не скажешь об остальных.
По факту все определяется scope-ом или областью видимости.
*/
class Rector extends Human{
    /*
    Проблему видимости protected переменной для класса в другом пакете можно решить
    несколькими способами, прямое наследование как в классе Proforg см.пример, либо,
    как в данном классе через сеттер
    */
    void setSpec(String specialization){
        this.specialization = specialization;
    }

    String getSpec(){
        return this.specialization;
    }

    void must_manage (){
        System.out.println("Я управляю.");
    }
    /*
    Мы можем форматировать вывод и через геттеры и через прямое обращение к переменной, если у нее
    соответствующий модификатор доступа или область видимости.
    */
    @Override
    public String toString() {
        return "Rector { " + "name = " + this.getName()
                           + " age = " + this.getAge()
                           + " growth = " + growth
                           + " specialization = " + specialization +
                           '}';
    }
}