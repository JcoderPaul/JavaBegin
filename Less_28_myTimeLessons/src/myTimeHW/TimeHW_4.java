package myTimeHW;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

/*
Дана строка вида "26-03-1968T09:24". Получить объект
LocalDateTime, представляющий собой дату, полученную
из этой строки. Далее преобразовать его в объект типа
Instant, указав тайм зону "America/Chicago". Вывести
количество прошедших миллисекунд.
*/
public class TimeHW_4 {
    public static void main(String[] args) {
        // Задается строка с датой
        String formattedDate = "26-03-1968T09:24";
        // Задается формат для парсинга
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy'T'HH:mm");
        // Парсим строку с датой и создаем на основе полученного объект LocalDateTime
        LocalDateTime localDateTime = LocalDateTime.parse(formattedDate, formatter);
        System.out.println(localDateTime);
        /*
        - *.toInstant(ZoneOffset offset) - Преобразует вызывающую метод дату-время в Instant.
        Объединяет локальную дату-время и указанное смещение для формирования файла Instant.
        Реализация по умолчанию рассчитывается из дня эпохи даты и секунды дня времени.
        - ZoneId.of(String zoneId) - Получает экземпляр ZoneId из идентификатора, гарантируя,
        что идентификатор действителен и доступен для использования.
        - *.getRules() - Получает правила часового пояса для этого идентификатора, позволяющие
        выполнять вычисления.
        - *.getOffset() - Возвращает смещение этого часового пояса от UTC на указанную дату.
        */
        Instant instant = localDateTime
                .toInstant(ZoneId.of("America/Chicago").getRules().getOffset(localDateTime));
        System.out.println(instant);
        /*
        *.ofEpochMilli(long epochMilli) - получает экземпляр Instant, используя миллисекунды из
        эпохи 1970-01-01T00:00:00Z.
        */
        System.out.println(instant.toEpochMilli());
    }
}
