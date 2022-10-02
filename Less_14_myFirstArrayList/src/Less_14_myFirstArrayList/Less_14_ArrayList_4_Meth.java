package Less_14_myFirstArrayList;

import java.util.ArrayList;
import java.util.List;

public class Less_14_ArrayList_4_Meth {
    public static void main(String[] args) {
        // Создали ArrayList
        List<String> str_list_1 = new ArrayList<>();
        // Положили в него 5-ть элементов, без конкретизации места (индекса куда).
        str_list_1.add("Казнить");
        str_list_1.add(",");
        str_list_1.add("нельзя");
        str_list_1.add(",");
        str_list_1.add("помиловать!");
        int correct_index = 1;
        /*
        Удаляем элемент листа по индексу, при текущем варианте метода (аргументом является индекс)
        в случае успеха, мы получим элемент, который был удален и естественно удаление его из листа.
        Фэилом тут будет исключение, если мы по каким то причинам вылетим за границы листа.
        */
        String del_str = str_list_1.remove(correct_index);
        System.out.println("Удалили элемент -> '" + del_str +"'" + " с индексом " + correct_index);
        for (String arr_for_prn:str_list_1) {
            System.out.print(arr_for_prn + " ");
        }
        System.out.println("\n--------------------------------------------------------------");
        // Меняем содержимое листа по индексу
        str_list_1.set(str_list_1.size() - 1, "отпустить, ");
        // Добавляем в лист по индексу
        str_list_1.add(str_list_1.size(), "убогого.");
        for (String arr_for_prn:str_list_1) {
            System.out.print(arr_for_prn + " ");
        }
        System.out.println("\n--------------------------------------------------------------");
        /*
        Мы можем удалять элементы листа по индексу, а можем по структуре объекта (т.е. сам объект)
        если таковой в листе есть, результатом метода *.remove(), в случае удаления объекта,
        результатом будет 'true' если фокус удался (элемент удалится из листа) и 'false' если
        элемент не был найден, т.е. лист не изменится. (см. пример ниже)
        */
        boolean yes_or_no = str_list_1.remove("отпустить, ");
        System.out.println("Объект листа удален -> " + yes_or_no);
        boolean yes_or_no_1 = str_list_1.remove("убогого.");
        System.out.println("Объект листа удален -> " + yes_or_no_1);
        boolean yes_or_no_2 = str_list_1.remove(" , ");
        System.out.println("Объект листа удален -> " + yes_or_no_2);
        str_list_1.add("!");
        for (String arr_for_prn:str_list_1) {
            System.out.print(arr_for_prn + " ");
        }

    }
}
