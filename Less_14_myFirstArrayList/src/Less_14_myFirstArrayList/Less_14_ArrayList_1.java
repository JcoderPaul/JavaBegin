package Less_14_myFirstArrayList;

import java.util.ArrayList;
import java.util.List;

public class Less_14_ArrayList_1 {
    public static void main(String[] args) {
        // Лист класса Integer (коллекция интерфейса List), в данном случае,
        // это узкоспециализированный лист, элементами которого являются Integer
        List<Integer> myListOfInt = new ArrayList<>();
        myListOfInt.add(3);
        myListOfInt.add(5);
        for (Integer int_to_print:myListOfInt){
            System.out.println(int_to_print);
        }
        System.out.println("\n--------------------------------------------------------------");
        // Лист различных объектов, т.к. у всех классов в Java один родитель Object
        ArrayList uniList = new ArrayList<>();
        // Добавляем различные элементы в массив
        uniList.add(new Car());
        uniList.add(new Student());
        uniList.add(new StringBuilder("AddToList"));
        uniList.add("StringToList");
        // Вывод на печать нашего массива
        for (Object list_to_screen : uniList) {
            System.out.println(list_to_screen);
        }
        System.out.println("\n--------------------------------------------------------------");
        // Вариант с инициализацией емкости, не размера или длинны (length), а именно емкости,
        // т.е. в данном случае имея резерв на 30 ячеек в памяти мы можем заполнить лишь одну
        // из них.
        List<String> str_list = new ArrayList<>(30);
        str_list.add("Fucking day!");
        // Текущий результат длины = 1 (при резерве 29, уже, плюс потенциал роста, в ходе работы
        // программы)
        System.out.println("Длинна динамического массива : " + str_list.size());
        System.out.println("\n--------------------------------------------------------------");
        // Вариант инициализации другим листом, и при создании таким образом, листы будут разные
        // (объекты имплиментриующие List будут разными, если это интерфейс)
        List<String> two_str_list = new ArrayList<>(str_list);
        // Две ссылки на один объект
        List<String> three_str_list = two_str_list;
        System.out.println("Ссылка на один и тот же объект -> " + (str_list == two_str_list));
        System.out.println("Ссылка на один и тот же объект -> " + (three_str_list == two_str_list));
    }
}

class Car{
    @Override
    public String toString() {
        return "Car{ Объект класса Car для Тестов}";
    }
}
class Student{
    @Override
    public String toString() {
        return "Car{ Объект класса Student для Тестов}";
    }
}