package First_Step_to_Lambda_Less_2;
/*
Это тоже еще не лямбда!!!
Применяем интерфейс для решения предыдущей задачи, т.е. проводим выборку студентов по
заданным параметрам. Стало не легче, но красивее и, условно,5-ть методов, заменили на 1-н.
Если нам понадобится реализовать некую особую выборку, нам придется сделать новый класс
имплементирующий интерфейс 'CheckStudent' и реализовать его методы. Или перегрузить метод
'choiceStudentFromList' класса 'PrintStudentInfo' или создать в нем новый метод под
требуемую выборку или расширить ENUM под switch-case оператор и далее провести нужные сравнения.

Т.е. мы стремимся к некому упрощению, когда задачу 'любой требуемой выборки' можно решить,
условно, одним универсальным методом.
*/
import Student.Student;

import java.util.ArrayList;
import java.util.List;

public class myFirstLambda_Less_2_interface {
    public static void main(String[] args) {
        List<Student> stud_for_sorting = new ArrayList<>();
        stud_for_sorting.add(new Student("Иван",'m',19,2,7.5));
        stud_for_sorting.add(new Student("Дикан",'m',29,3,8.3));
        stud_for_sorting.add(new Student("Клавдия",'f',17,1,9.9));
        stud_for_sorting.add(new Student("Рольф",'m',21,2,6.8));
        stud_for_sorting.add(new Student("Марианна",'f',23,3,8.1));
        stud_for_sorting.add(new Student("Карл",'m',31,5,9.4));
        // Создаем объект класса 'PrintStudentInfo'
        PrintStudentInfo pif = new PrintStudentInfo();
        // Объекты последующих двух классов имплементируют интерфейс 'CheckStudent', а значит, могут быть
        // приняты в качестве аргументов в метод 'choiceStudentFromList' объекта класса 'PrintStudentInfo'
        CheckStudentOtherAgeOrAvgGradeOrSexOrCourse csh_other_1 =
                new CheckStudentOtherAgeOrAvgGradeOrSexOrCourse(); // Выбирает тех кто выше критического значения
        CheckStudentUnderAgeOrAvgGradeOrSexOrCourse csh_under_1 =
                new CheckStudentUnderAgeOrAvgGradeOrSexOrCourse(); // Выбирает тех кто ниже критического значения
        // В метод помещается лист студентов, объект работающий над сортировкой, предельные
        // значения для сортировки, и параметр по которому будет происходить сортировка.
        pif.choiceStudentFromList(stud_for_sorting,csh_other_1,21,4,8.7,'f',StudentSortBy.COURSE);
        System.out.println("----------------------------------------------------------------------------------");
        pif.choiceStudentFromList(stud_for_sorting,csh_under_1,21,2,7.7,'f',StudentSortBy.COURSE);
    }
}

