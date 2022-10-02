package Less_10_myStringMethod;
/*
Имеем длинную не отформатированную в поэтическом формате строку,
нужно отформатировать и красиво отобразить.
*/
public class Less_10_Part_10_Rubai {
    public static void main(String[] args) {
        // У нас есть длинная не отформатированная строка,
        // которую нужно превратить в стихотворную строфу
        String str_1 = "Чтоб мудро жизнь прожить, знать надобно немало, " +
                       "Два важных правила запомни для начала: Ты лучше голодай, " +
                       "чем что попало есть, И лучше будь один, чем вместе с кем попало.";
        // Создаем вспомогательную строку, просто поднимаем регистр основной строки
        String str_2 = str_1.toUpperCase();
        char c1, c2; // Можно и так объявлять переменные
        // Цикл будет работать пока не достигнет конца основной строки (длину мы замерили)
        for(int i = 0; i < str_1.length(); i++){
            c1 = str_1.charAt(i); // Берем i символ из основной строки
            c2 = str_2.charAt(i); // Берем i символ из вспомогательной строки
            /*
            Cамое важное тут сочетание условий -> Если символ основной строки ОДНОВРЕМЕННО:
            - и не запятая,
            - и не двоеточие,
            - и не пробел,
            - и не точка,
            - и текущий символ основной строки эквивалентен символу upperCase строки.
            Только тогда код проваливается внутрь тела IF пробрасывает пустую строку
            т.е. переводит каретку на следующую строку и печатает символ с большой буквы,
            как совпавший при условии эквивалентности и запускает цикл со следующего символа.

            Поскольку toUpperCase оставляет неизменными знаки препинания и пробелы, то оставь
            мы в операторе IF только условие c1 == c2 программа переводила бы коретку после
            каждого знака препинания и пробела, т.к. они бы безусловно отвечали условию c1 == c2.
            В качестве эксперимента можно просто оставить одно соответствие и увидеть результат.
            */
            if (c1 != ',' && c1 != ':' && c1 != ' ' && c1 != '.' && c1 == c2){
                System.out.println();
                System.out.print(c1);
                continue;
            }
            System.out.print(c1);
        }
        System.out.println();
    }
}