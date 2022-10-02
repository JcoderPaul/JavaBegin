package First_Step_to_Lambda_Less_2;
/*
Данный класс необходим для вывода информации о студентах на экран,
согласно сделанного выбора.
*/
import Student.*;

import java.util.List;

class PrintStudentInfo {
    // Метод для простой печати переменных выбранного студента (т.е. всех его данных)
    void printStudentsInformation(Student stud) {
        System.out.println("Имя студента: '" + stud.name +
                "' пол '" + stud.sex +
                "' возраст '" + stud.age +
                "' курс '" + stud.course +
                "' средняя оценка '" + stud.avgGrade + "'");
    }
    /*
    Метод выводит сведения о студентах, помещенных в лист (список) и отвечающих определенным параметрам.
    Метод принимает все необходимые для работы сведения. Результатом будет некая выборка удовлетворяющая,
    принятым аргументам.
    */
    void choiceStudentFromList(List<Student> stl, // Сам список студентов
                               CheckStudent ch, // Объект имплементирующий интерфейс CheckStudent (с его методами)
                               int age, // Возраст для фильтрации
                               int course, // Курс для фильтрации
                               double avg, // Среднюю оценку для фильтрации
                               char sex, // Пол для фильтрации
                               StudentSortBy sort) { // ENUM для выбора параметра по которому пойдет фильтрация.
        // Есть 4-и варианта фильтрации по возрасту, курсу, средней оценке, полу.
        switch (sort) {
            // Если по возрасту то ->
            case AGE:
                // -> Прогоняем список и делаем из него выборку ->
                for (Student st_for_choice : stl) {
                    // -> Если элемент списка удовлетворяет условию метода интерфейса CheckStudent, то ->
                    if (ch.choiceStud(st_for_choice, age)) {
                        // -> выводим его не экран, запускается метод класса PrintStudentInfo.
                        printStudentsInformation(st_for_choice);
                    }
                }
                break;
            case AVGGRADE:
                for (Student st_for_choice : stl) {
                    if (ch.choiceStud(st_for_choice, avg)) {
                        printStudentsInformation(st_for_choice);
                    }
                }
                break;
            case SEX:
                for (Student st_for_choice : stl) {
                    if (ch.choiceStud(st_for_choice, sex)) {
                        printStudentsInformation(st_for_choice);
                    }
                }
                break;
            case COURSE:
                for (Student st_for_choice : stl) {
                    // Единственное отличие текущего сравнения в том, что принимаемые методом аргументы
                    // поменяны местами относительно первых трех.
                    if (ch.choiceStud(course, st_for_choice)) {
                        printStudentsInformation(st_for_choice);
                    }
                }
                break;
        }
    }
}
