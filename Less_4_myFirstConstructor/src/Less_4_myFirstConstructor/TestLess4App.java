package Less_4_myFirstConstructor;

public class TestLess4App {
    public static void main(String[] args) {
        Praetorian praetorian_1 = new Praetorian("Markus");
        System.out.println(praetorian_1);

        Praetorian praetorian_2 = new Praetorian("Decimus",19);
        System.out.println(praetorian_2);

        Praetorian praetorian_3 = new Praetorian("Kilus",21,2);
        System.out.println(praetorian_3);

        Praetorian praetorian_4 = new Praetorian("Avrelyi",23,5,true,true,true);
        System.out.println(praetorian_4);

    }
}
