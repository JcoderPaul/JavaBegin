package myFirstInheritance_3;

import myFirstInheritance_1.Human;
/*
Для новичков это тонкий момент и его можно запомнить, если ты молодой и твой чердак, еще пуст
или через многократное повторение, если ты старый, что приводит к замене одной ненужной вещи
на другую...

В данном примере класс Proforg наследует от Human, далее в нем создается основной метод и
уже внутри него мы имеем простой доступ к protected переменной, а не как в прошлом примере
с классом Rector и созданием его объекта не в классе наследнике.
*/
public class Proforg extends Human {
    public static void main(String[] args) {
        Proforg prof = new Proforg();
        prof.specialization = "Profundiruet";

        Human human = new Human();
        // public метод работает, а вот ->
        human.canSleep();
        /*
        -> а вот такой код ->
           human.name = "Australopitecus";
        тут не прокатит, т.к. методы и переменные супер-класса или родителя, в классе наследнике,
        с любыми модификаторами, кроме public, тут будут недоступны, мы же в другом пакете и классе.
        */
    }
}
