package myTimeLessons;

import java.time.LocalDateTime;
import java.time.Period;

public class LocalDateTime_6_Period {
    public static void main(String[] args) {
        LocalDateTime loc_data_time = LocalDateTime.now();
        Period period_shift = Period.ofDays(3);
        System.out.println(loc_data_time);
        System.out.println(loc_data_time.plus(period_shift));
        System.out.println(loc_data_time.minus(period_shift));
        System.out.println("------------------ Цепочка методов не работает (method chain do not work) ------------------");
        // Цепочка статических методов класса Period не работает, необходимо применять
        // грубое каскадирование с созданием списка переменных.
        Period period_shift_cascade = Period.ofDays(3).ofWeeks(12).ofYears(1);
        System.out.println(loc_data_time); // 2022-09-19T18:49:07.120620500
        // Наглядно видно, что изменения вносит только последний метод *.ofYears()
        System.out.println(loc_data_time.plus(period_shift_cascade)); // 2023-09-19T18:49:07.120620500
        System.out.println(loc_data_time.minus(period_shift_cascade)); // 2021-09-19T18:49:07.120620500
        System.out.println("------------------ Грубая цепочка методов (brutal method chain) ------------------");
        /*
        Для того что бы работали все методы приходится делать, несколько переменных, потому что методы
        группы *.of статические и генерируют новый объект на который ссылается соответствующая ссылка,
        а далее мы ее используем для последующих модификаций.
        */
        Period period_shift_day_cascade = Period.ofDays(3);
        Period period_shift_weeks_cascade = Period.ofWeeks(12);
        Period period_shift_years_cascade = Period.ofYears(1);
        System.out.println(loc_data_time); // 2022-09-19T18:49:07.120620500
        // И цепочка изменений будет, как в предыдущих примерах
        System.out.println(loc_data_time.plus(period_shift_day_cascade)
                                        .plus(period_shift_weeks_cascade)
                                        .plus(period_shift_years_cascade)); // 2023-12-15T19:02:18.334991900
        System.out.println(loc_data_time.minus(period_shift_day_cascade)
                                        .minus(period_shift_weeks_cascade)
                                        .minus(period_shift_years_cascade)); // 2021-06-24T19:02:18.334991900
    }
}
