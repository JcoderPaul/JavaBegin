package Less_13_myVarArgs;

public class Less_13_myForEach_2 {
    public static void main(String[] args) {
        StringBuilder str_sb_1 = new StringBuilder("Honey");
        StringBuilder str_sb_2 = new StringBuilder("World");
        StringBuilder str_sb_3 = new StringBuilder("Sunny");
        /*
        То что изменить содержимое массива с помощью for-each цикла,
        таки, можно мы разобрались, да, длиннее код, но все же...
        Со StringBilder, то же самое, но теперь мы можем дополнить,
        каждый элемент массива через, *.append().

        Хитрость (я 'новичок', не боевое отравляющее вещество, для меня все хитрость и магия)
        тут в том, что ссылочные переменные - ССЫЛОЧНЫЕ - и значение 'sb-cor' принимая в себя
        ссылку на объект, получает доступ к объекту, но не к ссылкам массива. Их он не изменяет.
        */
        System.out.println("Изменяем объекты с сохранением ссылок в массиве : ");
        StringBuilder[] sb_arr_1 = {str_sb_1, str_sb_2, str_sb_3};
        for (StringBuilder sb_cor: sb_arr_1) {
            sb_cor.append(" really cool!");
        }


        for (int i = 0; i < sb_arr_1.length; i++){
            System.out.println(sb_arr_1[i]);
        }

        System.out.println("Ссылка на один и тот же объект -> " + (str_sb_1 == sb_arr_1[0]));
        System.out.println("Ссылка на один и тот же объект -> " + (str_sb_2 == sb_arr_1[1]));
        System.out.println("Ссылка на один и тот же объект -> " + (str_sb_3 == sb_arr_1[2]));

        System.out.println("\n------------------------------------------------------------------");
        System.out.println("Перенаправляем ссылки массива на другие объекты : ");
        // В нашем массиве n - элементов (0 . . . n - 1), поскольку отсчет идет с '0'.
        int count = sb_arr_1.length - 1;
        // Как мне намекнули цикл for-each все равно 'под капотом' превращается в классический
        // цикл, мы этим и воспользуемся, для переназначения ссылок.
        for (StringBuilder sb_cor: sb_arr_1) {
            sb_arr_1[count] = new StringBuilder("Big Change");
            count--;
            if (count < 0) {
                break;
            }
        }

        for (int i = 0; i < sb_arr_1.length; i++){
            System.out.println(sb_arr_1[i]);
        }

        System.out.println("Ссылка на один и тот же объект -> " + (str_sb_1 == sb_arr_1[0]));
        System.out.println("Ссылка на один и тот же объект -> " + (str_sb_2 == sb_arr_1[1]));
        System.out.println("Ссылка на один и тот же объект -> " + (str_sb_3 == sb_arr_1[2]));
        System.out.println("\n------------------------------------------------------------------");
    }
}
