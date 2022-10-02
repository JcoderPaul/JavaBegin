package myTimeLessons;

import java.time.Duration;
import java.time.LocalDateTime;

/*
Класс Duration (имеет приватный конструктор) и его методы применяются для классов содержащих Time, т.е.
его методы работают с периодами времени меньше дня (часы, секунды и т.д.)
Класс Duration очень похож на класс Period, но для меньших периодов.

Если применить методы класса Duration к объектам LocalDate, прилетит исключение, т.к. они не содержит
часов, минут и т.д.
*/
public class LocalDateTime_7_Duration {
    public static void main(String[] args) {
        LocalDateTime loc_data_time = LocalDateTime.now();
        // Цепочка методов тут тоже не работает, как и в Period и нужны отдельные переменные
        // для каждого смещения ->
        Duration duration_days_shift = Duration.ofDays(2);
        Duration duration_hours_shift = Duration.ofHours(3);
        Duration duration_minutes_shift = Duration.ofMinutes(21);
        Duration duration_seconds_shift = Duration.ofSeconds(35);
        Duration duration_millis_shift = Duration.ofMillis(452);
        System.out.println(loc_data_time);
        System.out.println(loc_data_time.plus(duration_days_shift)
                                        .plus(duration_hours_shift)
                                        .plus(duration_minutes_shift)
                                        .plus(duration_seconds_shift)
                                        .plus(duration_millis_shift));
        System.out.println(loc_data_time.minus(duration_days_shift)
                                        .minus(duration_hours_shift)
                                        .minus(duration_minutes_shift)
                                        .minus(duration_seconds_shift)
                                        .minus(duration_millis_shift));
    }
}
