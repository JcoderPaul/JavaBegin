package myFirstAbstractInterface;

import myFirstAbstractInterface.AbilityInterfaces.Rescuer;
import myFirstAbstractInterface.AbilityInterfaces.SimpleAbilities;
import myFirstAbstractInterface.AbilityInterfaces.SpecialSkills;
import myFirstAbstractInterface.BadGuys.Gangster;
import myFirstAbstractInterface.Workers.CarDriver;
import myFirstAbstractInterface.Workers.Employ;
import myFirstAbstractInterface.Workers.Policeman;

/*
Абстрактный класс (нечто обобщенное) не может иметь объекты, но от него могут создаваться ссылки,
должен содержать хотя бы один абстрактный метод, естественно может иметь наследников, как обычных,
так и абстрактных (с любой глубиной вложения).

Класс в принципе (а абстрактный в частности) описывает, как наш будущий объект (группа объектов)
будут выглядеть, а интерфейс описывает, что может делать объект (объекты) его реализующие. Однако
никто не говорит в точности, как в точности будут реализованы методы интерфейса (три человека могут
иметь (реализовать) способность плавать, но, один - кролем, другой - брасом, а третий только с аквалангом)

Класс реализующий (имплементирующий) методы интерфейса обязуется их перезаписать ("сделать действующими,
снабдить красивыми телами"), либо стать абстрактным классом.
*/
public class myAbstractInterface_1_Less {
    public static void main(String[] args) {
        // Создаем ссылки на объекты на основе абстрактного класса, интерфейса и обычного класса.
        // Водитель это работник (переменная типа Employ ссылается на ...)
        Employ emp_cdr = new CarDriver();
        // Водитель способен быть спасателем (переменная типа Rescuer ссылается на ...)
        Rescuer resc_cdr = new CarDriver();
        // Водитель способен (обладает простыми навыками) делать простые вещи
        // (переменная типа SimpleAbilities ссылается на ...)
        SimpleAbilities simable_cdr = new CarDriver();
        // Водитель это водитель способный делать все, что способен делать любой водитель
        CarDriver carDriver = new CarDriver();
        /*
        Переменной 'emp_cdr' в текущей реализации кода, недоступен метод 'ableToProvideFirstAid();',
        хотя переменная ссылается на объект класса CarDriver, она видит только те компоненты, которые
        присущи классу Employ. (Родитель не знает, что находится за его границами, чего там его ребенок
        еще может) Эту особенность можно обойти через кастомизацию (уточнение) запроса ->
        */
        ((CarDriver)emp_cdr).ableToProvideFirstAid();
        System.out.println(emp_cdr.getSalary());
        /*
        С остальными переменными (resc_cdr, simable_cdr) созданными на основе интерфейсов, картина та же,
        т.е. будут видны только методы интерфейса и его переменные (константы)
        */
        resc_cdr.capableOfExtinguishingSmallFires("Углекислый газ");
        System.out.println(resc_cdr.min_age);
        ((CarDriver)resc_cdr).canWork(1500);

        simable_cdr.ableToFastRun(50.5);
//**************************************************************************************************************
        SpecialSkills spec_cdr = new Policeman();
        System.out.println(spec_cdr.min_spec_operation);

        spec_cdr.abilityToFight();
        ((Policeman)spec_cdr).canWork(18);
        spec_cdr.knowsHowToInterrogate();
//**************************************************************************************************************
        Gangster bandit = new Gangster();
        bandit.canKill();
        bandit.canWork(24);
        bandit.knowsHowToInterrogate();

//**************************************************************************************************************
        /*
        Вот тут, мы обращаемся к статическому методу интерфейса, через имя интерфейса, и все работает.
        Через объект, который имплиментирует интерфейс, содержащий этот метод, обратится к нему не получится.
        Попробуем обратится к этому методу из пакета staticMethodInInterface, так же через имя интерфейса ->
        см. код файла StaticMethodInInterface_2_Less
        */
        Rescuer.canControlSituation();
    }
}

