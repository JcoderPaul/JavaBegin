package myTimeLessons;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

/*
Создание объектов отвечающих за время
*/
public class TimeLessons_2 {
    public static void main(String[] args) {
        // Задаем локальное время с конкретными параметрами вплоть до наносекунд
        LocalTime loc_time = LocalTime.of(12,34,23,456);
        System.out.println(loc_time);
        LocalTime loc_time_2 = LocalTime.of(12,34,23);
        System.out.println(loc_time_2);
        LocalTime loc_time_3 = LocalTime.of(12,34);
        System.out.println(loc_time_3);
        // Задаем локальную дату только цифрами
        LocalDate loc_date = LocalDate.of(1985,4,24);
        System.out.println(loc_date);
        // Задаем локальную дату (месяц задается через Enum, так нагляднее)
        LocalDate loc_date_2 = LocalDate.of(1985, Month.APRIL,24);
        System.out.println(loc_date_2);
        // Задаем через конструктор без наносекунд
        LocalDateTime loc_date_time = LocalDateTime.of(1985,5,24,13,41,23);
        System.out.println(loc_date_time);
        // Задаем через синтетический конструктор из двух заранее заготовленных переменных даты и времени
        LocalDateTime loc_date_time_2 = LocalDateTime.of(loc_date,loc_time);
        System.out.println(loc_date_time_2);
    }
}
