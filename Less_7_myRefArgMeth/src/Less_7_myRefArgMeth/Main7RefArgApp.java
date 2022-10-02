package Less_7_myRefArgMeth;
/*
В обоих примерах мы упираемся в зону видимости переменных (что примитивных, что ссылочных)
или scope. Зона видимости, а также период жизни переменных внутри метода ограничена телом
метода (временем жизни метода) и если метод ничего не возвращает (void), то и переменные внутри него,
так и остаются внутри него и объекты или ссылки на них.
*/
public class Main7RefArgApp {

    /*
    Задание было простым создать метод который бы принимал в себя некую пару переменных или объектов,
    что даже лучше, и менял их значения местами (т.е. значение примитивов или ссылки на объекты)
    Это задание наглядно показывает область видимости переменных (и примитивных и ссылочных) внутри
    различных методов.

    Пример очень надуманный, но все же!
    */
    public static void main(String[] args) {
        Gun gun_1 = new Gun("AK-74", 7.62, 600, 3.8);
        Gun gun_2 = new Gun("AR-15", 5.56, 700, 3.1);

        Gun pistol_1 = new Gun("АПС", 9, 700,  1.220);
        Gun pistol_2 = new Gun("ST Kinetics CPW", 9, 900, 1.5);

        System.out.println(gun_1);
        System.out.println(gun_2);

        swap(gun_1, gun_2);
        System.out.println("1. Повторный вывод данных из MAIN: ");
        System.out.println(gun_1);
        System.out.println(gun_2);

        System.out.println("Вывод данных из метода PRIM SWAP ARRAY: ");
        System.out.println(prim_swap_array(gun_1, gun_2)[0]);
        System.out.println(prim_swap_array(gun_1, gun_2)[1]);
        System.out.println("Вывод данных из метода PRIM SWAP ARRAY закончен!");

        System.out.println("2. Повторный вывод данных из MAIN: ");
        System.out.println(gun_1);
        System.out.println(gun_2);

        Gun [] do_swap = prim_swap_array(gun_1, gun_2);
        gun_1 = do_swap[0];
        gun_2 = do_swap[1];

        System.out.println("3. Повторный вывод данных из MAIN: ");
        System.out.println(gun_1);
        System.out.println(gun_2);
        System.out.println("\n****************** Experiences with Pistol ******************");
        // Перекинуть объекты мы можем, немного помучившись, зато поменять параметры наших объектов
        // мы можем и по "префекс-ссылке", т.е. в самом методе обратившись к переменным объекта,
        // естественно если они доступны (имеют соответствующий модификатор доступа).
        System.out.println("1. Вывод данных о пистолетах из MAIN: ");
        System.out.println(pistol_1);
        System.out.println(pistol_2);

        swap_param(pistol_1, pistol_2);

        System.out.println("2. Вывод данных о пистолетах из MAIN: ");
        System.out.println(pistol_1);
        System.out.println(pistol_2);
    }
    // Естественно, как и в случае с примитивными переменными, в качестве аргументов
    // в метод заезжают ссылки-ссылок, даже не сами объекты, а значит при модификаторе void
    // они там и остаются, т.е. результат внутренних брожений в это методе, там и останется.
    public static void swap(Gun gun_1, Gun gun_2) {
        Gun gun_3 = gun_1;
        gun_1 = gun_2;
        gun_2 = gun_3;
        System.out.println("Вывод данных из метода SWAP: ");
        System.out.println(gun_1);
        System.out.println(gun_2);
        System.out.println("Вывод данных из метода SWAP закончен!");
    }
    /*
    А теперь отступление, как намекают некоторые источники (другие, просто опускают этот
    момент, мол сами разберетесь), в случае засылки переменных в методы, внутри самого метода
    в любом случае будет создана 'ссылка с апострофом', т.е. та же, да не та, и далее,
    внутри метода, манипуляции будут производиться именно с ними.

    И это легко проверить, сделав повторный вывод наших первоначальных переменных в методе MAIN
    !!! А воз и ныне там !!!! Это мы еще до клонирования не добрались )))))

    А значит только перекрестное присвоение в основном коде (ну не опытный я еще)!
    */
    public static Gun[] prim_swap_array (Gun gun_1, Gun gun_2) {
        // Мешаем наши входные данные согласно задания
        Gun gun_3 = gun_1;
        gun_1 = gun_2;
        gun_2 = gun_3;
        // Закидываем в массив, в заранее определенные места,
        // что бы знать, где какие ссылки на объекты лежат
        Gun [] arrey_swap = new Gun[2];
        arrey_swap [0] = gun_1;
        arrey_swap [1] = gun_2;
        // Возвращаем наш массив миру
        return arrey_swap;
    }
    // В данном методе мы просто перебрасываем данные между параметрами объектов, поскольку
    // имеем к ним доступ по ссылкам. (Судя по всему, область памяти каждого объекта в куче не
    // поменялась, а вот их содержимое мы скорректировали. Фундаментальный вопрос: -
    // Кто ты человече и кем себя баишь?)
    public static void swap_param(Gun pistol_1, Gun pistol_2) {
        Gun pistol_3 = new Gun();
        pistol_3.modelName = pistol_1.modelName;
        pistol_3.caliber = pistol_1.caliber;
        pistol_3.rateOfFire = pistol_1.rateOfFire;
        pistol_3.weightWithoutCartridges = pistol_1.weightWithoutCartridges;

        pistol_1.modelName = pistol_2.modelName;
        pistol_1.caliber = pistol_2.caliber;
        pistol_1.rateOfFire = pistol_2.rateOfFire;
        pistol_1.weightWithoutCartridges = pistol_2.weightWithoutCartridges;

        pistol_2.modelName = pistol_3.modelName;
        pistol_2.caliber = pistol_3.caliber;
        pistol_2.rateOfFire = pistol_3.rateOfFire;
        pistol_2.weightWithoutCartridges = pistol_3.weightWithoutCartridges;

        System.out.println("Вывод данных из метода SWAP: ");
        System.out.println(pistol_1);
        System.out.println(pistol_2);
        System.out.println("Вывод данных из метода SWAP закончен!");
    }
}


