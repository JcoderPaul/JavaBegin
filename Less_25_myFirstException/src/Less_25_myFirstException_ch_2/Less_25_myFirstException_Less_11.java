package Less_25_myFirstException_ch_2;
/*
Напишите код, который создаст, а затем
отловит ArrayIndexOfBoundsException.
*/
public class Less_25_myFirstException_Less_11 {
    public static void main(String[] args) {
        System.out.println("*** Старт программы ***");
        /*
        Обращение к массиву за его пределами, например,
        попытка получить шестой элемент, при наличии
        всего пяти, выкинет ArrayIndexOfBoundsException
        */
        int [] myCauseOfException = {23, 5, 45, 7, 22};
        try {
            for (int i = 0; i <= myCauseOfException.length; i++){
                System.out.println(myCauseOfException[i]);
            }
        } catch (ArrayIndexOutOfBoundsException ex){
            System.err.println("Отработал блок catch");
            ex.printStackTrace();
            ex.getMessage();
        }
        System.out.println("*** Финиш программы ***");
    }
}
