package Less_21_myFirstWrapper;

import java.util.ArrayList;
import java.util.List;

public class Less_21_myFirstWrapper_Less_1 {
    public static void main(String[] args) {
        /*
        Вот такого листа -> List<int> myIntegerList = new ArrayList<>(); -> мы создать не сможем,
        потому что коллекции содержат только ссылочные типы данных, а не примитивные, поэтому
        существуют классы обертки (и процесс упаковки и распаковки). Этим они отличаются от массивов,
        т.е. так -> int[] myIntArray = new int[5]; легко.
        */
        List<Integer> myIntList = new ArrayList<>();
        myIntList.add(5); // Примитивный тип данных упаковывается в ссылочный и помещается в коллекцию.
        /*
        Есть боксинг(автобоксинг) когда примитивный тип данных превращается в ссылочный и анбоксинг -
        обратный процесс.
        */
        int index_zero = myIntList.get(0); // Ссылочную переменную превратили в примитивный тип (анбоксинг).
        System.out.println(index_zero); // 5
        Number future_int = new Integer(10); // Переменная класса Number ссылается на объект Integer
        int simple_int = (int) future_int; // Ссылочную переменную кастомизировали к 'int' переменной
        System.out.println(simple_int);
    }
}
