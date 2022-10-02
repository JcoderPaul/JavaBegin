package Less_25_myFirstException;
/*
Мульти catch блоки и обработка исключений внутри catch блока (когда внутри блока ловушки
выбрасывается другое исключение, которое тоже надо обработать), вложенные try-catch блоки.
*/
public class Less_25_myFirstException_Less_7 {
    public static void main(String[] args) {
        Less_25_myFirstException_Less_7 double_catch = new Less_25_myFirstException_Less_7();
        double_catch.doubleCatchTest();
    }

    public void doubleCatchTest(){
        int [] sabater = {3,56,1,2,7};
        try {
            System.out.println(sabater[9]);
        }catch (ArrayIndexOutOfBoundsException exception_arr){
            /*
            Если внутри catch блока всплывает исключение, то его можно обработать только новым,
            уже внутренним блоком try-catch, первым выбрасывается всегда последнее исключение по ходу
            выполнения программы. Выброшенное в текущем catch блоке исключение не получится
            обработать в следующем catch блоке, если у нас используется мультикэтч структура, только
            вложенные try-catch.
            */
            String str_sabater = null;
            try {
                System.out.println(str_sabater.length());
            } catch (NullPointerException exception_str){
                System.out.println("Поймано исключение внутреннего try-catch блока");
                System.out.println(exception_str);
            }
            System.out.println("Поймано исключение внешнего try-catch блока");
            System.out.println(exception_arr);
        }catch (Exception exception_outer){
            System.out.println("Пойман второй по порядку кэтч");
            System.out.println(exception_outer);
        }
    }
}
