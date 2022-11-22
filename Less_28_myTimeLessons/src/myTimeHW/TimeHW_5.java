package myTimeHW;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/*
Создать объект LocalDataTime, представляющий собой сегодняшнюю дату.
Создать объект LocalDataTime, представляющий собой дату 07.07.2018.
Используя созданные объекты, найти количество дней между этими двумя
датами.
*/
public class TimeHW_5 {
    public static void main(String[] args) {
        // Текущая дата
        LocalDate now = LocalDate.now();
        // Создаем предыдущую дату
        LocalDate prevDate = LocalDate.of(2018, 7, 7);


        Period period = Period.between(prevDate, now);
        System.out.print("Количество лет между '" + prevDate +
                         "' и '" + now +
                         "' составляет : " + period.getYears() +
                         " года ");
        System.out.print(period.getMonths() + " месяца ");
        System.out.println("и " + period.getDays() + " дней.");

        long days = ChronoUnit.DAYS.between(prevDate, now);
        System.out.println("Количество дней между этими датами : " + days);
    }
}
