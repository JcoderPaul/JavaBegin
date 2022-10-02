package Other_Lambda_Less_HW;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Lambda_Less_HW {
    public static void main(String[] args) {
        ArrayList<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Иванов Иван","IT" ,500));
        employeeList.add(new Employee("Петров Петр","Dick knows what he is doing!" ,2500));
        employeeList.add(new Employee("Миронова Мария","Security" ,300));
        employeeList.add(new Employee("Зябликова Зинаида","IT" ,800));
        employeeList.add(new Employee("Гущин Вадим","Salesman" ,1200));
        employeeList.add(new Employee("Хряков Пахом","Cleaner" ,100));
        employeeList.add(new Employee("Игнатьева Анна","CEO" ,4000));
        /*
        Создаем объект, который имеет в своем арсенале метод, позволяющий фильтровать
        работников по заданному условию. Он принимает в качестве аргументов список сотрудников
        и функциональный интерфейс Predicate
        */
        PrintFilterEmployee pfe = new PrintFilterEmployee();
        // Применяем анонимный класс, для начала, и уже представляем, что можно передать в ламбду
        pfe.filterOfEmployee(employeeList, new Predicate<Employee>() {
            // Перезаписываем метод 'test' под наши задачи
            @Override
            // Принимаем объект работник на вход метода
            public boolean test(Employee employee) {
                /*
                Если условие удовлетворяется, то true и печать работника, если нет false ничего не печатаем.
                Естественно тут только часть логики, сама печать идет из метода 'filterOfEmployee'
                */
                return employee.salary > 500;
            }
        });
        System.out.println("----------------------------------------------------------------------------");
        /*
        Применяем уже лямбда выражение, фильтруем по двум параметрам
        (имя оканчивается на 'а' и зарплата больше '1000') и т.д.
        */
        pfe.filterOfEmployee(employeeList,
                            (employee) -> (employee.name.endsWith("а") && employee.salary > 1000));
        System.out.println("----------------------------------------------------------------------------");
        pfe.filterOfEmployee(employeeList,
                (employee) -> (employee.department.equals("IT") && employee.salary != 800));
        System.out.println("----------------------------------------------------------------------------");
        pfe.filterOfEmployee(employeeList,
                (employee) -> (employee.name.startsWith("П") &&
                               employee.department.startsWith("D") &&
                               employee.salary > 1000));
    }
}
