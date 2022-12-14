package Other_Lambda_Less_4;

public class Lambda_Less_4_1 {
    public static void main(String[] args) {
        /*
        Шаг 3. (вариант 1) Создаем объект, метод, которого принимает в качестве аргумента другой
        объект, реализующий единственный метод функционального интерфейса, возвращающий int.
        */
        System.out.println("-------------------------------------------------------------");
        GetIntFromString gifs = new GetIntFromString();
        /*
        Используем анонимный класс в качестве аргумента в методе 'getIntRes', естественно
        вместо анонимного класса можно использовать лямбда выражение (см.ниже).
        */
        System.out.println(gifs.getIntRes("радуга", new IntBack() {
            @Override
            public int takeVar(String str_in) {
                return str_in.length();
            }
        }));
        System.out.println("-------------------------------------------------------------");
        // Реализуем метод, который в данном случае определяет длину заданной строки (через лямбда выражение)
        System.out.println(gifs.getIntRes("эвакуация", str -> str.length()));
        System.out.println(gifs.getIntRes("  эвакуация   ", // Чуть усложняем нашу лямбду
                                          str -> { // Строка передается в лямбду для обработки
                                          str = str.trim(); // Обрезаем пробелы по краям и переназначаем ссылку
                                          str = str.concat(" прошла быстро"); // Соединяем строки и переназначаем
                                          System.out.println(str); // Выводим на печать, для контроля
                                          return str.length();})); // Метод должен вернуть int (в нашем случае длину строки)
        System.out.println("-------------------------------------------------------------");
        // Анонимный класс имплементирует 'IntBack' и его метод 'takeVar'
        // находит индекс символа 'о' в заданной строке (это не лямбда)
        System.out.println(new IntBack() {
            @Override
            public int takeVar(String str_in) {
                return str_in.indexOf('о');
            }
        }.takeVar("анонимность"));
        System.out.println("-------------------------------------------------------------");
        /*
        Шаг 3. (вариант 2) Создается статический метод, принимающий в качестве аргумента,
        объект реализующий метод функционального интерфейса (либо проименованный, либо анонимный)
        */
        String str_for_experience = "гравитация"; // Строка для опытов
        string_work(str_for_experience, new IntBack() { // Статический метод принимает анонимный класс
            // и перезаписывает метод функционального интерфейса.
            @Override
            public int takeVar(String str_in) {
                return str_in.length();
            }
        });
        System.out.println("-------------------------------------------------------------");
        // Используем статический метод для работы с объектом реализующим
        // метод функционального интерфейса через лямбда выражение.
        string_work("гордыня", (str) -> str.indexOf("ды"));
        string_work("гордыня", (str) -> str.length());
        string_work("нанотехнологии", (str) -> str.indexOf('н',5));
        string_work("нанотехнологии", (str) -> {str = str.replace("нан","микр");
                                                   System.out.println(str);
                                                   return str.indexOf('н');});


    }
    /*
    Шаг 2. (вариант 2) Создаем статический метод который принимает в качестве аргумента объект реализующий
    метод функционального интерфейса и перезаписывает его.

    Либо создается метод, который принимает в качестве аргумента анонимный класс реализующий
    метод функционального интерфейса.

    В нашем случае статический метод принимает ссылку на объект реализующий метод функционального интерфейса.
    Поскольку метод должен возвращать значение int, то в коде метода мы можем реализовать любую логику, которая
    по итогу своей работы вернет целочисленный результат.
    */
    static void string_work(String str, IntBack ib){
        System.out.println(ib.takeVar(str));
    }
}
/*
Шаг 1. Создали интерфейс с одним методом (функциональный интерфейс)
*/
interface IntBack{
    /*
    Его метод должен получить на вход строку, а вернуть int. Как будут реализовывать этот метод,
    классы подписавшиеся на этот интерфейс, нас не волнует. Нас волнует, что будет на входе (String)
    и, чего ждать на выходе (int).
    */
    int takeVar(String str_in);
}
/*
Шаг 2. (вариант 1) Создаем класс, в котором есть метод, принимающий в качестве аргумента объект
реализующий метод функционального интерфейса.
*/
class GetIntFromString{
    // Метод принимает два аргумента, строку (ссылочный тип данных) и объект (ссылочный тип данных)
    public int getIntRes(String str, IntBack intBack) {
        /*
        Объект 'intBack' реализует метод функционального интерфейса и принимает в себя строку,
        на выходе он возвращает int (но самое главное, что мы, до сих пор, не видим чего же этот
        метод делает, как он реализуется, чтобы вернуть int).
        */
        return intBack.takeVar(str);
    }
}