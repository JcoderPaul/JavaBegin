package Less_25_myFirstException_ch_2;

import Less_25_myFirstException_ch_2.MeClassesException.MyHWExceptionTwo;
/*
Стимулируйте выброс одного из исключений JAVA, отловите
его и выбросьте свое собственное, указав в качестве
причины отловленное.

Снова используем System.err.println(), чтобы отследить
последовательность вывода данных и отлова исключений.
*/
public class Less_25_myFirstException_Less_14 {
    public static void main(String[] args) {
        System.err.println("Запуск программы\n");
        try {
            myOwnCatchException();
        } catch (Exception exception){
            System.err.println("!!! Catch myOwnCatchException() in MAIN !!!\n");
            exception.printStackTrace();
        }
        System.err.println("\nОстановка программы");
    }

    private static void myOwnCatchException() {
        try {
            testExceptionMeth();
        } catch (RuntimeException exceptionForForwarding) {
            System.err.println("--- Catch exception in *.myOwnCatchException() ---");
            throw new MyHWExceptionTwo(exceptionForForwarding);
        }
    }
    private static void testExceptionMeth() {
        throw new RuntimeException("\n*** RunTime Exception from *.testExceptionMeth() ***");
    }
}
