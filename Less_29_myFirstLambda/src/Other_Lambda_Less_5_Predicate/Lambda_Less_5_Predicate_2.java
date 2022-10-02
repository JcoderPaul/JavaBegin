package Other_Lambda_Less_5_Predicate;

import Student.*;
/*
Интерфейс Predicate используется одни из методов ArrayList, а точнее *.removeIf()
*/
import java.util.ArrayList;
import java.util.List;

public class Lambda_Less_5_Predicate_2 {
    public static void main(String[] args) {
        List<Student> stud_for_sorting = new ArrayList<>();
        stud_for_sorting.add(new Student("Ронан",'m',19,2,7.5));
        stud_for_sorting.add(new Student("Кифер",'m',29,3,8.3));
        stud_for_sorting.add(new Student("Томара",'f',17,1,9.9));
        stud_for_sorting.add(new Student("Эркюль",'m',21,2,6.8));
        stud_for_sorting.add(new Student("Нина",'f',23,3,8.1));
        stud_for_sorting.add(new Student("Кварк",'m',31,5,9.4));
        stud_for_sorting.add(new Student("Касим ибн Дауд",'m',28,5,9.1));

        for (Student st_to_screen:stud_for_sorting){
            System.out.println(st_to_screen.name);
        }
        System.out.println("---------------------------------------------------------------------");
        // Удалим из листа всех студентов с именем оканчивающимся на 'а'
        stud_for_sorting.removeIf(student -> student.name.endsWith("а"));

        for (Student st_to_screen:stud_for_sorting){
            System.out.println(st_to_screen.name);
        }

    }
}
