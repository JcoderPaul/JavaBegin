package Less_7_myRefArgMeth;
/*
В обоих примерах мы упираемся в зону видимости переменных (что примитивных, что ссылочных)
или scope. Зона видимости, а также период жизни переменных внутри метода ограничена телом
метода (временем жизни метода) и если метод ничего не возвращает (void), то и переменные внутри него,
так и остаются внутри него и объекты или ссылки на них.
*/

import java.util.*;

/*
Задание было простым создать метод который бы принимал в себя некую пару переменных или объектов,
что даже лучше, и менял их значения местами (т.е. значение примитивов или ссылки на объекты)
Это задание наглядно показывает область видимости переменных (и примитивных и ссылочных) внутри
различных методов.

Пример очень надуманный, но все же!
*/
public class Main7PrimArgApp {
    public static void main(String[] args) {
        int gun_1 = 34;
        int gun_2 = 25;

        System.out.println(gun_1);
        System.out.println(gun_2);

        prim_swap(gun_1, gun_2);
        System.out.println("1. Повторный вывод данных из MAIN: ");
        System.out.println(gun_1);
        System.out.println(gun_2);


        System.out.println("Вывод данных из метода PRIM SWAP MAP: ");
        System.out.println(prim_swap_map(gun_1, gun_2).get("gun_1"));
        System.out.println(prim_swap_map(gun_1, gun_2).get("gun_2"));
        System.out.println("Вывод данных из метода PRIM SWAP MAP закончен!");

        System.out.println("2. Повторный вывод данных из MAIN: ");
        System.out.println(gun_1);
        System.out.println(gun_2);

        System.out.println("3. Повторный вывод данных из MAIN: ");
        Map<String,Integer> do_swap = prim_swap_map(gun_1, gun_2);
        gun_1 = do_swap.get("gun_1");
        gun_2 = do_swap.get("gun_2");

        System.out.println(gun_1);
        System.out.println(gun_2);
    }
    // Метод который ничего не меняет после своего завершения, внутри все красиво,
    // во вне все также, оно и понятно.
    public static void prim_swap(int gun_1, int gun_2) {
        int gun_3 = gun_1;
        gun_1 = gun_2;
        gun_2 = gun_3;
        System.out.println("Вывод данных из метода SWAP: ");
        System.out.println(gun_1);
        System.out.println(gun_2);
        System.out.println("Вывод данных из метода SWAP закончен!");
    }
    // Некая попытка решить вопрос, т.е. метод должен все же что-то возвращать,
    // чтобы все работало, как просили (или тупо сделать все напрямую в main методе, что проще).
    // Нам нужно вернуть не просто один объект или значение, значит будем возвращать коллекцию.
    public static Map<String,Integer> prim_swap_map (int gun_1, int gun_2) {
        // 'Map' работает по принципу складирования в себя пары 'ключ-значение'
        Map<String,Integer> swap_arrey = new HashMap<>();
        // Буторим переменные
        int gun_3 = gun_1;
        gun_1 = gun_2;
        gun_2 = gun_3;
        // Задаем имена ключей
        String gun_name_1 = "gun_1";
        String gun_name_2 = "gun_2";
        // Пакуем пары в 'Map'
        swap_arrey.put(gun_name_1, gun_1);
        swap_arrey.put(gun_name_2, gun_2);
        // Возвращаем нашу коллекцию в мир
        return swap_arrey;
    }
}
