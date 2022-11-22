package myTimeHW;
/*
Создать объект Instant. Вывести его на консоль.
Затем создать объект ZoneDateTime на основании
предыдущего объекта с тайм зоной "Africa/Cairo".
*/
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeHW_7 {
    public static void main(String[] args) {
        /*
        Метод *.now() - получает текущий момент от системных часов.
        */
        Instant instant = Instant.now();
        System.out.println(instant);

        /*
        Из объекта класса Instant при помощи:
        - Метод *.atZone(ZoneId zone) - объединяет вызывающий метод момент
        с часовым поясом для создания ZonedDateTime.
        - Статический метод ZoneId.of(String zoneId) - возвращает экземпляр
        ZoneId из идентификатора, гарантируя, что идентификатор действителен
        и доступен для использования.
        Мы получили объект ZonedDateTime.
        */
        ZonedDateTime zonedDateTime = instant.atZone(ZoneId.of("Africa/Cairo"));
        System.out.println(zonedDateTime);
    }
}
