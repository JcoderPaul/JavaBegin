package Less_11_myStringBuilder;

public class Less_11_StrBuil_8_PseudoEquivalent {
    public static void main(String[] args) {

        StringBuilder stringBuilder_1 = new StringBuilder("Hello World!");
        StringBuilder stringBuilder_2 = new StringBuilder("hELLo wORLd!");
        StringBuilder stringBuilder_3 = new StringBuilder("Hello World!");
        StringBuilder stringBuilder_4 = new StringBuilder("Hello!");

        boolean yes_or_no_eq = PseudoEquivalent(stringBuilder_1, stringBuilder_2);
        System.out.println("Совпадают ли StringBuilders: " + yes_or_no_eq);
        boolean yes_or_no_eq_2 = PseudoEquivalent(stringBuilder_1, stringBuilder_3);
        System.out.println("Совпадают ли StringBuilders: " + yes_or_no_eq_2);
        boolean yes_or_no_eq_3 = PseudoEquivalent(stringBuilder_3, stringBuilder_4);
        System.out.println("Совпадают ли StringBuilders: " + yes_or_no_eq_3);
        // Сравниваем пустые билдеры по содержимому
        System.out.println("Совпадают ли StringBuilders: " +
                            PseudoEquivalent(new StringBuilder(), new StringBuilder()));
        // Сравниваем билдеры с пустой строкой по содержимому
        System.out.println("Совпадают ли StringBuilders: " +
                            PseudoEquivalent(new StringBuilder(""), new StringBuilder("")));

    }

    public static boolean PseudoEquivalent(StringBuilder str_sb_1, StringBuilder str_sb_2) {
        // Изначально считаем что наши сравниваемые билдеры совпадают
        boolean result_of_comparison = true;
        // Сравниваем их по длине
        if (str_sb_1.length() == str_sb_2.length()){
            // Если длина совпадает, делаем посимвольное сравнение в цикле
            for (int i = 0; i < str_sb_1.length(); i++){
                // Символы под одинаковыми индексами в билдерах НЕ СОВПАДАЮТ
                if(str_sb_1.charAt(i) != str_sb_2.charAt(i)){
                    // Если символы не совпадают, ставим знак сравнения false
                    result_of_comparison = false;
                    // Прерываем цикл и отдаем в качестве результата метода false
                    break;
                }
            }
            /*
            Поскольку, в начале программы мы самонадеянно поставили возвращаемое
            методом значение true, то в случае успешной проверки первого IF
            (мы не дойдем до else и флаг не сменится на false) и неуспешной проверки
            второго IF (мы не найдем отличий в символах обоих билдеров и флаг проверки
            снова не сменится на false), в итоге, состояние возвращаемой переменной
            result_of_comparison не изменится, т.е. выходит, что принимаемые в качестве
            аргументов билдеры эквивалентны.
            */
        } else {
            // Если длины наших билдеров сразу не совпали, то они однозначно не равны
            // меняем значение возвращаемой переменной на false
            result_of_comparison = false;
        }
    return result_of_comparison;
    }
}
