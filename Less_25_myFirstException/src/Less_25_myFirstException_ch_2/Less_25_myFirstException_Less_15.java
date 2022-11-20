package Less_25_myFirstException_ch_2;
/*
Создайте метод случайным образом выбрасывающий одно из 3-х видов
исключений. Вызовите этот метод в блоке try-catch, отлавливающее
любое из трех.
*/
import Less_25_myFirstException_ch_2.MeClassesException.MyHWExceptionTwo;

import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Random;

public class Less_25_myFirstException_Less_15 {
    private static final Map<Integer, Throwable> RANDOMEXCEPTION = Map.of(
            0, new RuntimeException("0 - RuntimeException"),
            1, new FileNotFoundException("1 - FileNotFoundException"),
            2, new IndexOutOfBoundsException("2 - IndexOutOfBoundsException")
    );

    public static void main(String[] args) {
        System.err.println("Старт программы\n");

        Random rndForExc = new Random();
        int toScreen = rndForExc.nextInt(3);
        System.err.println("Ключ элемента Map -> " + toScreen);
        try {
            myExceptionGenerator(toScreen);
        } catch (Throwable e) {
            e.printStackTrace();
        }

        System.err.println("\nФиниш программы");
    }

    private static void myExceptionGenerator(int randomVol) throws Throwable {
        Throwable exceptionFromMeth = RANDOMEXCEPTION.
                getOrDefault(randomVol, new MyHWExceptionTwo("Exception not found!"));
        throw exceptionFromMeth;
    }
}