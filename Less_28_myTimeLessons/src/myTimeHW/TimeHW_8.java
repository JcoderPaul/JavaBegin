package myTimeHW;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

/*
Написать свою реализацию интерфейса TemporalAdjuster,
которая бы прибавляла к дате 42 дня
*/
public class TimeHW_8 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Текущая дата : " + now);

        /*
        Метод *.with(TemporalAdjuster adjuster) - возвращает скорректированную
        копию вызывающей метод даты и времени. В качестве аргумента поступает
        объект подписанный на интерфейс TemporalAdjuste.
        */
        LocalDateTime localDateTime = now.with(new TemporalAdjuster() {
            /*
            Данный интерфейс функциональный и имеет единственный метод
            *.adjustInto(), который настраивает указанный временной объект
            или преобразует его согласно нашим пожеланиям.
            */
            @Override
            public Temporal adjustInto(Temporal temporal) {
                /*
                Метод *.plus(long amountToAdd, TemporalUnit unit) - возвращает
                объект того же типа, что и исходный объект, с добавлением
                указанного периода, в нашем случае первый параметр - 42,
                второй - TemporalUnit.Дни.
                */
                return temporal.plus(42L, ChronoUnit.DAYS);
            }
        });
        System.out.println("Текущая дата + 42 дня : " + localDateTime);
    }
}