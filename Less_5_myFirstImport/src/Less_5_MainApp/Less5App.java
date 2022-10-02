// 1. Импорт пакета
package Less_5_MainApp;
/*
Импорт классов можно делать разными способами, что позволяет ограничивать загрузку
памяти (часто используемые):
- Через подгузку отдельного класса по полному пути, в момент его вызова (создания);
- Через импорт (import) всего пакета;
- Через импорт (import) полного пути к классу;
- Через статический импорт;
*/
// 2. Импорт классов (порядок импорта не изменен)
// Подгружаем только конкретный класс.
import Less_5_myFirstImport.crocodiles.Alligator;
// Подгружаем весь пакет разом, но только его классы, а не содержимое подпакетов.
import Less_5_myFirstImport.crocodiles.small_crocodile.OsteolaemusTetraspis;
import Less_5_myFirstImport.snakes.*;
// Подгружаем класс из подпакета в пакете snake (ну, вот так).
import Less_5_myFirstImport.snakes.small_snakes.TetracheilostomaCarlae;
// Импортируем статическую переменную по полному пути, что позволит в коде обратиться к ней напрямую.
import static Less_5_myFirstImport.crocodiles.small_crocodile.OsteolaemusTetraspis.length;
// Импортируем статический метод по полному пути, что позволит в коде обратиться к нему напрямую (см. ниже).
import static Less_5_myFirstImport.crocodiles.small_crocodile.OsteolaemusTetraspis.smallCrocodileMakeSound;

public class Less5App {
    // Основной метод публичен (виден всем и везде), статичен (не зависит от объекта, принадлежит классу)
    // ничего не возвращает, может принимать на вход некие аргументы (массив строк).
    public static void main(String[] args) {
        Alligator alik_krokodile = new Alligator();
        alik_krokodile.makeSound();

        Cobra cobre_luysya = new Cobra();
        cobre_luysya.makeSound();

        // Подгружаем объект по прямому пути к нему в момент создания
        Less_5_myFirstImport.crocodiles.Caiman colya_krocodile =
                new Less_5_myFirstImport.crocodiles.Caiman();
        colya_krocodile.makeSound();
        /*
        Не публичные классы видны только в пределах своего пакета, поэтому класс
        Viper не будет виден, и мы не сможем создать его объект, даже при том,
        что весь пакет импортирован (расшарен).

        Среда разработки выдаст предупреждение на код -> Viper viper = new Viper();
        */

        TetracheilostomaCarlae lite_snake = new TetracheilostomaCarlae();
        lite_snake.makeSound();

        // Мы не создавали объекта из класса зарытого в 3-и (три) подпакета, а просто
        // импортировали (см. выше) его статические переменные и методы и использовали в коде.
        double small_croco_length = length;
        System.out.println("Западно-африканский тупорылый крокодил имеет длину -> "
                            + small_croco_length + " метра.");
        OsteolaemusTetraspis.smallCrocodileMakeSound();
    }
}
