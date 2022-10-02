package myTimeLessons;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTime_10_ofPattern {
    public static void main(String[] args) {
        LocalTime loc_time = LocalTime.now();
        LocalDate loc_date = LocalDate.now();
        LocalDateTime loc_date_time = LocalDateTime.now();
        /*
        Короткий пример форматирования :
        Pattern	                          Example
        dd/MM/yyyy	                      “14/07/2018”
        E, MMM dd yyyy	                  “Sat, Jul 14 2018”
        h:mm a	                          “12:08 PM”
        EEEE, MMM dd, yyyy HH:mm:ss a	  “Saturday, Jul 14, 2018 14:31:06 PM”
        Пример не полный.
        */
        DateTimeFormatter my_format_date = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm");
        DateTimeFormatter my_format_date_2 = DateTimeFormatter.ofPattern("EEEE, MMM dd, yyyy HH:mm:ss a");
        System.out.println(loc_date_time);
        System.out.println(loc_date_time.format(my_format_date));
        System.out.println(loc_date_time.format(my_format_date_2));
        /*
        Пример с расшифровкой:
        Символ  Что означает                    Пример
        y       год в эре                       2014; 14
        M/L     месяц (название или номер)      9; 09; Sep; September; S
        d       день месяца                     17
        E       день недели                     Вт; вторник
        h       время в 12-часовом формате      6
        H       часы в 24-часовом формате       6
        m       минуты                          32
        s       секунды                         11
        S       миллисекунды                	109
        */
    }
}
