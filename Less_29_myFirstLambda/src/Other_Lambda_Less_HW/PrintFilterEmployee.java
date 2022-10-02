package Other_Lambda_Less_HW;

import java.awt.*;
import java.util.ArrayList;
import java.util.function.Predicate;

public class PrintFilterEmployee {
    void printEmployee(Employee employee){
        System.out.println("Имя работника: " + employee.name +
                           " -> департамент: " + employee.department +
                           " -> оклад: " + employee.salary);
    }

    void filterOfEmployee(ArrayList<Employee> emp, Predicate<Employee> filtemp){
        for (Employee emp_from_array:emp){
            if(filtemp.test(emp_from_array)){
                printEmployee(emp_from_array);
            }
        }
    }
}
