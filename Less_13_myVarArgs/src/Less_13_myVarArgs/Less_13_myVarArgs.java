package Less_13_myVarArgs;

public class Less_13_myVarArgs {
/*
ВарАргс параметры в методах, синтаксис: имя_метода( int ... par) в скобках,
указываем тип переменных, далее следует '...' многоточие и имя параметра.
Такой мультипараметр всегда идет последним в наборе передаваемых аргументов.
Например, имя_метода(String str, double dub, int ... int_par) и
наконец список массивов имя_метода(int[]...arrays), т.е. тут массив-массивов см.
пример ниже.

!!! Ошибка на этапе компиляции прилетит в случае, если мы, попытаемся перегрузить метод!!!
    мой_класс {
        мой_метод(String ... str) {some code}
        мой_метод(String[] str) {some code}
    }
т.ч. придется придумать новое имя для одного из классов. !!! При этом метод с набором аргументов
(String ... str) или (int ... int_arg) легко примет в себя массив, т.к. все равно набор введенных
значений преобразуется в массив. !!! В обратную сторону этот фокус не работает, т.е если у нас
метод -> my_method(int[] int_arg) -> мы не сможем загнать в качестве аргументов простой список данных:
1,2,4,6 и т.д., только массив.
*/

    public static void main(String[] args) {
        summa(1,5,58);
        System.out.println("--------------------------------------------------------");

        summaArr(new int[]{1,5,58});
        System.out.println("--------------------------------------------------------");
        int[] intArr = {45,556,58};
        summaArr(intArr);

        System.out.println("--------------------------------------------------------");
        pseudoConcat("Hello","big","sunny","day!");

        System.out.println("--------------------------------------------------------");
        summAndConcat("Сумма 4-х чисел -> ", 4,56,72,45);

        System.out.println("--------------------------------------------------------");
        int[] int_ar_1 = {2,45,7,9,9};
        int[] int_ar_2 = {12,39,79};
        int[] int_ar_3 = {14,6,27,392,719};
        int[] int_ar_4 = {14};
        int[] int_ar_5 = {212,349,795,112,439,879};
        maltyArrPrint(int_ar_1,int_ar_2,int_ar_3,int_ar_4,int_ar_5);
    }
    // Вместо того чтобы через запятую размещать неопределенное количество однотипных
    // переменных и создавать перегруженные методы применяется такой синтаксис (int ... a)
    public static void summa(int ... a){
        int summ = 0;
        for (int i = 0 ; i < a.length; i++){
            summ +=a[i];
        }
        System.out.println(summ);
    }
    public static void summaArr(int[] a){
        int summ = 0;
        for (int i = 0 ; i < a.length; i++){
            summ +=a[i];
        }
        System.out.println(summ);
    }

    public static void pseudoConcat(String ... str){
        String concatStr = "";
        for (int i = 0 ; i < str.length; i++){
            // Чуть красоты в виде " "
            concatStr += str[i] + " ";
        }
        System.out.println(concatStr);
    }

    public static void summAndConcat(String str, int ... a){
        int summ = 0;
        for (int i = 0 ; i < a.length; i++){
            summ +=a[i];
        }
        System.out.println(str + summ);
    }

    public static void maltyArrPrint(int [] ... arrays){
        // В данном случае происходит преобразование набора массивов в многомерный массив
        // или массив-массивов или [][] если на входе будет 2-а массива и т.д. [][][]...[]
        for (int i = 0; i < arrays.length; i++){
            System.out.print("Массив -> " + (i+1) + "(" + i + ")" + " : ");
            for (int j = 0; j<arrays[i].length; j++){
                System.out.print(arrays[i][j] + " ");
            }
            System.out.println();
        }
    }
}
