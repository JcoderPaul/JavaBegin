package Less_10_myStringMethod;

public class Less_10_Part_7_LowerUpper {
    public static void main(String[] args) {
        String str_1 = " Привет большой ветреный мир! "; // Обратите внимание по краям есть пробелы
        System.out.println("Длина строки с пробелами ->" + str_1.length());
        System.out.println("-------------------------------------------------------------------");
        // Все символы делаем заглавными
        System.out.println(str_1.toUpperCase());
        System.out.println("-------------------------------------------------------------------");
        // Все символы делаем прописными
        System.out.println(str_1.toLowerCase());

    }
}
