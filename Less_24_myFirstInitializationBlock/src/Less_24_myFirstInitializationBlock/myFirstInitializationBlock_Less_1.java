package Less_24_myFirstInitializationBlock;

public class myFirstInitializationBlock_Less_1 {
    public static void main(String[] args) {
        System.out.println("------------------ Создали первый объект (пустой конструктор)------------------");
        InitBlockTest first_1 = new InitBlockTest();
        System.out.println("------------------ Создали второй объект (конструктор с аргументом)------------------");
        InitBlockTest second_2 = new InitBlockTest(23);
    }
}

class InitBlockTest {
    int for_test;
    /*
    Сначала срабатывают static блоки инициализации по порядку размещения, в данном примере -> (1)
    */
    // (3) -> После завершения единовременного запуска статических блоков, начинают работу,
    // обычные блоки инициализации, тоже по порядку размещения в коде класса. Следующим сработает -> (4)
    {
        System.out.println("Блок инициализации - 1");
    }
    // (6)-> если создается объект без использования аргументов
    public InitBlockTest() {
        System.out.println("Инициализация пустого конструктора-1");
    }
    // (6)-> если создается объект в который передаются параметры
    public InitBlockTest(int for_test) {
        // Запускаем пустой конструктор текущего объекта
        this();
        System.out.println("Инициализация конструктора с аргументами - 2 -> " + for_test);
    }
    // (4) -> данный блок сработает вторым в очереди, т.к. расположен вторым в коде, за ним -> (5)
    {
        System.out.println("Блок инициализации - 2");
    }
    // (1)-> этот статический блок сработает первым еще до запуска конструкторов и простых
    // блоков инициализации. При этом статические блоки срабатывают единожды при первом создании
    // объекта текущего класса, затем -> (2)
    static {
        System.out.println("Статический блок инициализации - 1");
    }
    // (5)-> наконец срабатывает данный блок инициализации. Затем в работу включаются конструкторы -> (6)
    {
        System.out.println("Блок инициализации - 3");
    }
    // (2)-> следующий по порядку статический блок, т.е. текущий (статические блоки в порядке своей
    // очередности, далее обычные блоки в порядке своей очередности) -> (3)
    static {
        System.out.println("Статический блок инициализации - 2");
    }
}