package Less_14_myFirstArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Less_14_ArrayList_10_ListSort {
    public static void main(String[] args) {
        // Создаем пустой лист с емкостью 5
        List<String> color_list = new ArrayList<>();
        // Добавляем элементы в лист, при этом больше чем заявили, проблем нет!
        color_list.add("У");
        color_list.add("попа");
        color_list.add("была");
        color_list.add("собака,");
        color_list.add("он");
        color_list.add("ее");
        color_list.add("любил.");

        System.out.println("Размер листа: " + color_list.size());

        // Печатаем нашу радугу
        for (String value : color_list) {
            System.out.print(value + " ");
        }
        System.out.println("\n--------------------------------------------------------------");
        /*
        Тут используется методы класса Collection для сортировки данных
        */
        String[] rainbow_arr = new String[color_list.size()];
        rainbow_arr = color_list.toArray(rainbow_arr);
        System.out.println(" Лист после сортировки :");
        Collections.sort(color_list);
        for (String sort_arr:color_list) {
            System.out.print(sort_arr + " ");
        }
        System.out.println();
        System.out.println(" Первоначальный массив как есть :");
        for (String sort_arr:rainbow_arr) {
            System.out.print(sort_arr + " ");
        }
        System.out.println("\n--------------------------------------------------------------");
        List<Integer> int_liast_to_sort = Arrays.asList(2,4,-1,45,23,1,0,45,71);
        Collections.sort(int_liast_to_sort);
        System.out.print(int_liast_to_sort);

    }
}
