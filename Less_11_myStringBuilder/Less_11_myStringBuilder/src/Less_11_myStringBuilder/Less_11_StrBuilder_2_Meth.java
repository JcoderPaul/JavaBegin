package Less_11_myStringBuilder;

public class Less_11_StrBuilder_2_Meth {
    public static void main(String[] args) {

        // Дефолтный размер билдера 16 символов
        StringBuilder str_sb_1 = new StringBuilder();
        // Инициализировали билдер строкой
        StringBuilder str_sb_2 = new StringBuilder("Hello World");
        // Задали первоначальный размер билдера
        StringBuilder str_sb_3 = new StringBuilder(50);
        // Один билдер создается из другого билдера
        StringBuilder str_sb_4 = new StringBuilder(str_sb_2);
//******************************************************************************************************
        // Длинна билдера с 'Hello World' = 11
        System.out.println(str_sb_2.length());
        // Длинна билдера с заданным capacity = 0,
        // т.к. пустая емкость без содержания ничего не содержит
        System.out.println(str_sb_3.length());
        // Длинна билдера созданного на базе другого билдера 'Hello World' = 11
        System.out.println(str_sb_4.length());
//******************************************************************************************************
        // Находим символ по индексу
        System.out.println(str_sb_2.charAt(6));
//******************************************************************************************************
        // Находим индекс по подстроке
        System.out.println(str_sb_2.indexOf("or"));
        // Вывод, как и с обычным методом String, будет '-1' т.к. такого символа в строке нет.
        System.out.println(str_sb_2.indexOf("Я"));
        // Ищем индекс символа 'l', начиная с 5-го символа.
        System.out.println(str_sb_2.indexOf("l",5));
//******************************************************************************************************
        // Метод нахождения подстроки, начиная с заданного индекса
        System.out.println(str_sb_2.substring(6)); // World
        // Метод нахождения подстроки со стартового индекса, по некий финишный
        System.out.println(str_sb_2.substring(0,4)); // Hell
    }
}
