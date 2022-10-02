package Less_11_myStringBuilder;

public class Less_11_StrBuilder_6 {
    public static void main(String[] args) {
        // Создали билдер и записали в него 123, по факту как всегда создали ссылку на объект
        StringBuilder str_sb_1 = new StringBuilder("123");
        // Создали еще ссылку на тот же билдер, только измененный, т.е. 'координаты' объекта те же
        StringBuilder str_sb_2 = str_sb_1.append("45");
        // Применяя методы к ссылкам мы меняем объект, но все тот же первоначальный объект
        str_sb_2 = str_sb_2.append("6").append("7");
        // Итог у обеих ссылок будет естественно одинаковым
        System.out.println("str_sb_1 -> " + str_sb_1);
        System.out.println("str_sb_2 -> " + str_sb_2);
        System.out.println("Ссылки указывают на один и тот же объект -> " + (str_sb_1 == str_sb_2));
//******************************************************************************************************
        // Метод equals в StringBuilder работает по другому нежели в String
        StringBuilder str_sb_3 = new StringBuilder("1234567");
        System.out.println("Эквивалентны ли объекты по содержимому -> " + str_sb_1.equals(str_sb_3));

    }
}
