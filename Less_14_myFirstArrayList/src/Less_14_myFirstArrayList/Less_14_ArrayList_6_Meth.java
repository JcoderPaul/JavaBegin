package Less_14_myFirstArrayList;

import java.util.ArrayList;
import java.util.List;

public class Less_14_ArrayList_6_Meth {
    public static void main(String[] args) {
        List<String> storki_vsv = new ArrayList<>();
        storki_vsv.add("Я пил из горлышка, с устатку и не евши,");
        storki_vsv.add("Но я, как стекло, был, то есть остекленевший,");
        storki_vsv.add("Ну, а когда коляска подкатила,");
        storki_vsv.add("Но я, как стекло, был, то есть остекленевший,");
        storki_vsv.add("Тогда у нас было семьсот на рыло.");
        storki_vsv.add("Но я, как стекло, был, то есть остекленевший,");
        for (String arr_for_prn : storki_vsv) {
            System.out.println(arr_for_prn);
        }
        System.out.println();
        System.out.println("Размер листа -> " + storki_vsv.size());

        System.out.println("\n--------------------------------------------------------------");
        /*
        Получаем индекс искомого элемента листа, если найдено, то возвращается, значение индекса,
        если нет, то '-1'.
        !!! Если в листе есть повторяющиеся элементы, то выводится, первый найденный !!!
        */
        String find_obj = "Но я, как стекло, был, то есть остекленевший,";
        int find_ind = storki_vsv.indexOf(find_obj);
        System.out.println("(Работает метод - .indexOf) Искомый объект находится на -> " + find_ind + " месте.");

        System.out.println("\n--------------------------------------------------------------");
        /*
        Получаем последний индекс искомого элемента листа, в случае его повторения,
        если найдено, то возвращается, значение индекса, если нет, то '-1'.
        !!! Если в листе есть повторяющиеся элементы, то выводится, последний найденный !!!
        */
        String find_obj_2 = "Но я, как стекло, был, то есть остекленевший,";
        int find_ind_2 = storki_vsv.lastIndexOf(find_obj);
        System.out.println("(Работает метод - .lastIndexOf) Искомый объект находится на -> " + find_ind_2 + " месте.");

        System.out.println("\n--------------------------------------------------------------");
        /*
        Метод *.isEmpty() возвращает true, если массив пустой и false если содержит хотя бы один элемент
        */
        boolean is_empty_list = storki_vsv.isEmpty();
        System.out.println("(Работает метод - *.isEmpty()) Массив пуст -> " + is_empty_list);

        System.out.println("\n--------------------------------------------------------------");
        // Метод для очистки всего содержимого листа *.clear()
        System.out.println("Чистим лист.");
        storki_vsv.clear();
        for (String arr_for_prn : storki_vsv) {
            System.out.println(arr_for_prn);
        }
        System.out.println("Размер листа -> " + storki_vsv.size());
        System.out.println("\n--------------------------------------------------------------");
        /*
        Метод *.isEmpty() возвращает true, если массив пустой и false если содержит хотя бы один элемент.
        Проверяем наш массив после чистки.
        */
        boolean is_empty_list_2 = storki_vsv.isEmpty();
        System.out.println("(Работает метод - *.isEmpty()) Массив пуст -> " + is_empty_list_2);


    }
}
