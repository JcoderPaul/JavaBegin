package myFirstSuperConstructor;

public class myConstructor_Less_1 {
    public static void main(String[] args) {
        /*
        !!!! КОНСТРУКТОРЫ НЕ НАСЛЕДУЮТСЯ !!!!
        !!!! ВЫРАЖЕНИЯ SUPER И THIS НЕ МОГУТ ОДНОВРЕМЕННО НАХОДИТСЯ В ТЕЛЕ ОДНОГО КОНСТРУКТОРА !!!!
        Если посмотреть в консоль, то мы увидим следующую последовательность при создании детеныша Human,
        сначала отрабатывает конструктор:
         - с полным набором аргументов класса Human,
         - затем, конструктор с одним аргументом класса Human,
         - в последнюю очередь конструктор с именем, класса наследника.
        Но и тут цепочка не полная, еще до начала работы класса родителя, в игру вступает его супер-класс,
        Object и его конструктор super, примерно так -> public Human() { super();} это в случае дефолтных
        конструкторов во всех классах наследниках...

        Если у класса родителя нет дефолтного конструктора, то среда разработки будет ругаться при создании
        класса наследника, и придется вручную создавать у дочернего класса соответсвующий конструктор со
        ссылкой на родителя.
        */
        Pithecanthropus petya = new Pithecanthropus("Геракл");
        System.out.println(petya.name);
        System.out.println("---------------------------------------------------------------");
        CroMagnon roma = new CroMagnon();
        System.out.println(roma.name);
        System.out.println("---------------------------------------------------------------");
        CroMagnon rima = new CroMagnon("Рима","БольшиеУши",148);
        System.out.println(rima);
    }
}
class Human{
    String name;
    String surname;
    // Дефолтный конструктор убит и он не передастся детям...
    public Human(String name) {
        // При вызове текущего конструктора, будет вызван конструктор с
        // полной выкладкой 'Human(String name, String surname)'
        this(name,null);
        System.out.println("Работает конструктор только с именем HUMAN");
    }

    public Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
        System.out.println("Работает конструктор с полной выкладкой HUMAN");
    }
}

class Pithecanthropus extends Human{
    // Приходится создавать свой конструктор
    public Pithecanthropus(String name) {
        super(name);
        System.out.println("Работает конструктор с именем PITHECANTROPUS");
    }
}
/*
Фиксируем имя через конструктор супер-класса или класса родителя.
Все просто, когда разъяснили или въехал сам:
- this - текущий;
- super - родитель (уровень выше);
*/
class CroMagnon extends Human {
    int growth;
    // Приходится создавать свой конструктор
    public CroMagnon() {
        super("Рома");
        System.out.println("Работает конструктор с именем CroMagnon");
    }

    public CroMagnon(String name, String surname, int growth) {
        super(name, surname);
        this.growth = growth;
        System.out.println("Работает конструктор CroMagnon с полной выкладкой");
    }

    @Override
    public String toString() {
        return "CroMagnon{" +
                "growth=" + growth +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}