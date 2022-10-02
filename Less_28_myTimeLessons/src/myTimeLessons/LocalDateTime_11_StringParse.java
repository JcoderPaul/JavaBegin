package myTimeLessons;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
/*
Для парсинга даты и времени из строковых значений существует два статических метода parse:
- parse(CharSequence text) - конвертация строки, которая содержит дату и время, в объект
LocalDateTime. При этом используется формат строки вида 2007-12-03T10:15:30.
- parse(CharSequence text, DateTimeFormatter formatter) - конвертация строки, которая содержит
 дату и время, в объект LocalDateTime с использованием указанного формата.
*/
public class LocalDateTime_11_StringParse {
    public static void main(String[] args) {
        // Создаем форматер (представляем наш формат даты)
        DateTimeFormatter my_formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy HH:mm:ss");
        // Получаем некую дату в строковом формате (тут есть и дата и время, значит это LocalDataTime)
        String my_data_in_string = "июня 5, 2018 12:10:56";
        // Применяем статический метод parse к нашей строке с использованием заданного формата
        LocalDateTime localDateTime = LocalDateTime.parse(my_data_in_string, my_formatter);
        System.out.println(localDateTime);

        DateTimeFormatter my_formatter_tow = DateTimeFormatter.ofPattern("MMMM d, yyyy");
        LocalDate localDate = LocalDate.parse("июня 5, 2018", my_formatter_tow);
        System.out.println(localDate);
    }
}
