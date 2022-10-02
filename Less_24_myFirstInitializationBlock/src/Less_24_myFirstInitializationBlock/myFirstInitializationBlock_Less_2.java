package Less_24_myFirstInitializationBlock;
/*
Статические переменные, блоки, создаются в момент загрузки класса,
все остальное происходит в момент создания объекта.
*/
public class myFirstInitializationBlock_Less_2 {
    public static void main(String[] args) {
        System.out.println("----------------- Первый объект -----------------");
        TestInitBlockTwo tiBlockTwo = new TestInitBlockTwo(7);
        System.out.println("From constructor 'par' -> " + tiBlockTwo.par + " ПИ " + TestInitBlockTwo.Pi);
        System.out.println("----------------- Второй объект -----------------");
        TestInitBlockTwo tiBlockOne = new TestInitBlockTwo(34);
        System.out.println("From constructor 'par' -> " + tiBlockOne.par + " ПИ " + TestInitBlockTwo.Pi);
    }
}

class TestInitBlockTwo{
    // Статическую переменную можно инициализировать в статическом блоке
    static int par;
    /*
    Константу тоже, но все таки до ее инициализации, мы не можем ее использовать, хотя
    статический блок инициализации запускается первым при работе кода, компилятор выставит
    предупреждение если, например, попытаться использовать константу раньше, что нормально.
    !!! При этом компилятор спокойно пропустит код на запуск, т.к. статические блоки и
    переменные инициализируются в первую очередь (см. запустить код и посмотреть результат)!!!
    */
    final static double Pi;
    {
        System.out.println("Classic initialization block 1 'par' -> " + par + " число ПИ -> " + Pi);
    }
    public TestInitBlockTwo(int par) {
        this.par = par;
    }
    {
        par = 1;
        System.out.println("Classic initialization block 2 'par' -> " + par  + " число ПИ -> " + Pi);
    }
    static {
        par = 10;
        Pi = 3.14;
        System.out.println("Static block 1 'par' -> " + par + " число ПИ -> " + Pi);
    }
}