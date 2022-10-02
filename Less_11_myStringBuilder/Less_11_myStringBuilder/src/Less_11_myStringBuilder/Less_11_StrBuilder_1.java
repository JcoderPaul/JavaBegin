package Less_11_myStringBuilder;

public class Less_11_StrBuilder_1 {
    public static void main(String[] args) {

        // Дефолтный размер билдера 16 символов
        StringBuilder str_sb_1 = new StringBuilder();
        // Инициализировали билдер строкой
        StringBuilder str_sb_2 = new StringBuilder("Hello World");
        // Задали первоначальный размер билдера
        StringBuilder str_sb_3 = new StringBuilder(50);
        // Один билдер создается из другого билдера
        StringBuilder str_sb_4 = new StringBuilder(str_sb_2);

    }
}
