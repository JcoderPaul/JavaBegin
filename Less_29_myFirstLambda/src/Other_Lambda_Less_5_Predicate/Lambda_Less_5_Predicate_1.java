package Other_Lambda_Less_5_Predicate;

import Student.*;
/*
Функциональный интерфейс Predicate<T> проверяет соблюдение некоторого условия. Если оно соблюдается,
то возвращается значение true. В качестве параметра лямбда-выражение принимает объект типа T:

public interface Predicate<T> {
    boolean test(T t);
}
*/
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate; // Подключаем библиотеку в которой есть функциональный интерфейс Predicate

public class Lambda_Less_5_Predicate_1 {
    public static void main(String[] args) {
        List<Student> stud_for_sorting = new ArrayList<>();
        stud_for_sorting.add(new Student("Ронан",'m',19,2,7.5));
        stud_for_sorting.add(new Student("Кифер",'m',29,3,8.3));
        stud_for_sorting.add(new Student("Томара",'f',17,1,9.9));
        stud_for_sorting.add(new Student("Эркюль",'m',21,2,6.8));
        stud_for_sorting.add(new Student("Нина",'f',23,3,8.1));
        stud_for_sorting.add(new Student("Кварк",'m',31,5,9.4));
        stud_for_sorting.add(new Student("Касим ибн Дауд",'m',28,5,9.1));

        StudentInfoPrintWithPredicate sipwp = new StudentInfoPrintWithPredicate();
        System.out.println("---------------------------------------------------------------------");
        sipwp.choiceStdFromList(stud_for_sorting,(student) -> student.avgGrade > 8.1);
        System.out.println("---------------------------------------------------------------------");
        sipwp.choiceStdFromList(stud_for_sorting,(student) -> student.age < 25);
        System.out.println("---------------------------------------------------------------------");
        // Вариант создания и использования объектов подписанных на интерфейс Predicate
        Predicate<Integer> isPositive = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                // Если значение принятого аргумента больше нуля, то он положителен, нет - отрицателен.
                return integer > 0;
            }
        };
        // Проверяем работу метода 'test'
        System.out.println(isPositive.test(5)); // true
        System.out.println(isPositive.test(-7)); // false
        System.out.println("---------------------------------------------------------------------");
        /*
        Вариант создания и использования объектов подписанных на интерфейс Predicate, через лямбду.
        Если подняться на несколько строк наверх, то видно, что метод 'test' принимает на вход
        любую ссылочную переменную, а затем проводит над ней операции, дающие на выходе булевые
        значения (true/false)
        */
        Predicate<Integer> isNegative = enter_int -> enter_int < 0;
        // Проверяем отрицательное ли число, переданное в метод 'test'
        System.out.println(isNegative.test(-5));
        System.out.println(isNegative.test(6));
    }
}

