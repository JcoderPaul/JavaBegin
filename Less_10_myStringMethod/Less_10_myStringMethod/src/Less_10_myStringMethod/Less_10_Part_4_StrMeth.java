package Less_10_myStringMethod;

public class Less_10_Part_4_StrMeth {
    public static void main(String[] args) {
        String str_1 = " Привет большой ветреный мир! "; // Обратите внимание по краям есть пробелы
        System.out.println(str_1.length());
        // Рассмотрим метод НАЧИНАЕТСЯ ЛИ (true/false)
        // Задаем подстроку поиска
        String findShortStr = " При";
        String findShortStr_2 = "Ку";
        // Активируем метод поиска подстроки 'начиная с' - startsWith(),
        // который возвращает Да(true)/Нет(false)
        boolean say_yes = str_1.startsWith(findShortStr);
        boolean say_no = str_1.startsWith(findShortStr);
        System.out.println("Наша строка начинается с '" + findShortStr + "' -> " + say_yes);
        System.out.println("Наша строка начинается с '" + findShortStr_2 + "' -> " + say_no);
        System.out.println("-------------------------------------------------------------------");
        /* Структура индексов следующая:
        _ П р и в е т _ б о л  ь  ш  о  й  _  в  е  т  р  е  н  ы  й  _  м  и  р  !  _
        0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29
        Значит:
        - первый 'вет' стартует с индекса 4;
        - второй с индекса 16;
        */
        String findShortStr_3 = "вет";
        int first_ind = 4;
        int first_ind_2 = 16;
        boolean say_oh_yes = str_1.startsWith(findShortStr_3,first_ind);
        boolean oh_yes_again_my_dear = str_1.startsWith(findShortStr_3,first_ind_2);
        System.out.println("Наша строка начинается с '" + findShortStr_3 +
                           "' -> " + say_oh_yes);
        System.out.println("Наша строка начинается с '" + findShortStr_3 +
                           "' -> " + oh_yes_again_my_dear);
        System.out.println("-------------------------------------------------------------------");
        // Рассмотрим метод ЗАКАНЧИВАЕТСЯ ЛИ (true/false) наша строка на...
        String findEndStr = "! ";
        String findEndStr_2 = "Yehh";
        boolean say_yes_to_end = str_1.endsWith(findEndStr);
        boolean say_no_to_end = str_1.endsWith(findEndStr_2);
        System.out.println("Наша строка заканчивается на '" + findEndStr +
                "' -> " + say_yes_to_end);
        System.out.println("Наша строка заканчивается на '" + findEndStr_2 +
                "' -> " + say_no_to_end);
        System.out.println("-------------------------------------------------------------------");

    }
}
