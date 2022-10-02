package Less_14_myFirstArrayList;

import java.util.ArrayList;
import java.util.List;

public class Less_14_ArrayList_3_Meth {
    public static void main(String[] args) {
        // Создали ArrayList
        List<String> str_list_1 = new ArrayList<>();
        // Положили в него 5-ть элементов, без конкретизации места (индекса куда).
        str_list_1.add("Русские");
        str_list_1.add("боги");
        str_list_1.add("любят");
        str_list_1.add("смелых");
        str_list_1.add("и отчаянных!");
        // В прошлом примере уже применялся метод *.get(index), взять из листа элемент
        // под интересующим нас индексом.
        System.out.println("\n--------------------------------------------------------------");
        int find_index = 3;
        System.out.println("Элемент с индексом " + find_index + " содержит -> " + str_list_1.get(find_index));
        System.out.println("\n--------------------------------------------------------------");
        // Замена элементов в листе идет через метод *.set(index, replacement element)
        str_list_1.set(3,"дерзких");
        for (String arr_for_prn:str_list_1) {
            System.out.print(arr_for_prn + " ");
        }
        System.out.println("\n--------------------------------------------------------------");
        // Каскадирование методов и замена элементов листа динамически (на лету)
        List<StringBuilder> str_sb_list_1 = new ArrayList<>();
        StringBuilder str_sb_11 = new StringBuilder("Не везде");
        StringBuilder str_sb_12 = new StringBuilder("Не всегда");
        StringBuilder str_sb_13 = new StringBuilder("Но цеплял");
        StringBuilder str_sb_14 = new StringBuilder("Я, не");
        str_sb_list_1.add(str_sb_11);
        str_sb_list_1.add(str_sb_12);
        str_sb_list_1.add(str_sb_13);
        str_sb_list_1.add(str_sb_14);
        List<StringBuilder> str_sb_list_2 = new ArrayList<>();
        StringBuilder str_sb_21 = new StringBuilder(" в размер,");
        StringBuilder str_sb_22 = new StringBuilder(" в аккорд,");
        StringBuilder str_sb_23 = new StringBuilder(" за нерв");
        StringBuilder str_sb_24 = new StringBuilder(" знавший нот.");
        str_sb_list_2.add(str_sb_21);
        str_sb_list_2.add(str_sb_22);
        str_sb_list_2.add(str_sb_23);
        str_sb_list_2.add(str_sb_24);
        /*
        Предыдущие несколько строк создали два листа и заполнили их содержимым,
        теперь в цикле красиво перебуторим содержимое этих листов, с применением
        длинного набора последовательных и вложенных методов.
        */
        if (str_sb_list_1.size() == str_sb_list_2.size()){ // Проверяем подобие размеров листов
            for (int i = 0; i < str_sb_list_1.size() && i < str_sb_list_2.size(); i++) {
                StringBuilder str_for_prn;
                /*
                Методом *.get() берем i-ый элемент одного листа, и методом *.append() добавляем
                к нему содержимое i-го же элемента второго листа, извлеченного так же методом *.get().
                Такое каскадирование сокращает код, но усложняет его чтение, до сих пор.
                Шесть месяцев назад, я бы крыл крепким капитанским матом того, кто пытается обучать
                новичков этому (често, я и крыл), и на вопрос, эт че было, отвечает гугли юнга, гугли...
                */
                str_for_prn = str_sb_list_1.get(i).append(str_sb_list_2.get(i));
                System.out.println(str_for_prn);
                System.out.println("\n--------------------------------------------------------------");
            }
        }
    }
}
