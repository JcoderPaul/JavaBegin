package Less_11_myStringBuilder;

public class Less_11_StrBuilder_5_MethRevers {

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
        // Метод разворачивает строку справа на лево посимвольно
        System.out.println(str_sb_2.reverse());
        StringBuilder str_sb_5 = new StringBuilder("А роза упала на лапу азора");
        System.out.println(str_sb_5.reverse());
//******************************************************************************************************
        // Метод *.replace() позволяет заменить последовательность символов в билдере, на другую
        // последовательность (одну подстроку на другую), начиная с определенного индекса по другой индекс.
        StringBuilder str_sb_6 = new StringBuilder("У попа была собака он ее любил!"); // Создали билдер
        // Заменили текст между индексами 2 и 6
        System.out.println(str_sb_6.replace(2,6,"Герасима"));
//******************************************************************************************************
        // Метод *.capacity() позволяет позволяет получить информацию о емкости нашего билдера
        System.out.println("StringBuilder '" + str_sb_6 + "' имеет емкость *.capacity() = "
                            + str_sb_6.capacity());
        // Пустой дефолтный размер билдера 16 и он МЮТАБЛ, т.е. изменяемый динамически
        System.out.println("StringBuilder '" + str_sb_1 + "' имеет емкость *.capacity() = "
                + str_sb_1.capacity());
    }
}
