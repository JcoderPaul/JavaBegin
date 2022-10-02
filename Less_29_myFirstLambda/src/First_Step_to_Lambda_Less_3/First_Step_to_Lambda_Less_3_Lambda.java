package First_Step_to_Lambda_Less_3;

import Student.*;
/*
А вот это уже про лямбду.
*/
import java.util.ArrayList;
import java.util.List;

public class First_Step_to_Lambda_Less_3_Lambda {
    public static void main(String[] args) {
        List<Student> stud_for_sorting = new ArrayList<>();
        stud_for_sorting.add(new Student("Ронан",'m',19,2,7.5));
        stud_for_sorting.add(new Student("Кифер",'m',29,3,8.3));
        stud_for_sorting.add(new Student("Томара",'f',17,1,9.9));
        stud_for_sorting.add(new Student("Эркюль",'m',21,2,6.8));
        stud_for_sorting.add(new Student("Нина",'f',23,3,8.1));
        stud_for_sorting.add(new Student("Кварк",'m',31,5,9.4));
        stud_for_sorting.add(new Student("Касим ибн Дауд",'m',28,5,9.1));

        /*
        Создаем объект, который имеет метод 'choiceStdFromList', принимающий в себя в качестве
        одного из аргументов объект класса имплементирующего наш функциональный интерфейс
        'ForLambdaCheckStudent'
        */
        StudentInfoPrint sip = new StudentInfoPrint();
        /*
        Конечно, у нас есть возможность создать огромное количество простых проименованных классов
        имплементирующих функциональный интерфейс (от чего мы убегали два урока) с перезаписанным
        методом 'choiceStudent' и собственной реализацией выборки, но, как мы убедились, это много кода.

        Поэтому реализуем нечто примененное в предыдущем примере (.... Less_2), только узкоспециализированное!
        Это АНОНИМНЫЙ класс, который имплементирует наш функциональный интерфейс и в нем перезапишем метод под
        наши задачи (отфильтровать по возрасту, курсу, полу, успеваемости, в большую или меньшую сторону).
        */
        sip.choiceStdFromList(stud_for_sorting, new ForLambdaCheckStudent() {
            // Перезаписываем метод интерфейса, под нужные условия
            @Override
            public boolean choiceStudent(Student st) {
                return st.age > 25; // Фильтруем по возрасту больше 25 лет
            }
        });
        System.out.println("---------------------------------------------------------------------");
        sip.choiceStdFromList(stud_for_sorting, new ForLambdaCheckStudent() {
            // Перезаписываем метод интерфейса, под нужные условия
            @Override
            public boolean choiceStudent(Student st) {
                return st.course < 3; // Фильтруем по курсу меньше третьего
            }
        });
        System.out.println("---------------------------------------------------------------------");
        sip.choiceStdFromList(stud_for_sorting, new ForLambdaCheckStudent() {
            // Перезаписываем метод интерфейса, под нужные условия
            @Override
            public boolean choiceStudent(Student st) {
                return st.sex == 'f'; // Фильтруем по полу, выбираем барышень
            }
        });
        /*
        Несложно заметить, что класс и реализация создаются 'почти на лету' меняется только
        содержимое возвращаемого значения. Метод возвращает (false/true) при выполнении условия
        после return.
        */
        System.out.println("---------------------------------------------------------------------");
        /*
        И вот мы подкрались к Lambda выражениям. В нашем случае весь код, кроме условия по которому
        мы делаем выборку и из чего мы выбираем, вырождается в знак '->'.
        '(Student std)' - это переменная которую принимает метод 'choiceStudent';
        'std.course > 3' - это условие которое идет после return;
        */
        // Можно так, т.е. return оставить и тогда нужно прописать все условие { return ...... ; }
        sip.choiceStdFromList(stud_for_sorting, (Student std) -> {return std.name.equals("Касим ибн Дауд");});
        System.out.println("---------------------------------------------------------------------");
        // А можно так, т.е. еще короче
        sip.choiceStdFromList(stud_for_sorting, (Student std) -> std.course > 3);
        System.out.println("---------------------------------------------------------------------");
        // И так тоже можно, т.е. короче короткого
        sip.choiceStdFromList(stud_for_sorting, std -> std.avgGrade > 6.3);
        System.out.println("---------------------------------------------------------------------");
        sip.choiceStdFromList(stud_for_sorting, (Student std) -> std.avgGrade < 7.6);
        System.out.println("---------------------------------------------------------------------");
        // Так тоже можно! Причем, условие может быть длинным и знаки могут быть разнонаправленные
        // (как душеньке угодно, почти)
        sip.choiceStdFromList(stud_for_sorting,
                             (Student std) -> (std.avgGrade > 7.6 && std.age > 25 && std.sex == 'm'));
        System.out.println("---------------------------------------------------------------------");
        /*
        Метод 'choiceStdFromList' класса 'StudentInfoPrint' (в нем работает цикл и происходит сравнение
        по заданному условию, ни чего не исчезло) принимает список студентов и объект, который реализует
        метод 'choiceStudent' функционального интерфейса 'ForLambdaCheckStudent'. Т.е. оба объекта (один
        из которых вырождается в лямбда выражение) мы можем подставлять напрямую в метод.
        */
        sip.choiceStdFromList(new ArrayList<>(List.of(
                              new Student("Тамерлан",'m',18,2,4.5),
                              new Student("Флюра",'f',19,4,8.1),
                              new Student("Шиван",'f',21,3,9.3),
                              new Student("Александр",'m',24,5,7.3))),
                              (Student student_fo_filter) ->
                                                (student_fo_filter.avgGrade > 7.2 &&
                                                student_fo_filter.age > 20 &&
                                                student_fo_filter.sex == 'm' &&
                                                student_fo_filter.course >= 3 ));
    }
}