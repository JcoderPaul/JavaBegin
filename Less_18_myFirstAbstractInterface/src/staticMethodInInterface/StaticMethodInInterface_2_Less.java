package staticMethodInInterface;

import myFirstAbstractInterface.AbilityInterfaces.Rescuer;
/*
!!! Интересный момент !!! Класс StaticMethodInInterface_2_Less не имплиментирует ни одного интерфейса,
ни 'CarEngine', ни тем более 'Rescuer' из пакета myFirstAbstractInterface.AbilityInterfaces и все же
ЛЕГКО получает доступ к статическому методу ПУБЛИЧНОГО интерфейса.
*/
public class StaticMethodInInterface_2_Less {
    public static void main(String[] args) {
        Car car_test = new Car();
        /*
        Статический метод интерфейса не наследуется и не запускается
        через ссылку на объект -> car_test.engineRun();
        Как и статический метод класса он запускается, через имя интерфейса.

        !!! При этом снова в игру вступает scope (область видимости) если интерфейс
        находится в другом пакете, то доступ к нему будет скорее всего ограничен.
        */
        CarEngine.engineRun();
        car_test.engineStop();
        /*
        Интерфейс с public модификатором доступа виден и здесь, если бы модификатор у интерфейса
        был default, то мы из данного пакета не увидели бы ни интерфейс, ни его методы.
        */
        Rescuer.canControlSituation();
        /*
        Интерфейсы 'CarEngine' и 'Rescuer' с public модификатором доступа виден и здесь, если бы модификатор у интерфейса
        был default, то мы из данного пакета не увидели бы ни интерфейс, ни его методы.
        */
    }
}

interface CarEngine {
    static void engineRun(){
        System.out.println("Engine is Run!");
    }
     void engineStop();

    static void endOfWorld(){
        System.out.println("Конец всего сущего (Интерфейс CARENGINE)");
    }
}

class Car implements CarEngine{
    String name_of_maker;
    String name_of_model;

    @Override
    public void engineStop() {
        System.out.println("Двигатель остановлен");
    }
}
/*
Даже если интерфейсы 'CarEngine', 'Rescuer' имеют два абсолютно одинаковых статических метода,
любой класс может их одновременно имплементировать не опасаясь казусов, поскольку доступ к методам
все равно осуществляется по имени интерфейса.

*/
class UseTowInterfaceWithSameMethod implements Rescuer, CarEngine{

    public static void main(String[] args) {
        // Оба отрабатывают на ура!!!
        Rescuer.endOfWorld();
        CarEngine.endOfWorld();
    }

    @Override
    public void ableToProvideFirstAid() {

    }

    @Override
    public void capableOfExtinguishingSmallFires(String fire_tools) {

    }

    @Override
    public void engineStop() {

    }
}