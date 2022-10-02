package Less_6_myFinalStaticVar;

public class FinalStaticVarApp {

    public static void main(String[] args) {
        Circle myCircle = new Circle();
        System.out.println("Длина окружности -> " + myCircle.circumFerence(10.2));
        System.out.println("Площадь круга -> " + myCircle.areaOfCircle(10.2));
        System.out.println("********************* PI *********************");
        System.out.println("Значение числа ПИ в нашем классе (вывод через класс) -> " + Circle.PI);
        System.out.print("Значение числа ПИ в нашем классе (вывод через метод класса) -> ");
        Circle.piPrint();
        System.out.println("********************* FullInfo *********************");
        myCircle.fullInfo(10.2);
    }

}

class Circle {
    // Абсолютная константа принадлежащая классу Circle
    protected final static double PI = 3.14;
    protected double radius;
    public Circle() {
    }
    public double circumFerence (double radius){
        double cf = 2*PI*radius;
        return cf;
    }
    public double areaOfCircle (double radius){
        double aoc = 2*PI*(radius*radius);
        return aoc;
    }
    // Полная видимость внутри собственного класса числа PI, и независимость метода от
    // создания объекта.
    public static void piPrint(){
        System.out.println(PI);
    }
    public void fullInfo(double radius){
        // В данном случае мы видим, что внутри одного класса, мы можем использовать
        // один метод этого класса в другом, без создания объекта.
        System.out.println("Длина окружности: " + circumFerence(radius));
        System.out.println("Площадь круга: " + areaOfCircle(radius));
    }
}