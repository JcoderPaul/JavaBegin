package First_Step_to_Lambda_Less_1;

import java.util.ArrayList;
import Student.*;
import java.util.List;

/*
Это еще не Лямбда, это подготовка к ней.
1. Создаем класс студент.
2. Создаем класс для обработки (фильтрации и т.д.) по различным признакам класса студент.

Сразу оговорка, при решении задачи фильтрации 'в лоб' понадобится очень много методов, а
не только те, что мы применили в этом примере. Т.е. это как-то не оптимально!
*/
public class myFirstLambda_Less_1 {
    public static void main(String[] args) {

        List<Student> stud_for_sorting = new ArrayList<>();
        stud_for_sorting.add(new Student("Кеннет",'m',19,2,7.5));
        stud_for_sorting.add(new Student("Николас",'m',29,3,8.3));
        stud_for_sorting.add(new Student("Земфира",'f',17,1,9.9));
        stud_for_sorting.add(new Student("Забир",'m',21,2,6.8));
        stud_for_sorting.add(new Student("Махтуба",'f',23,3,8.1));
        stud_for_sorting.add(new Student("Клемент",'m',31,5,9.4));

        StudentInfo stf = new StudentInfo();
        stf.printStudentOverGrade(stud_for_sorting,8);
        System.out.println("-------------------------------------------------------------------------");
        stf.printStudentUnderGrade(stud_for_sorting,8);
        System.out.println("-------------------------------------------------------------------------");
        stf.printStudentOverAge(stud_for_sorting,25);
        System.out.println("-------------------------------------------------------------------------");
        stf.printStudentUnderAge(stud_for_sorting,25);
        System.out.println("-------------------------------------------------------------------------");
        stf.printStudentBySex(stud_for_sorting,'f');
        System.out.println("-------------------------------------------------------------------------");
        stf.printStudentMultiFilter(stud_for_sorting,7.1,25,'f');
        System.out.println("-------------------------------------------------------------------------");
        stf.printStudentMultiFilter(stud_for_sorting,6.1,21,'m');
        System.out.println("-------------------------------------------------------------------------");

    }
}
