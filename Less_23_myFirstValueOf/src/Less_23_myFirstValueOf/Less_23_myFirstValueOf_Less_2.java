package Less_23_myFirstValueOf;

import java.util.Scanner;

public class Less_23_myFirstValueOf_Less_2 {
    public static void main(String args[]) {

        System.out.println("Пожалуйста, введите цифру > 100");
        Scanner sc = new Scanner(System.in);
        // Естественно мы могли втянуть и строку, но нам нужно показать работу valueOf
        int read = sc.nextInt();
        System.out.println("Прямо " + read);
        // int превращаем в String и помещаем в билдер
        StringBuilder sb = new StringBuilder(String.valueOf(read));
        // Затем разворачиваем строку, помещенную в билдер методом revers
        System.out.println("Реверс " + sb.reverse());

    }
}
