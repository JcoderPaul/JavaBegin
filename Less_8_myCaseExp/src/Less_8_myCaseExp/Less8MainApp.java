package Less_8_myCaseExp;
/*
В отличии от IF...ELSE оператор SWITCH(принимает в себя только int, short, byte, char, string)
*/

/*
На вход оператора 'switch - переключатель' приходит одно из значений, далее в его теле
{ case ... case ... default} происходит перебор возможных вариантов действий, т.е., как
на старых тумблерных переключателях или переключателях скоростей (т.е. в один момент времени
возможен один исход).
!!! Правда с оговоркой !!!
Нужно помнить об операторе 'break' внутри каждого 'case' если мы не хотим чтобы 'switch'
отработал весь код ниже выбранного 'case'
*/
public class Less8MainApp {
    public static void main(String[] args) {
        // Используем String
        switch_of_day("Tuesday");
        // Используем int
        choose_your_weapon(5);
    }

    public static void switch_of_day(String day_of_week){
        String dayOfWeek = day_of_week;
         /*
         В данном примере, как минимум в 4-х 'case' содержится абсолютно одинаковый код,
         а поскольку он выполняется при выборе одного из 4-х возможных вариантов, мы можем
         в трех из возможных case-ах эти строки удалить или закомментировать и ничего
         не изменится в работе оператора. В двух последних case похожая ситуация.
         */

        switch (dayOfWeek) {
            case "Monday":
                // System.out.println("Working day until 18:00");
                // break;
            case "Tuesday":
                // System.out.println("Working day until 18:00");
                // break;
            case "Wednesday":
                // System.out.println("Working day until 18:00");
                // break;
            case "Thursday":
                System.out.println("Working day until 18:00");
                break;
            case "Friday":
                System.out.println("Working day until 16:00");
                break;
            case "Saturday":
                // System.out.println("Not working day");
                // break;
            case "Sunday":
                System.out.println("Not working day");
                break;
            default:
                System.out.println("There is no such day!");
        }
    }

    public static void choose_your_weapon(int my_weapon){

        switch (my_weapon) {
            case 1:
                 System.out.println("Fight with a knife");
                 break;
            case 2:
                 System.out.println("Fight with a pistol");
                 break;
            case 3:
                 System.out.println("Fight with a machine gun");
                 break;
            case 4:
                System.out.println("Fight with a flamethrower");
                break;
            case 5:
                System.out.println("Fight with a grenade launcher");
                break;
            case 6:
                 System.out.println("Use your battle tank");
                 break;
            case 7:
                System.out.println("Use your BIG FUCKING GUN, if you have it...");
                break;
            default:
                System.out.println("Fight with your fists!");
        }
    }
}
