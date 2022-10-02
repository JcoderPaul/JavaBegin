package myTimeLessons;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

/*
"Изменение" классов LocalTime, Data, DataTime объекты этих трех классов immutable (неизменяемые),
т.е. все изменения которые будут происходить, можно присваивать другим переменным для наблюдения
внесенных изменений (или переназначать исходной).

Если переменная не содержит некоторого параметра времени, например к LocalTime, мы не сможем
применить метод сдвигающий параметр Года или Месяца, и т.д. ведь их там нет. Та же ситуация
с LocalData, которая не содержит часов, минут и т.д.
*/
public class TimeLessons_3 {
    public static void main(String[] args) {
        System.out.println("-------------------- Изменения времени *.plus --------------------");
        // Задаем локальное время с конкретными параметрами вплоть до наносекунд
        LocalTime loc_time = LocalTime.of(12,34,23,456);
        System.out.println(loc_time);
        // Цепочка методов (могут запускаться по-отдельности) смещающих все параметры времени вперед
        LocalTime changes_loc_time = loc_time.plusHours(3)
                                             .plusMinutes(15)
                                             .plusSeconds(34)
                                             .plusNanos(4567);

        System.out.println(changes_loc_time);
        // Исходное время не изменилось
        System.out.println(loc_time);

        System.out.println("-------------------- Изменения времени *.minus --------------------");
        // Метод смещения параметров времени назад, тут мы не применяли цепочку методов, а показали,
        // что по отдельности они тоже работают.
        LocalTime changes_loc_time_2;
        changes_loc_time_2 = loc_time.minusHours(3);
        changes_loc_time_2 = changes_loc_time_2.minusMinutes(15);
        changes_loc_time_2 = changes_loc_time_2.minusSeconds(34);
        changes_loc_time_2 = changes_loc_time_2.minusNanos(4567);
        // Если посмотреть внимательно, то видно, что секунды при изменении сместили минуты
        System.out.println(changes_loc_time_2);
        // Исходное время не изменилось
        System.out.println(loc_time);


        System.out.println("-------------------- Изменения даты *.plus --------------------");
        // Задаем локальную дату только цифрами
        LocalDate loc_date = LocalDate.of(1985,4,24);
        System.out.println("Первый вывод -> " + loc_date);
        // Тут применяется цепочка из методов *.plus..., который позволяет сдвигать день, месяц, год, неделю
        // вперед. Естественно он может применяться поодиночке.
        LocalDate changes_loc_date = loc_date.plusDays(3)
                                             .plusMonths(3)
                                             .plusYears(4)
                                             .plusWeeks(3);// Сдвиг недели повлиял на дату
        System.out.println("Изменения -> " + changes_loc_date);
        // Видно, что ничего не изменилось, естественно мы можем переназначить переменную (обновить)
        System.out.println("Второй вывод -> " + loc_date);

        System.out.println("-------------------- Изменения даты *.minus --------------------");
        System.out.println("Первый вывод -> " + loc_date);
        LocalDate changes_loc_date_2 = loc_date.minusDays(3).minusMonths(3).minusYears(4);
        System.out.println("Изменения -> " + changes_loc_date_2);

        System.out.println("-------------------- Изменения даты и времени --------------------");
        // Задаем через конструктор без наносекунд
        LocalDateTime loc_date_time = LocalDateTime.of(1985,5,24,13,41,23);
        System.out.println("Исходная дата -> " + loc_date_time);
        LocalDateTime changes_ldt_2 = loc_date_time.plusYears(4)
                                                   .plusMonths(4)
                                                   .plusDays(3)
                                                   .plusHours(4)
                                                   .plusMinutes(21)
                                                   .plusSeconds(23);
        System.out.println("Изменения метода *.plus..." + changes_ldt_2);
        LocalDateTime changes_ldt_3 = loc_date_time.minusYears(4)
                                                   .minusMonths(4)
                                                   .minusDays(3)
                                                   .minusHours(4)
                                                   .minusMinutes(21)
                                                   .minusSeconds(23);
        System.out.println("Изменения метода *.minus..." + changes_ldt_3);
        System.out.println("Исходная дата -> " + loc_date_time);

        System.out.println("-------------------- Изменения даты и времени комбинация *.plus и *.minus --------------------");
        // Естественно оба метода можно комбинировать как в цепи, так и по отдельности
        System.out.println("Исходная дата -> " + loc_date_time);
        LocalDateTime changes_ldt_4 = loc_date_time.minusYears(4)
                                                   .plusMonths(4)
                                                   .minusDays(3)
                                                   .plusHours(4)
                                                   .minusMinutes(21)
                                                   .plusSeconds(23);
        System.out.println("Изменения метода *.plus и *.minus..." + changes_ldt_4);
        System.out.println("Исходная дата -> " + loc_date_time);
    }
}
