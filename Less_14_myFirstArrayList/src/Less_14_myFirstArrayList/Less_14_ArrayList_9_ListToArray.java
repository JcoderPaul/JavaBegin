package Less_14_myFirstArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
В работе могут возникнуть задачи при которых нужно List преобразовать в
обычный массив, на это есть два метода:
 - массив объектов;
 - массив заранее определенного типа;
*/
public class Less_14_ArrayList_9_ListToArray {
    public static void main(String[] args) {

        // Создаем пустой лист с емкостью 5
        List<String> color_list = new ArrayList<>(5);
        // Добавляем элементы в лист, при этом больше чем заявили, проблем нет!
        color_list.add("Каждый");
        color_list.add("охотник");
        color_list.add("желает");
        color_list.add("знать");
        color_list.add("где");
        color_list.add("сидит");
        color_list.add("фазан.");

        System.out.println("Size of the color_list: " + color_list.size());

        // Печатаем нашу радугу
        for (String value : color_list) {
            System.out.print(value + " ");
        }
        System.out.println("\n--------------------------------------------------------------");
        // Создаем массив размером, как наш лист, приведенный выше
        String[] color_array = new String[color_list.size()];
        // Поскольку мы можем в массив затолкать другой соразмерный массив, то тут мы это и делаем,
        // методом *.toArray(), преобразуя лист в массив.
        color_array = color_list.toArray(color_array);

        // Выкатываем наш массив на экран
        System.out.println("Printing elements of color_array:");
        for (int i = 0; i < color_array.length; i++) {
            System.out.print(color_array[i] + " ");
        }
        System.out.println("\n--------------------------------------------------------------");
        /*
        !!! Класса 'Arrays' имеет невероятно удобный метод asList. В метод можно передавать
        все, что мы хотим сделать списком. И метод сделает это списком, правда с
        фиксированным размером, как я понял, и все же... !!!
         */
        List<String> wordsList = Arrays.asList("Каждый", "охотник", "желает", "знать", "где", "сидит", "фазан");
        // Создаем массивы методом toString несколькими способами:
        // 1-> Создали массив размером 20 и заполнили его методом toArray, свободные ячейки заполнит null;
        String[] wordsArray = wordsList.toArray(new String[20]);
        // 2->
        String[] wordsArray_2 = wordsList.toArray(new String[wordsList.size()]);
        // 3-> Некая вариация первого и второго, создаем пустой массив нужной длины
        String[] wordsArray_3 = new String[wordsList.size()];
        // Отправляем пустой массив в метод toArray
        wordsList.toArray(wordsArray_3);
        System.out.println("Размер массива -> " + wordsArray.length);
        for (int i = 0; i < wordsArray.length; i++) {
            System.out.print(wordsArray[i] + " ");;
        }
        System.out.println();
        for (int i = 0; i < wordsArray_2.length; i++) {
            System.out.print(wordsArray_2[i] + " ");;
        }
        System.out.println();
        for (int i = 0; i < wordsArray_3.length; i++) {
            System.out.print(wordsArray_3[i] + " ");;
        }
        System.out.println("\n--------------------------------------------------------------");
        /*
        Преобразование листа ссылочных данных в массив объектов
        */
        List<StringBuilder> rainbow = new ArrayList<>(21);
        // Добавляем элементы в лист, при этом больше чем заявили, проблем нет!
        rainbow.add(new StringBuilder("Каждый"));
        rainbow.add(new StringBuilder("охотник"));
        rainbow.add(new StringBuilder("желает"));
        rainbow.add(new StringBuilder("знать"));
        rainbow.add(new StringBuilder("где"));
        rainbow.add(new StringBuilder("сидит"));
        rainbow.add(new StringBuilder("фазан."));

        Object[] obj_array = rainbow.toArray();
        System.out.println("Размер массива -> " + obj_array.length);
        for (int i = 0; i < obj_array.length; i++){
            System.out.print(obj_array[i] + " ");
        }
    }
}
