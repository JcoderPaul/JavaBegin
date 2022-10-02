package Less_11_myStringBuilder;

import java.util.ArrayList;
import java.util.List;

public class Less_11_StrBuilder_3_Meth {

    public static void main(String[] args) {

        // Дефолтный размер билдера 16 символов
        StringBuilder str_sb_1 = new StringBuilder();
        // Инициализировали билдер строкой
        StringBuilder str_sb_2 = new StringBuilder("Hello my sunny World");
        // Задали первоначальный размер билдера
        StringBuilder str_sb_3 = new StringBuilder(50);
        // Один билдер создается из другого билдера
        StringBuilder str_sb_4 = new StringBuilder(str_sb_2);
//******************************************************************************************************
        System.out.println(str_sb_2.subSequence(9,14)); //Последовательность символов, а не подстрока
//******************************************************************************************************
        // Метод *.append() добавляет к нашему билдеру разнообразные переменные и
        // объекты изменяя его (в отличие от конкатинации строк) в консоли виден результат
        // нескольких append - ов подряд.
        System.out.println(str_sb_2.append(25));
        System.out.println(str_sb_2.append("!!!!"));
        System.out.println(str_sb_2.append(" " + false));
        System.out.println(str_sb_2.append(" " + str_sb_4));
        System.out.println(str_sb_2.append(" " + new Mouse()));
    }
}

