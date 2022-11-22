package myTimeHW;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*
Дана строка вида "26-03-1968T09:24". Получить объект
LocalDateTime, представляющий собой дату, полученную
из этой строки.
*/
public class TimeHW_3 {
    public static void main(String[] args) {
        // Строка вида
        String stringFormattedDate = "26-03-1968T09:24";
        // Форматтер разъясняет, где какие элементы даты находятся
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy'T'HH:mm");
        /*
        Считываем строку, сопоставляем ее с требуемым форматом
        и представляем ее, как объект LocalDateTime.
        */
        LocalDateTime localDateTime = LocalDateTime.parse(stringFormattedDate, formatter);
        System.out.println(localDateTime);
    }
}
