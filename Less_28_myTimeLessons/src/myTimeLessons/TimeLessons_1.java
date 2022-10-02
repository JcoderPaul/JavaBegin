package myTimeLessons;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/*
LocalDate - содержит информацию о дне (год, месяц, день);
LocalTime - содержит информацию о времени (час, минута, секунда, наносекунда)
LocalDateTime - содержит информацию о дне (год, месяц, день) и времени (час, минута, секунда, наносекунда)
*/
public class TimeLessons_1 {
    public static void main(String[] args) {
        // !!! Локал ДатаТайм и Время неизменяемые и имеют приватный конструктор !!!
        // Значит мы не можем создать объект этого класса через new
        // Локальное текущее время с точностью до наносекунд
        LocalTime loc_time = LocalTime.now();
        System.out.println(loc_time);
        // Локальная текущая дата
        LocalDate local_date = LocalDate.now();
        System.out.println(local_date);
        // Комбинация локальных текущих даты и времени
        LocalDateTime local_date_time = LocalDateTime.now();
        System.out.println(local_date_time);
        // !!! Вывод информации происходит через статический метода *.now() !!!
    }
}
