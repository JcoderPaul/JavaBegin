package Less_14_myFirstArrayList;

import java.util.ArrayList;
import java.util.List;

public class Less_14_ArrayList_2_Meth {
    public static void main(String[] args) {
        // Создали ArrayList
        List<String> str_list_1 = new ArrayList<>();
        // Положили в него 5-ть элементов, без конкретизации места (индекса куда).
        str_list_1.add("Рог");
        str_list_1.add("изобилия");
        str_list_1.add("сделан");
        str_list_1.add("из");
        str_list_1.add("иллюзий!");
        for (String arr_for_prn : str_list_1) {
            System.out.print(arr_for_prn + " ");
        }
        System.out.println("\n--------------------------------------------------------------");
        for (int i = 0; i < str_list_1.size(); i++) {
            System.out.println("Под индексом -> " + i + " лежит " + str_list_1.get(i));
        }
        System.out.println("\n--------------------------------------------------------------");
        /*
        На конкретное второе место в лист добавили элемент, расширив его. И в первом и во втором,
        случае использовали метод *.add(), который перегружен.
        !!! Однако, хотя лист, динамическая структура, мы не можем добавить элемент куда угодно,
        в надежде на магию Java !!! ->->->
        */
        str_list_1.add(2, ", был ");
        for (String arr_for_prn : str_list_1) {
            System.out.print(arr_for_prn + " ");
        }
        System.out.println("\n--------------------------------------------------------------");
        /*
        ->->-> Например, наш лист имеет длину 6-элементов, а мы с дури плюхаем элемент на 8-е место,
        среда честно пропускает наш шлемаз, а вот на этапе выполнения кода прилетает исключение:
        Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 8, Size: 6
        */
        System.out.println("Длинна (размер) List-a -> " + str_list_1.size());
        str_list_1.add(8,"Но иллюзиям не суждено сбыться!");
    }
}
