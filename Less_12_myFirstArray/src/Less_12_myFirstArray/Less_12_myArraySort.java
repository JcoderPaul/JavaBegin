package Less_12_myFirstArray;

public class Less_12_myArraySort {
    public static void main(String[] args) {
        int[] arr_for_sort = {3,0,-2,-6,9,12,5,-32,56};
        sort_array(arr_for_sort);

        for (int sort_arr:arr_for_sort) {
            System.out.print(sort_arr + " ");
        }

    }

    public static int[] sort_array(int[] enter_arr){
        // Эта переменная нужна для проведения рокировки между сравниваемыми переменными
        int replacement_element;
        for(int i = 0; i < enter_arr.length; i++)
        {
            // Цикл начинается с '0' тут мы назначаем i элемент минимальным и запоминаем его индекс.
            int min_arr_elem = enter_arr[i];
            int elem_index = i;
            /*
             Внутренний (inner loop) цикл начинается со следующего элемента
             относительно внешнего цикла (outer loop). Оба цикла проходят всю
             длину полученного через аргумент метода массив.
            */
            for(int j = i + 1; j<enter_arr.length; j++){
                /*
                Ту мы сравниваем предыдущий элемент с текущим (но если смотреть на циклы, то
                получается, что текущий элемент (массива) для внешнего цикла, сравнивается со
                следующим элементом массива для него же и первым для внутреннего цикла), и
                делаем первую рокировку, если текущий элемент меньше предыдущего, то мы
                проваливаемся внутрь условия и ->
                */
                if(enter_arr[j] < min_arr_elem){
                    // -> переназначаем минимальный элемент ->
                    min_arr_elem = enter_arr[j];
                    // -> и запоминаем индекс минимального значения массива на текущей итерации.
                    elem_index = j;
                }
                /*
                Если мы не нашли иного минимального элемента, то цикл отрабатывает в холостую
                и проваливается дальше по ходу программы, или мы получили другой минимальный
                элемент массива, а значит записали его значение и номер его индекса ->
                */
            }
            /*
            -> теперь мы проверяем (нашелся ли другой минимум) произошло ли изменение индекса
            минимального значения массива и если да (т.е. текущее значение индекса минимального
            элемента, не равно индексу найденного на предыдущем шаге) отрабатываем условие ->
            */
            if(i != elem_index){
                // -> в игру вступает наш подменный элемент, куда помещается предыдущий
                // минимальный элемент массива ->
                replacement_element = enter_arr[i];
                // -> (поскольку внешний цикл все же главный, то его элемент i и следует считать текущим)
                // и теперь этому элементу присваивается минимальное значение, найденное в предыдущем
                // внутреннем цикле, где j = i + 1, ->
                enter_arr[i] = min_arr_elem;
                // -> бывшее, в прошлом, минимальное значение помещается в ячейку массива, где лежало
                // текущее (найденное во внутреннем цикле), теперь уже значение.
                enter_arr[elem_index] = replacement_element;
            }
        }
        // Отдаем результат упорядочивания
        return enter_arr;
    }
}