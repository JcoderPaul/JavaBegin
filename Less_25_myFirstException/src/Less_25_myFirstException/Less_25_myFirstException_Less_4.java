package Less_25_myFirstException;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Less_25_myFirstException_Less_4 {
    public static void main(String[] args) {
        System.out.println("-------------------- Работа с примитивными типами данных в RETURN --------------------");
        System.out.println("Return метода 'testPrimitiveReturnOfExept' -> "
                + testPrimitiveReturnOfExept());
        System.out.println("-------------------- Работа со ссылочными типами данных в RETURN --------------------");
        System.out.println("Return метода 'testRefReturnOfExept' -> "
                + testRefReturnOfExept());
    }

    static int testPrimitiveReturnOfExept(){
        int test_var;
        // Относительный путь к искомому файлу для IntelliJ IDEA
        File take_file = new File("..\\src\\data\\not_find.txt");
        try {
            test_var = 1;
            System.out.println("1. Try");
            System.out.println("1. Try блок запомнил 'test_var'-> " + test_var);
            FileInputStream myFis = new FileInputStream(take_file);
        } catch (FileNotFoundException e) {
            test_var = 2;
            System.out.println("2. Catch -> " + e);
            System.out.println("2. Catch блок запомнил 'test_var'-> " + test_var);
            /*
            В случае отлова исключения переменная test_var принимает значение 2 и метод
            возвращает его, несмотря на то, что в блоке finally она, переменная, переназначается
            на 3, все равно возвращается значение 2. Т.е. в данном случае МЕТОД фиксирует и
            возвращает значение return, условно не чистую - test_var, а ее некая копия - test_var'.
            */
            return test_var;
        } finally {
            test_var =3;
            System.out.println("3. Finally");
            System.out.println("3. Finally блок запомнил 'test_var'-> " + test_var);
        }
        return test_var;
    }
    /*
    В методе, где возвращается ссылочная переменная, все выглядит немного не так, как
    в предыдущем примере (методе). В случае отлова исключения переменная sb_test изменяется
    по средствам метода *.append(), и вот тут интересный момент, имея несколько ссылок на один
    объект можно менять его, по средствам любой из этих ссылок. Т.е. если в return фиксируется
    не sb_test, в некая ее копия sb_test', то она все равно ссылается на тот же объект. Значит
    любые изменения объекта, в каждом последующем блоке (try-catch-finally) будут фиксироваться
    и возвращаться через return (!!!Естественно если объект изменяемый mutable!!!).
    */
    static StringBuilder testRefReturnOfExept(){
        StringBuilder sb_test = new StringBuilder("Мы стартуем и приходим в ...");
        // Относительный путь к искомому файлу для IntelliJ IDEA
        File take_file = new File("..\\src\\data\\not_find.txt");
        try {
            sb_test.append(" try блок, в затем в ...");
            System.out.println("1. Try");
            System.out.println("1. Try блок запомнил 'test_var'-> " + sb_test);
            FileInputStream myFis = new FileInputStream(take_file);
        } catch (FileNotFoundException e) {
            sb_test.append(" catch блок, как вариант, а уже затем в ...");
            System.out.println("2. Catch -> " + e);
            System.out.println("2. Catch блок запомнил 'test_var'-> " + sb_test);
            return sb_test;
        } finally {
            sb_test.append(" finally блок.");
            System.out.println("3. Finally");
            System.out.println("3. Finally блок запомнил 'test_var'-> " + sb_test);
        }
        return sb_test;
    }
}
