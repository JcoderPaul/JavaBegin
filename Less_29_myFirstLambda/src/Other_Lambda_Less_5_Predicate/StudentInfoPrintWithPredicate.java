package Other_Lambda_Less_5_Predicate;

import Student.Student;

import java.util.List;
import java.util.function.Predicate;

public class StudentInfoPrintWithPredicate {
    // Метод для простой печати переменных выбранного студента (т.е. всех его данных)
    void printStdInf(Student stud) {
        System.out.println("Имя студента: '" + stud.name +
                "' пол '" + stud.sex +
                "' возраст '" + stud.age +
                "' курс '" + stud.course +
                "' средняя оценка '" + stud.avgGrade + "'");
    }

    // Все как в предыдущих примерах, метод принимает на вход лист студентов и
    // объект реализующий метод 'test' интерфейса Predicate
    void choiceStdFromList(List<Student> stl, Predicate<Student> std) {
        for (Student st_for_choice : stl) {
            // Какая реализация будет у данного метода определяем мы в основном коде программы
            if (std.test(st_for_choice)) {
                printStdInf(st_for_choice);
            }
        }
    }
}
