package First_Step_to_Lambda_Less_2;

import Student.*;
/*
Класс имплементирующий интерфейс CheckStudent и позволяющий сделать выборку из листа студентов,
по заранее заданным параметрам. Все методы нацелены найти и предоставить данные
(вернее поднять флаг true) если возраст, курс или средняя оценка, НИЖЕ или равны заданной, ну и пол
соответствует выбранному.
*/
class CheckStudentUnderAgeOrAvgGradeOrSexOrCourse implements CheckStudent {
    @Override
    public boolean choiceStud(Student st, int age_of_stud) {
        return st.age <= age_of_stud;
    }

    @Override
    public boolean choiceStud(Student st, char sex_of_stud) {
        return st.sex == sex_of_stud;
    }

    @Override
    public boolean choiceStud(Student st, double aver_grade_of_stud) {
        return st.avgGrade <= aver_grade_of_stud;
    }

    @Override
    public boolean choiceStud(int course, Student st) {
        return st.course <= course;
    }
}
