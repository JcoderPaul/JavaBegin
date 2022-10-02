package Less_8_myCaseExp;

public class Lass8DayOfMonth {
    public static void main(String[] args) {
        Month.day_of_month(23);
    }
    /*
    Для опытных, да, но для новичков, или чуть оперившихся многие вещи не очевидны,
    поскольку IDE-а услужливо подсказывает, чего можно сделать с той или иной ошибкой.
    Это благо и кошмар тех, кто начал программировать в 45 )))

    И так, в операторе связке 'switch-case' порядок кейсов может быть любым, лишь бы
    не забывали расставлять 'break;' в нужных местах. Так же не важно где будет стоять
    'default' он исполнится в последнюю очередь.

    Естественно для удобства восприятия (уважаем и себя и тех, кто будет читать наш код)
    лучше расставлять все максимально логично и по порядку.
    */
    class Month{
        public static void day_of_month(int month){
            switch (month) {
                default:
                    System.out.println("No month exists!");
                    break;
                case 2:
                    System.out.println("Day in month 28 (normal year) or 29 (leap year)");
                    break;
                case 11:
                case 9:
                case 6:
                case 4:
                    System.out.println("Day in month 30");
                    break;
                case 12:
                case 5:
                case 8:
                case 7:
                case 10:
                case 3:
                case 1:
                    System.out.println("Day in month 31");
                    break;
            }
        }
    }
}
