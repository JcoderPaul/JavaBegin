package Less_14_myFirstArrayList;

import java.util.ArrayList;
import java.util.List;

public class Less_14_ArrayList_8_MethClone {
    public static void main(String[] args) {
        StringBuilder str_sb_1 = new StringBuilder("Раз");
        StringBuilder str_sb_2 = new StringBuilder("Два");
        StringBuilder str_sb_3 = new StringBuilder("Три");
        ArrayList<StringBuilder> sb_list_one = new ArrayList<>();
        sb_list_one.add(str_sb_1);
        sb_list_one.add(str_sb_2);
        sb_list_one.add(str_sb_3);
        // Метод *.clone возвращает Object по этому приходится делать ( костамизацию )
        ArrayList<StringBuilder> sb_list_two = (ArrayList<StringBuilder>) sb_list_one.clone();
        System.out.println("Совпадают ли ссылки элементов массивов на объекты -> "
                           + (sb_list_one.get(0) == sb_list_two.get(0)));
        System.out.println("Совпадают ли листы -> " + (sb_list_one == sb_list_two));
        for (int i = 0; i < sb_list_one.size() && i < sb_list_two.size(); i++){
            System.out.println(i + " элемент листа 1 '" + sb_list_one.get(i) +
                                   "' элемент листа 2 '" + sb_list_two.get(i) + "'");
        }
        System.out.println("\n--------------------------------------------------------------");
        // Изменили объект из ссылки от второго листа
        sb_list_two.get(1).append(" - two");
        // Проверяем, отразились ли изменения на втором листе
        // (ссылки то, элементов массивов, идут на те же объекты)
        for (int i = 0; i < sb_list_one.size() && i < sb_list_two.size(); i++){
            System.out.println(i + " элемент листа 1 '" + sb_list_one.get(i) +
                    "' элемент листа 2 '" + sb_list_two.get(i) + "'");
        }
        System.out.println("\n--------------------------------------------------------------");
        // Поскольку в листах хранятся только ссылки, а клонирование уже проведено, то
        // мы можем переназначить, например, ссылку последнего элемента первого листа,
        // и посмотреть, куда ссылается подобный элемент второго листа.
        sb_list_one.set(2, new StringBuilder("Четыре"));
        for (int i = 0; i < sb_list_one.size() && i < sb_list_two.size(); i++){
            System.out.println(i + " элемент листа 1 '" + sb_list_one.get(i) +
                    "' элемент листа 2 '" + sb_list_two.get(i) + "'");
        }
        System.out.println("\n--------------------------------------------------------------");
    }
}
