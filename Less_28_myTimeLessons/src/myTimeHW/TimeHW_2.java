package myTimeHW;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*
Создать объект LocalDataTime, представляющий собой сегодняшнюю дату.
Преобразовать дату в строку вида 05.05.2017. Вывести полученное на
консоль.
*/
public class TimeHW_2 {
    public static void main(String[] args) {
        // Создаем объект текущей даты и времени
        LocalDateTime now = LocalDateTime.now();
        // Форматируем будущий вывод на консоль в соответствии с требованиями задачи
        DateTimeFormatter formatOnlyData = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        /*
        Это уже добавлено от себя !!! Никогда так не делать, код пишется и реализует
        только требования технического задания ни более и не менее !!!
        */
        DateTimeFormatter formatOnlyTime = DateTimeFormatter.ofPattern("HH:mm");
        String format = now.format(formatOnlyData);
        System.out.println("Только дата -> " + format);

        String formatTime = now.format(formatOnlyTime);
        System.out.println("Только часы и минуты -> " + formatTime);
    }
}
