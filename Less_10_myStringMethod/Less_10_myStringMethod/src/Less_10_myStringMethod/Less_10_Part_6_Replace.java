package Less_10_myStringMethod;

public class Less_10_Part_6_Replace {
    public static void main(String[] args) {
        String str_1 = " Привет большой ветреный мир! "; // Обратите внимание по краям есть пробелы
        System.out.println("Длина строки с пробелами ->" + str_1.length());
        System.out.println("-------------------------------------------------------------------");
        // Замена символов на символы
        char findChar = 'в'; // Этот символ найти и заменить на ->
        char putChar = 'В'; // -> этот символ
        // Запускаем метод замены, он делает замену, но при этом не меняет первоначальную строку,
        // создает новую, см. вывод в консоль.
        String str_2 = str_1.replace(findChar,putChar);
        System.out.println("Результат замены -> " + str_2);
        System.out.println("Результат замены напрямую -> " + str_1.replace(findChar,putChar));
        System.out.println("Основная строка все так же хороша -> " + str_1);
        System.out.println("-------------------------------------------------------------------");
        // Тот же метод, но уже со строками(подстроками)
        String findSubStr = "ветре"; // Эту подстроку найти и заменить на ->
        String putSubStr = "солнеч"; // -> эту подстроку
        // Запускаем метод замены, он делает замену, но при этом не меняет первоначальную строку,
        // создает новую, см. вывод в консоль.
        String str_3 = str_1.replace(findSubStr,putSubStr);
        System.out.println("Результат замены -> " + str_3);
        System.out.println("Результат замены напрямую -> " + str_1.replace(findSubStr,putSubStr));
        System.out.println("Основная строка все так же строга и неизменна -> " + str_1);
        System.out.println("-------------------------------------------------------------------");

        // Тот же метод, но уже со строками(подстроками) которых нет в основной (с символами та же бадяга)
        String findSubStr_2 = "курчавый"; // Эту подстроку найти и заменить на ->
        String putSubStr_2 = "лысоватый"; // -> эту подстроку
        // Запускаем метод замены, он делает замену, но при этом не меняет первоначальную строку,
        // создает новую, см. вывод в консоль.
        String str_4 = str_1.replace(findSubStr_2,putSubStr_2);
        // Поскольку менять нечего, т.е. не найдена подстрока, то и результат замены отсутствует
        System.out.println("Результат замены -> " + str_4);
        System.out.println("Результат замены напрямую -> " + str_1.replace(findSubStr_2,putSubStr_2));
        System.out.println("-------------------------------------------------------------------");
        // Соединение строк методом concat, то же, что и '+'
        System.out.println(str_1.concat(str_2));
        System.out.println(str_1.concat(str_2).concat(str_3));

    }
}
