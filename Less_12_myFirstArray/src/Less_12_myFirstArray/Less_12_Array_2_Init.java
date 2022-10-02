package Less_12_myFirstArray;

public class Less_12_Array_2_Init {
    public static void main(String[] args) {
        // Вариант объявления массива, например 3-и одномерных массива подряд.
        double [] doubArr_1, doubArr_2, doubArr_3;
        // Вариант объявления массива, например 2-ух двумерных массивов подряд.
        String [] strArr_1 [], strArr_2[];
        // Вариант объявления массива, например 2-а массива (многомарный и одномерный) и одной переменной.
        int intArray_1[][], intArray_2[], notArrayVar;
        // Вариант инициализации 'на лету'
        int[] myIntArray = {1,2,3,4,5,6,7};
        double[] dubArray = new double[4];
        // Так называемая статическая инициализация
        dubArray[0] = 2.3;
        dubArray[1] = 1.3;
        dubArray[2] = 0.3;
        dubArray[3] = 5.3;
        // Создали массив из 3-х подмассивов неопределенной длинны
        double[][] dubTwoArray = new double[3][];
        // И вот магия! Один массив пакуем в другой. В наш двумерный массив из 3-х подмассивов
        // в нулевую ячейку помещаем массив длинной 4-и.
        dubTwoArray[0] = dubArray;
        // Теперь в ячейку с индексом 1 поместили 3-и элемента
        double[] dubArray_2 = {23.4, 34.1, 5.22};
        dubTwoArray[1] = dubArray_2;
        // Создаем еще одномерный массив
        double [] dubArray_3 = {23.1,11.2,67.3,57.4,12.5,67.6};
        // и помещаем его в последнюю ячейку нашего многомерного массива
        dubTwoArray[2] = dubArray_3;
        // Выводим на печать для наглядности, вот где пригодилась переменная length,
        // когда длина подмассивов различная
        for (int i = 0; i < dubTwoArray.length; i++){
            for (int j = 0; j < dubTwoArray[i].length; j++){
                System.out.print(" " + dubTwoArray[i][j]);
            }
            System.out.println();
        }
        // Еще возможные варианты создания и инициализации массива с заполнением:
        int[] myArray;
        myArray = new int[]{1,2,3,4,5,6,7};

        int[] myArray_2 = new int[]{1,2,3,4,5,6,7};






        for (int out: myIntArray) {
            System.out.print(" " + out);
        }
    }
}
