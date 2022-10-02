package Less_6_myFinalVar;

import Less_6_myFinalVar.MyClasses.Car;

/*
Модификатор final определяет переменную константу.
*/
public class CarFinalApp {
    public static void main(String[] args) {
        Car myCar = new Car();
        System.out.println(myCar);

        Car myCarTwo = new Car("Red");
        /*
        Две строки приведенные ниже будут помечены средой разработки, как недопустимые
        myCarTwo.transmission = false;
        myCarTwo.engine = "V14";
        либо нам будет предложено сделать выбранные переменные not final
        */
        System.out.println(myCarTwo);

        Car myCarThree = new Car(false);
        System.out.println(myCarThree);
        System.out.println("************************ Final ref ************************");
        // Зададим константу на ссылку на объект. В данном случае переменная myThirdCar
        // будет ссылаться только на этот объект и ни на что другое, хотя параметры этого
        // объекта мы можем менять.
        final Car myThirdCar = new Car("Blue");
        System.out.println(myThirdCar);
        myThirdCar.setColor("Zebra color");
        System.out.println(myThirdCar);
        // А вот такой код не пройдет -> myThirdCar = new Car(true); поскольку переменная final
        // среда разработки предупредит об ошибке.
        myThirdCar.setDoors(12);
        System.out.println(myThirdCar);
    }
}
