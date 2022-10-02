package myFirstAbstractInterface.Workers;

import myFirstAbstractInterface.AbilityInterfaces.Rescuer;
import myFirstAbstractInterface.AbilityInterfaces.SimpleAbilities;
/*
Единичное наследование класса (обычного или абстрактного) - наследники объеденины некой единообразной
описательной структурой (возможно способностями) и многовариантное имплементирование интерфейсов
("абсолютного суперабстрактного класса") - подписавшиеся на реализацию всех прописанных в интерфейсе способностей.
*/
public class CarDriver extends Employ implements Rescuer, SimpleAbilities {
    String car_name;
    String specialization;

    @Override
    public void canEat(String food) {
        System.out.println("CarDriver кушает " + food);
    }
    @Override
    public void canSleep(int time) {
        System.out.println("CarDriver спит " + time + " часа");
    }
    @Override
    public void canWork(double time) {
        System.out.println("CarDriver ведет машину " + time + " часа");
    }
    @Override
    public void ableToProvideFirstAid() {System.out.println("CarDriver оказывает первую помощь");}
    @Override
    public void capableOfExtinguishingSmallFires(String fire_tools) {System.out.println("CarDriver тушит пожар " + fire_tools);}
    @Override
    public void swimmable(double distance) {System.out.println("CarDriver поплыл на " + distance + " метров");}
    @Override
    public void ableToFastRun(double distance) {System.out.println("CarDriver быстро побег на " + distance + " метров");}

    public String getCar_name() {
        return car_name;
    }

    public void setCar_name(String car_name) {
        this.car_name = car_name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}
