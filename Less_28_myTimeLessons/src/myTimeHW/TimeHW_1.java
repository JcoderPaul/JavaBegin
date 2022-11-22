package myTimeHW;

import java.time.LocalDateTime;

/*
Создать объект LocalDateTime, представляющий собой дату 25.06.2020 19:47.
Используя этот объект, создать другой объект LocalDateTime, представляющий
собой дату через 3 месяца после заданной. Вывести на консоль содержащиеся
в нем объекты LocalDate and LocalTime.
 */
public class TimeHW_1 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2020, 6, 25, 19, 47);
        System.out.println("Исходная дата: " + localDateTime.toLocalDate());
        // + 3-и месяца к заданной дате
        LocalDateTime newLocalDateTime = localDateTime.plusMonths(3L);

        System.out.println("Локальная дата: " + newLocalDateTime.toLocalDate());
        System.out.println("Локальное время: " + newLocalDateTime.toLocalTime());
    }
}
