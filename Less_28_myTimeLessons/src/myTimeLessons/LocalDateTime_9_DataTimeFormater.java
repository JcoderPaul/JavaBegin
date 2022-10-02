package myTimeLessons;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class LocalDateTime_9_DataTimeFormater {
    public static void main(String[] args) {
        LocalTime loc_time = LocalTime.now();
        LocalDate loc_date = LocalDate.now();
        LocalDateTime loc_date_time = LocalDateTime.now();
        // Практически не вносит изменений в формат вывода (если применять стандарты ISO)
        DateTimeFormatter dtf_time = DateTimeFormatter.ISO_TIME;
        DateTimeFormatter dtf_data = DateTimeFormatter.ISO_DATE;
        DateTimeFormatter dtf_data_time = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter short_dtf_data_time = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        DateTimeFormatter medium_dtf_data_time = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        DateTimeFormatter short_data = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        DateTimeFormatter medium_data = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        DateTimeFormatter short_time = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
        DateTimeFormatter medium_time = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);

        System.out.println("----------------- DateTimeFormatter.ISO_... -----------------");
        System.out.println(loc_time);
        System.out.println(loc_time.format(dtf_time)); // Можно так, а ->
        System.out.println(dtf_time.format(loc_time)); // -> можно и так.
        System.out.println(loc_date);
        System.out.println(loc_date.format(dtf_data)); // Т.е. перемена места при использовании ->
        System.out.println(dtf_data.format(loc_date)); // метода *.format не влияет на итог вывода.
        System.out.println(loc_date_time);
        System.out.println(loc_date_time.format(dtf_data_time));
        System.out.println(dtf_data_time.format(loc_date_time));

        System.out.println("----------------- DateTimeFormatter.ofLocalized ... (FormatStyle. ... ) -----------------");
        System.out.println("Исходная полная дата -> " + loc_date_time);
        System.out.println("Short_format for LocalDateTime -> " + loc_date_time.format(short_dtf_data_time)); // Укороченный формат отображения LocalDateTime
        System.out.println("Medium_format for LocalDateTime -> " + loc_date_time.format(medium_dtf_data_time)); // Средний формат отображения LocalDateTime
        System.out.println("Short_format for LocalDate-> " + loc_date.format(short_data)); // Укороченный формат отображения LocalDate
        System.out.println("Medium_format for LocalDate-> " + loc_date.format(medium_data)); // Средний формат отображения LocalDate
//*****************************************************************************************************************************************
        System.out.println("Short_format for LocalTime -> " + loc_time.format(short_time)); // Укороченный формат отображения LocalTime
        System.out.println("Medium_format for LocalTime -> " + loc_time.format(medium_time)); // Средний формат отображения LocalTime
        // Меняем местами переменные метода и результат, как и в примерах выше не изменился
        System.out.println("Short_format for LocalTime -> " + short_time.format(loc_time)); // Укороченный формат отображения LocalTime
        System.out.println("Medium_format for LocalTime -> " + medium_time.format(loc_time)); // Средний формат отображения LocalTime
//*************************************************************************************************************
        // Ручной формат под наши запросы


    }
}
