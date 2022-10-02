package Less_25_myFirstException;

import java.io.IOException;

/*
Наследование исключений и их взаимодействие в перегруженных методах
*/
public class Less_25_myFirstException_Less_9 {
    public static void main(String[] args){
        /*
        Естественно если конструктор способен выбросить исключение, то его нужно обработать или
        прописать в сигнатуре соответствующего метода.
        */
        AutomaticGun automaticGun_1 = null;
        try {
            automaticGun_1 = new PPS();
        } catch (Exception e) {
            System.out.println(e);
        }
        /* Если родитель выбрасывает исключение (способен это сделать), то и наследник естественно,
        по этому вызом метода у наследника будет требовать либо блока try-catch, либо предупреждения
        в сигнатуре.
        */
        try {
            automaticGun_1.fire();
        } catch (IOException e) {
            System.out.println(e);;
        }
    }
}
// Перегруженные методы могут в сигнатуре иметь разные исключения
class AutomaticGun{
    public AutomaticGun() throws IllegalAccessException{
    }
    void fire() throws IOException{
        System.out.println("Gun fire");
    }
    void fire(int count_of_projectile) throws Exception{
        System.out.println("Gun can fire if have projectile");
    }
}

class PPS extends AutomaticGun{
    /*
    В конструкторе класса наследника я могу указывать исключение выше по иерархии или шире по захвату,
    возможных исключений, чего нельзя делать в методах.
    */
    public PPS() throws Exception {
        super();
    }
    void fire() throws ClassCastException {
        System.out.println("Pistol fire");
    }
}