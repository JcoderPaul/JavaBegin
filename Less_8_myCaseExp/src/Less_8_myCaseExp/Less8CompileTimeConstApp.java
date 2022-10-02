package Less_8_myCaseExp;

public class Less8CompileTimeConstApp {
    public static void main(String[] args) {
        int my_fruit = 3;
        final int a = 3;
        final int b = 1;
        // Код закомментирован, что бы среда не бухтела
        // int с = 4;

        switch (my_fruit) {
                case 1:
                    System.out.println("I like apple");
                    break;
                case 2:
                    System.out.println("I like nectarine");
                    break;
                // Этот вариант кода не пройдет
                case a*b:
                    System.out.println("I like avocado");
                    break;
                // А данный case уже на данном этапе выдает ошибку, среда разработки не знает,
                // изменится ли переменная 'с' в ходе работы программы, в то время, как константы
                // зафиксированы.
                // Код ниже заремлен, чтобы не булькала IDE-а
                /*
                case c*b:
                    System.out.println("I like orange");
                    break;
                */
                case 5:
                    System.out.println("I like apricot");
                    break;
                default:
                    System.out.println("I don't like fruits!");
            }
    }
}
