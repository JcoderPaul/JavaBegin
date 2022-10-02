package Less_14_myFirstArrayList;

import java.util.ArrayList;
import java.util.List;

public class Less_14_ArrayList_7_Meth {

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
        Метод *.contains дает true в случае нахождения искомого объекта и false если нет.
        */
        String find_obj = "Ну, а когда коляска подкатила,";
        boolean res_of_find = storki_vsv.contains(find_obj);
        System.out.println("(Работает метод - .contains) Искомый объект найден -> " + res_of_find);

        String find_obj_2 = "Мы, правда, третьего насильно затащили.";
        boolean res_of_find_2 = storki_vsv.contains(find_obj_2);
        System.out.println("(Работает метод - .contains) Искомый объект найден -> " + res_of_find_2);

        System.out.println("\n--------------------------------------------------------------");
        // Метод позволяющий выводить массивы и коллекции без цикла - toString(), правда в строку.
        System.out.println(storki_vsv.toString());
        System.out.println("\n--------------------------------------------------------------");
        List<Integer> myIntArr = new ArrayList<>();
        myIntArr.add(23);
        myIntArr.add(233);
        myIntArr.add(123);
        myIntArr.add(2);
        System.out.println(myIntArr.toString());

    }
}
