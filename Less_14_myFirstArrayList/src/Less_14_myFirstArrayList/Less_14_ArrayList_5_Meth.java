package Less_14_myFirstArrayList;

import java.util.ArrayList;
import java.util.List;

public class Less_14_ArrayList_5_Meth {
    public static void main(String[] args) {
        List<String> storki_1_2 = new ArrayList<>();
        storki_1_2.add("Считать по нашему, мы выпили немного.");
        storki_1_2.add("Не вру, ей-богу. Скажи, Серега!");
        List<String> storki_3_4 = new ArrayList<>();
        storki_3_4.add("И если б водку гнать не из опилок,");
        storki_3_4.add("То что б нам было с пяти бутылок?");
        /*
        Добавляем один лист целиком, в другой, к его последнему элементу.
        Если все удалось, получаем true и изменения первоначального листа,
        нет - false или исключение.
        */
        boolean yes_or_no = storki_1_2.addAll(storki_3_4);
        System.out.printf("Удалось ли добавить элементы в лист -> " + yes_or_no);
        System.out.println("\n--------------------------------------------------------------");
        for (String arr_for_prn : storki_1_2) {
            System.out.println(arr_for_prn);
        }
        System.out.println("\n--------------------------------------------------------------");
        /*
        Добавляем один лист целиком, в другой, по указанному индексу.
        Если все удалось, получаем true и изменения первоначального листа,
        нет - false или исключение.
        */
        List<String> storki_5_8 = new ArrayList<>();
        storki_5_8.add("Вторую пили близ прилавка в закуточке,");
        storki_5_8.add("Потом не помню — дошел до точки.");
        List<String> storki_6_7 = new ArrayList<>();
        storki_6_7.add("Но это были еще цветочки,");
        storki_6_7.add("Потом в скверу, где детские грибочки.");

        boolean yes_or_no_2 = storki_5_8.addAll(1,storki_6_7);
        System.out.printf("Удалось ли добавить элементы в лист -> " + yes_or_no_2);
        System.out.println("\n--------------------------------------------------------------");
        for (String arr_for_prn : storki_5_8) {
            System.out.println(arr_for_prn);
        }

        System.out.println("\n--------------------------------------------------------------");
        // Метод для очистки всего содержимого листа *.clear()
        System.out.println("Чистим лист.");
        storki_5_8.clear();
        for (String arr_for_prn : storki_5_8) {
            System.out.println(arr_for_prn);
        }
        System.out.println("Размер листа -> " + storki_5_8.size());
    }
}
