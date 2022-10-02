package Less_10_myStringMethod;

public class Less_10_Part_1_Compare {
    public static void main(String[] args) {
        // Создали новую строку, которая автоматом залетела в String pool
        String str_1 = "Привет мир!";
        // Создали точно такую же строку, по содержанию, однако, ссылка будет на другой объект
        String str_2 = new String("Привет мир!");
        // Создали еще строку, и вот тут мы получим ссылку на уже созданную строку в String pool
        String str_3 = "Привет мир!";

        // '==' - оператор сравнения по ссылке, 'equals' - оператор сравнения по содержимому
        System.out.println("---------------------------------------------------------------");
        System.out.println(str_1 == str_2); // False т.к. адреса объектов разные
        System.out.println(str_1.equals(str_2)); // True т.к. содержимое объектов одинаковое
        System.out.println("---------------------------------------------------------------");
        System.out.println(str_1 == str_3); // True т.к. указатели обеих ссылок идут к одному объекту
        System.out.println(str_1.equals(str_3)); // True объект и его содержимое всегда равно само себе
    }
}
