package Less_25_myFirstException_ch_2;

import Less_25_myFirstException_ch_2.MeClassesException.MyHWException;
import Less_25_myFirstException_ch_2.MeClassesException.MyHWExceptionTwo;

/*
Создайте собственный класс-исключение - наследник класса RuntimeException.
Добавьте в конструктор своего класса возможность указания сообщения.
*/
public class Less_25_myFirstException_Less_13 {
    public static void main(String[] args) {
        try {
            testExceptionMeth();
        } catch (MyHWExceptionTwo e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
            e.printStackTrace();
        }
    }
    /*
    Если наше исключение наследуется от RuntimeException,
    то нет необходимости, указывать его в сигнатуре текущего
    метода, как это было в предыдущем примере.
    */
    private static void testExceptionMeth() {
        throw new MyHWExceptionTwo(new RuntimeException("RunTime Exception"));
    }
}
