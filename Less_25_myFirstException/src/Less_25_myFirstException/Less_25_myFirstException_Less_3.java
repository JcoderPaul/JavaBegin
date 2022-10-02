package Less_25_myFirstException;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Less_25_myFirstException_Less_3 {
    public static void main(String[] args) {
        System.out.println(testOfExept());
    }

    static String testOfExept(){
        // Относительный путь к искомому файлу для IntelliJ IDEA
        File take_file = new File(".\\src\\data\\not_find.txt");
        try {
            System.out.println("1. Try");
            FileInputStream myFis = new FileInputStream(take_file);
            return "1. Сработал return блока TRY";
        // Для проверки блока catch достаточно изменить путь к файлу
        // и словить исключение
        } catch (FileNotFoundException e) {
            System.out.println("2. Catch -> " + e);
            return "2. Сработал return блока CATCH";
        } finally {
            System.out.println("3. Finally");
            return "3. Сработал return блока FINALLY";
        }
    }
}
