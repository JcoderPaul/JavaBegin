package Less_25_myFirstException_ch_2;

import Less_25_myFirstException_ch_2.MeClassesException.MyHWException;

/*
Создайте собственный класс-исключение - наследник класса Exception.
Создайте метод, выбрасывающий это исключение. Вызовите этот метод
и отловите исключение. Вывести stack trace в консоль.
*/
public class Less_25_myFirstException_Less_12 {
    public static void main(String[] args) {
        try {
            testExceptionMeth();
        } catch (MyHWException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    private static void testExceptionMeth() throws MyHWException {
        throw new MyHWException("Test my Exception");
    }
}
