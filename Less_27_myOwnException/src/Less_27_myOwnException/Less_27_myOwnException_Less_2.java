package Less_27_myOwnException;

public class Less_27_myOwnException_Less_2 {
    public static void main(String[] args) {
        Authentication.createPassword("ed45tegb");

        try{
        Authentication.createPassword("ed45");}
        catch (IllegalArgumentException ex){
            System.out.println(ex);
        }
        try{
        Authentication.createPassword("ed45tet4eg23fgb");}
        catch (IllegalArgumentException ex){
            System.out.println(ex);
        }


    }
}
/*
Считается что IllegalArgumentException обычно применяется для написания
своих классов исключений. Этот класс наследник RuntimeException, т.е.
ловится уже в полете. (Почему Java не управляет самолетами, из-за сборщика мусора)
*/
class Authentication{
    public static void createPassword(String pwd){
        if(pwd.length() < 6){
            throw new IllegalArgumentException("You enter to short Password");
        } else if (pwd.length() > 14){
            throw new IllegalArgumentException("You enter to long Password");
        } else {
            System.out.println("You password have right length!");
        }
    }
}
