package Less_10_myStringMethod;

public class Less_10_Part_8_Contains {

    public static void main(String[] args) {
        String str_1 = " Привет большой ветреный мир! "; // Обратите внимание по краям есть пробелы
        System.out.println("Длина строки с пробелами ->" + str_1.length());
        System.out.println("-------------------------------------------------------------------");
        // Все символы делаем заглавными
        String my_Upper_String = str_1.toUpperCase();
        System.out.println(my_Upper_String);
        System.out.println("-------------------------------------------------------------------");
        // Все символы делаем прописными
        String my_Lower_String = str_1.toLowerCase();
        System.out.println(my_Lower_String);
        System.out.println("-------------------------------------------------------------------");
        // Задаем строку поиска, результатом поиска будет true/false
        String content_string_1 = "БОЛ";
        System.out.println("Есть ли в нашем предложении '" + my_Upper_String +
                           "' строка '" + content_string_1 + "' -> " +
                           my_Upper_String.contains(content_string_1));
        System.out.println("Есть ли в нашем предложении '" + my_Lower_String +
                           "' строка '" + content_string_1 + "' -> " +
                           my_Lower_String.contains(content_string_1));
        String content_string_2 = "бол";
        System.out.println("Есть ли в нашем предложении '" + my_Lower_String +
                "' строка '" + content_string_2 + "' -> " +
                my_Lower_String.contains(content_string_2));
        System.out.println("Есть ли в нашем предложении '" + my_Upper_String +
                "' строка '" + content_string_2 + "' -> " +
                my_Upper_String.contains(content_string_2));
    }
}
