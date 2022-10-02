package Less_11_myStringBuilder;

public class Less_11_StrBuil_9_Array {
    public static void main(String[] args) {
        // Символьные массивы
        char[] for_sb_arr_1 = {'П','р','и','в','е','т','!'};
        char[] for_sb_arr_2 = {'р','а','д','у','г','а'};
        char[] for_sb_arr_3 = {'П','р','и','д','у',' ','и',' ','с','к','а','ж','у',' ','я',' ','т','у','т','!'};
        // Создаем строку из массива
        String str_from_arr = new String(for_sb_arr_1);
        System.out.println(str_from_arr);
// **************************** Массивы и методы StringBuilder ( append ) ****************************
        // Создаем билдер
        StringBuilder sb_str_1 = new StringBuilder("Большой новый мир, ");
        StringBuilder sb_str_2 = new StringBuilder(sb_str_1);
        /*
        Присоединяем к билдеру символы из массива for_sb_arr_1 начиная с
        3-го символа на глубину в 3-и символа (первый входит в расчет), т.е.
        начиная с индекса 3-и до индекса 5.
        */
        sb_str_1.append(for_sb_arr_1,3,3);
        // Повторяем похожий фокус с другим массивом с другими индексами.
        sb_str_1.append(for_sb_arr_2,0,2);
        sb_str_1.append(" и солнца!");

        System.out.println(sb_str_1);
        System.out.println(sb_str_2);
// **************************** Массивы и методы StringBuilder ( insert ) ****************************
        // Вставляем на 18 место (по 18 индексу), элементы массива for_sb_arr_3
        // начиная с 14 места на глубину 6 символов, 14 место включительно.
        sb_str_2.insert(18, for_sb_arr_3,14,6);
        // На ходу создали объект String и передали в него массив для удобочитаемой печати
        System.out.println("Массив char -> " + new String (for_sb_arr_3));
        System.out.println("Результат метода insert -> " + sb_str_2);


    }
}
