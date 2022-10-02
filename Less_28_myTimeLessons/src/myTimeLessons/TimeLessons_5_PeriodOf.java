package myTimeLessons;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class TimeLessons_5_PeriodOf {
    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2012,5,12);
        LocalDate finish = LocalDate.of(2016,5,12);
        // Вариант назначения периода работы нашего метода, через переменную класса Period
        Period per_of_days = Period.ofDays(15); // Задаем период при помощи дней (на 15 дней)
        Period per_of_months = Period.ofMonths(3); // Задаем период при помощи месяцев (на 3 месяца)
        Period per_of_years = Period.ofYears(1); // Задаем период при помощи лет (на 1 год)
        // Задаем период (с точностью до лет, месяцев, дней) на 1 год 3-и месяца и 12 дней
        Period per_of_days_months_years = Period.of(1,3,12);
        Period per = per_of_months;
        oilChange(start, finish, per);
    }

    public static void oilChange(LocalDate start, LocalDate finish, Period per){
        // Присваиваем стартовую переменную, той с которой будут происходить изменения,
        LocalDate start_time = start;
        /*
        Стартовая дата сравнивается с финишной, и до тех пор, пока она будет 'До-Того-Как'
        т.е. раньше чем финишная, цикл будет крутиться. При этом стартовое значение смещается
        вперед на заданный промежуток времени. Т.е. когда стартовая переменная перескочит
        финишную - цикл прекратится.
        */
        int count_of_period = 1;
        while (start_time.isBefore(finish)){
            System.out.println(count_of_period + " -> Now " + start_time + " we need to change the oil.");
            /*
            !!! Еще раз !!! Данные локальных дат, времен, лет неизменяемые и если мы хотим
            использовать результаты методов в тех же переменных, что и в начале, нам нужно
            их переназначать либо использовать новые куда будут помещаться измененные данные.
            */
            start_time = start_time.plus(per);
            count_of_period++;
        }
    }
}
