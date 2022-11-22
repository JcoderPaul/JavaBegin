package myTimeHW;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

/*
Даны объект LocalDataTime, представляющий собой сегодняшнюю дату и
объект LocalDataTime, представляющий собой дату 07.07.2018.
Подсчитать количество секунд между полуночью первой даты и полуночью
второй даты.
*/
public class TimeHW_6 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate prevDate = LocalDate.of(2018, 7, 7);
        /*
        Метод *.atStartOfDay() - объединяет вызывающую его дату со временем полуночи,
        чтобы создать LocalDateTime в начале этой даты, т.е. выставляем дату в
        начало дня.
        */
        LocalDateTime localDateTimeNow = now.atStartOfDay();
        LocalDateTime localDateTimePrev = prevDate.atStartOfDay();
        /*
        Метод *.between(Temporal startInclusive, Temporal endExclusive) -
        Возвращает объект Duration, представляющий из себя разницу между двумя
        временными объектами.
        */
        Duration duration = Duration.between(localDateTimePrev, localDateTimeNow);
        /*
        Метод *.getSeconds() - возвращает количество секунд из объекта Duration,
        вызвавшего его.
        */
        System.out.println(duration.getSeconds());
    }
}
