package Less_25_myFirstException;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Less_25_myFirstException_Less_5 {
    public static void main(String[] args) {
        /*
        Ситуация повторяется. Как только мы обращаемся к методу, который может выбросить
        исключение, мы должны либо обработать его (заключить в блок try-catch-final) или
        прописать возможные риски в сигнатуре метода (т.е. throws...).
        */
        try {
            testPrimitiveReturnOfExept();
        } catch (FileNotFoundException e) {
            System.out.println(e);
            System.out.println("Окончательная обработка исключения в основном коде");
        }
    }
    /*
    Как только мы применили конструкцию 'throw exept;' в catch блоке текущего метода,
    т.е. перебросили исключение вверх по коду, мы должны объявить, что текущий метод
    может выкинуть исключение throws (например, FileNotFoundException)
    */
    static void testPrimitiveReturnOfExept() throws FileNotFoundException{
        // Относительный путь к искомому файлу для IntelliJ IDEA
        File take_file = new File("..\\src\\data\\not_find.txt");
        try {
            FileInputStream myFis = new FileInputStream(take_file);
        } catch (FileNotFoundException exept) {
            System.out.println("Частичная обработка исключения, пробросить дальше по коду");
            /*
            Если мы не можем в текущем методе обработать (или частично обработали) исключение
            мы можем пробросить исключение дальше в основной метод или в метод, который завершит
            обработку исключения. Для такого проброса применяется синтаксис приведенный ниже ->
            */
            throw exept;
        } finally {

        }
    }
}
