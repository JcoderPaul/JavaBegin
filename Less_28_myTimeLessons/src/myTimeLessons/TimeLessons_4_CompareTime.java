package myTimeLessons;

import java.time.LocalDate;
import java.time.LocalTime;
/*
Сравнение времен друг с другом (isBefore и isAfter). Естественно сравниваются переменные
подобных классов.
*/
public class TimeLessons_4_CompareTime {
    public static void main(String[] args) {
//**************************************************************************************************
        LocalTime loc_time_now = LocalTime.now();
        LocalTime loc_time_futur = loc_time_now.plusHours(2)
                                               .minusMinutes(34);
        LocalTime loc_time_back = loc_time_now.minusHours(6)
                                              .minusMinutes(41);
        /*
        Было ли время, к которому применяют метод 'до_того_как', раньше времени
        указанного в скобках, ответом будет булевый результат true/false
        */
        System.out.println("-------- LocalTime isBefore --------");
        System.out.println(loc_time_now.isBefore(loc_time_futur));
        System.out.println(loc_time_now.isBefore(loc_time_back));
        System.out.println("-------- LocalTime isAfter --------");
        System.out.println(loc_time_now.isAfter(loc_time_futur));
        System.out.println(loc_time_now.isAfter(loc_time_back));
//**************************************************************************************************
        // В данном примере не использовались методы *.plusWeeks() и *.minusWeeks()
        LocalDate loc_date_now = LocalDate.now();
        LocalDate loc_date_futur = loc_date_now.plusYears(3)
                                               .plusDays(5)
                                               .minusMonths(5);
        LocalDate loc_date_back = loc_date_now.minusYears(6)
                                              .minusDays(24)
                                              .minusMonths(3);
        /*
        Был день, к которому применяют метод 'до_того_как', раньше или позже дня
        указанного в скобках, ответом будет булевый результат true/false
        */
        System.out.println("-------- LocalDate isBefore --------");
        System.out.println(loc_date_now.isBefore(loc_date_futur));
        System.out.println(loc_date_now.isBefore(loc_date_back));
        System.out.println("-------- LocalDate isAfter --------");
        System.out.println(loc_date_now.isAfter(loc_date_futur));
        System.out.println(loc_date_now.isAfter(loc_date_back));

    }
}
