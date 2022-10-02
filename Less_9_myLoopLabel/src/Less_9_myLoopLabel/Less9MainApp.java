package Less_9_myLoopLabel;

public class Less9MainApp {
    public static void main(String[] args) {
        System.out.println("********************** Начало минутомера № 1 **********************");
        /* Label или метка, позволяющая идентифицировать цикл, если это понадобится
        во внутреннем цикле (вложенность не играет значения), т.е. это элемент управления.
        */
        OUTER: for (int hour = 0; hour <= 23; hour++){
            System.out.println("Start of " + (hour + 1) + " hour.");
            INNER: for (int minute = 0; minute <=59; minute++) {
                if (minute == 30){
                    // Данный брейк прерывает внешний цикл при достижении 30 мин.
                    // причем не мягенько, а сразу в точку '1', т.е. выкидывает в основной код.
                    break OUTER;
                }
                System.out.println(hour + " : " + minute);
            }
            System.out.println("End of " + (hour + 1) + " hour.");
        } // Точка '1'

        System.out.println("********************** Начало минутомера № 2 **********************");

        OUTER: for (int hour = 0; hour <= 23; hour++){
            System.out.println("Start of " + (hour + 1) + " hour.");
            INNER: for (int minute = 0; minute <=59; minute++) {
                if (minute == 30){
                    /*
                    В данном случае при достижении 30 мин., мы как бы выпиливаем
                    это значение из цикла и оно не отображается в консоли
                    (0 : 29 -> 0 : 31 . . . и т.д. . . . 23:29 -> 23:31), т.к. цикл просто
                    перескакивает на следующее значение 'minute' сразу после появления
                    оператора 'continue'. Можно указать INNER, но это лишнее, т.к. текущий
                    'continue' относится именно к внутреннему циклу.
                    */
                    continue;
                }
                System.out.println(hour + " : " + minute);
            }
            System.out.println("End of " + (hour + 1) + " hour.");
        }

        System.out.println("********************** Начало минутомера № 3 **********************");

        OUTER: for (int hour = 0; hour <= 23; hour++){
            System.out.println("Start of " + (hour + 1) + " hour.");
            INNER: for (int minute = 0; minute <=59; minute++) {
                if (minute == 30){
                    /*
                    При достижении 30 мин., оператор 'continue' с меткой 'OUTER'
                    сразу прерывает внутренний цикл и продолжает внешний. В итоге
                    мы получаем что в каждом часе у нас по 30 мин.
                    */
                    continue OUTER;
                }
                System.out.println(hour + " : " + minute);
            }
            System.out.println("End of " + (hour + 1) + " hour.");
        }
    }
}
