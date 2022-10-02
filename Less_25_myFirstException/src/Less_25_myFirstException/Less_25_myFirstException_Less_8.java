package Less_25_myFirstException;

import java.io.IOException;

/*
Наследование исключений и их взаимодействие в перегруженных методах
*/
public class Less_25_myFirstException_Less_8 {
    public static void main(String[] args) {
        Gun gs_1 = new SmallPistol();
        /* Если родитель выбрасывает исключение (способен это сделать), то и наследник естественно,
        по этому вызом метода у наследника будет требовать либо блока try-catch, либо предупреждения
        в сигнатуре.
        */
        try {
            gs_1.fire();
        } catch (IOException e) {
            System.out.println(e);;
        }
    }
}
// Перегруженные методы могут в сигнатуре иметь разные исключения
class Gun{
    void fire() throws IOException{
        System.out.println("Gun fire");
    }
    void fire(int count_of_projectile) throws Exception{
        System.out.println("Gun can fire if have projectile");
    }
}

class SmallPistol extends Gun{
/*
В методах класса наследника я могу не указывать выбрашиваемые исключения, но лучше это сделать,
однако, если метод перезаписывается, нельзя указывать класс исключение выше по иерархии чем у
родительского метода. Т.е. в методе приведенном ниже я не могу прописать 'throws Exception',
либо то же, что и у родителя, либо по иерархии ниже.
*/
    void fire() throws ClassCastException {
        System.out.println("Pistol fire");
    }
}