package Less_23_myFirstValueOf;

import java.util.Scanner;

public class Less_23_myFirstValueOf_Less_1 {
    public static void main(String[] args) {
//***************************************************************************************************
        /*
        Статический метод класса String для преобразования базового типа данных в строку.
        Т.е. String.valueOf() это перегруженный метод:
        （1）String.valueOf(boolean b): Преобразовать логическую переменную b в строку
        （2）String.valueOf(char c): Преобразовать переменную char в строку
        （3）String.valueOf(char[] data): Преобразовать данные массива char в строку
        （4）String.valueOf(char[] data, int offset, int count)： Конвертировать данные массива
            char из data [offset] для подсчета элементов в строку
        （5）String.valueOf(double d): Преобразовать двойную переменную d в строку
        （6）String.valueOf(float f): Преобразовать переменную с плавающей точкой f в строку
        （7）String.valueOf (int i): преобразовать переменную int i в строку
        */
        double my_dub = 102939939.939;
        boolean my_bool = true;
        long my_long = 1232874;
        char[] my_arr = { 'а', 'б', 'в', 'г', 'д', 'е', 'ё' };

        String my_dub_str = String.valueOf(my_dub);

        System.out.println("Возвращаемое значение: " + my_dub_str);
        System.out.println("Возвращаемое значение: " + String.valueOf(my_bool));
        System.out.println("Возвращаемое значение: " + String.valueOf(my_long));
        System.out.println("Возвращаемое значение: " + String.valueOf(my_arr));
//***************************************************************************************************
        // Статический метод класса Integer, Double valueOf(int i): возвращает соответствующий объект,
        // содержащий значение указанного типа.
        Integer my_int = Integer.valueOf(9);
        Double my_d_2 = Double.valueOf(5);
        // valueOf(String s): возвращает объект, содержащий значение указанного строкового
        // представления.
        Float my_f = Float.valueOf("80");
        // valueOf(String s, int radix): возвращает целочисленный объект, содержащий целое
        // значение указанного строкового представления, разобранного со значением системы счисления.
        Integer my_int_2 = Integer.valueOf("444",16);

        System.out.println(my_int);
        System.out.println(my_d_2);
        System.out.println(my_f);
        System.out.println(my_int_2);
    }
}

