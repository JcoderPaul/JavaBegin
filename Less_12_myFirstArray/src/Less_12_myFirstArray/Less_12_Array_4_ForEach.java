package Less_12_myFirstArray;

public class Less_12_Array_4_ForEach {

    public static void main(String[] args) {
        int[] my_int_arr = {3,5,8,9,72,2,87};
        int[] my_int_arr_2 = new int[my_int_arr.length];
        // Пример динамического заполнения массива
        for (int i = 0; i<my_int_arr.length; i++){
            my_int_arr_2[i] = my_int_arr[i];
        }

        for (int arr:my_int_arr) {
            System.out.print(arr + " ");
        }
        System.out.println();
        /* Тихое извращение - меняем содержимое массива my_int_arr, через цикл foreach,
        синтаксис цикла короче чем у обычного for, но в случае замены элементов, получается
        прикольная возня с очень длинным кодом (просто препод сказал, что поменять содержимое
        массива через foreach нельзя, убежденно так... вот и верь после этого людям...).
        */
        int count = 0;
        for (int arr: my_int_arr) {
            int i = my_int_arr.length;
            my_int_arr[count] = 1;
            count++;
            i--;
            if(i == 0){
                break;
            }
        }
        for (int new_arr:my_int_arr) {
            System.out.print(new_arr + " ");
        }
        /*
        Повторяем фокус в обратную сторону, и да, теперь код короче, но это не
        показатель (т.ч. когда и какой цикл использовать, по факту, определяет
        конкретная ситуация)
        */
        System.out.println();
        for (int i = 0; i < my_int_arr.length; i++){
            my_int_arr[i] = my_int_arr_2[i];
            System.out.print(my_int_arr[i] + " ");
        }
    }
}
