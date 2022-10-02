package myTimeLessons;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/*
Получение информации из LocalDate, LocalDateTime и LocalTime.
*/
public class LocalDateTime_8_GetDateInfo {
    public static void main(String[] args) {
//*********************************************************************************************************
        // Получение информации из LocalDate и LocalDateTime
        LocalDate loc_date = LocalDate.of(2021,4,14);
        LocalDateTime loc_date_time =LocalDateTime.now();
        // Если из объекта нельзя чего-то извлечь (нет этого там), то и метод, либо
        // ругнется на этапе компиляции, либо выкинет исключение в рантайме.
        System.out.println("День недели (ENUM)-> " + loc_date.getDayOfWeek());
        System.out.println("День года (int)-> " + loc_date.getDayOfYear());
        System.out.println("День месяца (int)-> " + loc_date.getDayOfMonth());
        System.out.println("-------------------------- LOCAL DATA TIME --------------------------");
        System.out.println("Текущее полное время и дата -> " + loc_date_time);
        System.out.println("Месяц года (ENUM) -> " + loc_date_time.getMonth());
        System.out.println("Год (int) -> " + loc_date_time.getYear());
        System.out.println("Позиция месяца в году (int) -> " + loc_date_time.getMonthValue());
        // Если из объекта есть чего извлекать это будет извлечено
        System.out.println("Значение минут (int) -> " + loc_date_time.getMinute());
        System.out.println("Значение часов (int) -> " + loc_date_time.getHour());
//*********************************************************************************************************
        System.out.println("-------------------------- TIME NOW --------------------------");
        // Получение информации из LocalTime
        LocalTime loc_time_now = LocalTime.now();
        System.out.println("Информация извлекается из -> " + loc_time_now);
        System.out.println("Взять значение часа (int)-> " + loc_time_now.getHour());
        System.out.println("Взять значение минут (int)-> " + loc_time_now.getMinute());
        System.out.println("Взять значение секунд (int)-> " + loc_time_now.getSecond());
        System.out.println("Взять значение наносекунд (int)-> " + loc_time_now.getNano());
        System.out.println("-------------------------- TIME OF --------------------------");
        // Мы задали только часы и минуты, остальное по нулям
        LocalTime loc_time_of = LocalTime.of(13,45);
        System.out.println("Информация извлекается из -> " + loc_time_of);
        System.out.println("Взять значение часа (int)-> " + loc_time_of.getHour());
        System.out.println("Взять значение минут (int)-> " + loc_time_of.getMinute());
        System.out.println("Взять значение секунд (int)-> " + loc_time_of.getSecond());
        System.out.println("Взять значение наносекунд (int)-> " + loc_time_of.getNano());

    }
}
