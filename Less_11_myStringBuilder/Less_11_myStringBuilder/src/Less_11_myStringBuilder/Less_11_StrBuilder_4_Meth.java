package Less_11_myStringBuilder;

public class Less_11_StrBuilder_4_Meth {

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
        // Метод *.insert() позволяющий вставлять в билдер по указанному индексу, различные переменный
        // и объекты. В отлиции от *.append(), который надставлял билдер с конца, *.insert()
        // позволяет указывать 'координаты' вставки.
        System.out.println(str_sb_2.insert(8," funny")); // Мы уже изменили текущий билдер
        System.out.println(str_sb_2.insert(str_sb_2.length()," !!!")); // И еще раз изменили
//******************************************************************************************************
        // Метод *.delete() позволяющий удалить из билдера подстроку, начиная с определенного индекса
        // и заканчивая заданным.
        // Удалили подстроку с 8 по 14 символ, причем 14 не вошел.
        System.out.println(str_sb_2.delete(8,14));
//******************************************************************************************************
        // Метод *.deleteCharAt() позволяет удалить символ из билдера по индексу
        System.out.println(str_sb_2.deleteCharAt(6));
        System.out.println(str_sb_2.deleteCharAt(str_sb_2.length() - 1));
    }
}
