package Less_12_myFirstArray;
// Подключаем нужную нам библиотеку
import java.util.Arrays;

public class Less_12_Array_3_ArraysClass {
    public static void main(String[] args) {
        int[] testArr_1 = {1,2,-4,9,-8,5,8,0};
        for (int res:testArr_1) {
            System.out.print(" " + res);
        }
        /*
        ******* Сортировка массива *******
        Применяем метод sort, класса Arrays и выводим результат на печать
        */
        System.out.println();
        Arrays.sort(testArr_1);
        for (int res:testArr_1) {
            System.out.print(" " + res);
        }
        /*
        ******* Бинарный поиск в массиве *******
        Применяем метод binarySearcht, класса Arrays работает только на
        отсортированных массивах из-за особенностей самого двоичного поиска.
        Результатом будет значение int - индекс в массиве на котором находится
        искомое значение. Если же такого значения нет, то наиболее вероятный
        индекс искомого значения со знаком '-'
        */
        int find_element = 5;
        int find_index = Arrays.binarySearch(testArr_1,find_element);
        System.out.println("\nИскомый элемент '" + find_element +
                           "' находится на " + find_index + " месте");
        /*
        Элемента 10 в нашем отсортированном массиве нет и тогда Java
        сама определяет возможное место нахождение искомого элемента, если
        бы он был в массиве.
        Элементы : -8 -4 0 1 2 5 8 9
        Индексы  :  0  1 2 3 4 5 6 7 -8 (-1)
        Теоретически будь у нас элемент 10, он бы стоял на 8 месте, но его нет
        т.е. -8 и + (-1) и тогда полученный индекс -9. Ниже приведен еще пример.
        */
        int find_element_2 = 10;
        int find_index_2 = Arrays.binarySearch(testArr_1,find_element_2);
        System.out.println("\nИскомый элемент '" + find_element_2 +
                "' находится на " + find_index_2 + " месте");
        /*
        Теоретически будь у нас в массиве элемент -5, то он стоял бы между -8 и -4
        или имел бы индекс 1, но его нет, значит -1 и +(-1), получаем -2.
        !!! Не знаю, как мне это поможет, уверен, что я про это забуду, и все же...
        Все эти записи я делаю для себя, на память !!!
        */
        int find_element_3 = -5;
        int find_index_3 = Arrays.binarySearch(testArr_1,find_element_3);
        System.out.println("\nИскомый элемент '" + find_element_3 +
                "' находится на " + find_index_3 + " месте");
    }
}
