package First_Step_to_Lambda_Less_3;

import Student.*;
import java.util.List;

class StudentInfoPrint {
    // Метод для простой печати переменных выбранного студента (т.е. всех его данных)
    void printStdInf(Student stud) {
        System.out.println("Имя студента: '" + stud.name +
                "' пол '" + stud.sex +
                "' возраст '" + stud.age +
                "' курс '" + stud.course +
                "' средняя оценка '" + stud.avgGrade + "'");
    }

    void choiceStdFromList(List<Student> stl, ForLambdaCheckStudent chs) {
        for (Student st_for_choice : stl) {
             if (chs.choiceStudent(st_for_choice)) {
                 printStdInf(st_for_choice);
             }
        }
    }
}
