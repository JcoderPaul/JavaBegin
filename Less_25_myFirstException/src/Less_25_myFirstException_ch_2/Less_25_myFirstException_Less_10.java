package Less_25_myFirstException_ch_2;
/*
Объявите переменную со значением null. Вызовите
метод у этой переменной, который выбросит
исключение. Отловите возникшее исключение.
*/
public class Less_25_myFirstException_Less_10 {
    public static void main(String[] args) {
        /*
        Синтаксические конструкции System.out.println()
        и System.err.println() делают одно и тоже, но в
        разных потоках.

        И на практике, мы не сможем получить
        последовательного вывода каждого сообщения в
        программе. Для получения этого эффекта мы
        используем поток вывода ошибок -
        System.err.println().

        Да, весь текст подсвечен красным, но программа
        началась и завершилась в штатном режиме, реализовав
        задание.
        */
        System.err.println("*** Старт программы ***");
        /*
        Ошибки подобного плана не отлавливают,
        а исправляют, т.к. это ошибка разработчика
        в чистом виде.
        */
        String myNullString = null;
        try{
            // Умышленно вызываем ошибку и отлавливаем.
            myNullString.length();
        } catch (NullPointerException ex){
            System.err.println("Работа блока catch");
            ex.printStackTrace();
        }
        System.err.println("*** Программа закончена ***");
    }
}
