package myFirstAbstractInterface.Workers;

import myFirstAbstractInterface.AbilityInterfaces.Rescuer;
import myFirstAbstractInterface.AbilityInterfaces.SimpleAbilities;
import myFirstAbstractInterface.AbilityInterfaces.SpecialSkills;

/*
Если класс не перезаписывает методы абстрактного родителя, он сам обязан стать абстрактным
*/
public abstract class SchoolMan extends Employ {
    double numberOfTeachingHoursPerYear = 1008.5;
    String specialization;
    String subdivision;
}

class Teacher extends SchoolMan{

    @Override
    public void canEat(String food) {
        System.out.println("Teacher кушает " + food);
    }
    @Override
    public void canSleep(int time) {
        System.out.println("Teacher спит " + time + " часа");
    }
    @Override
    public void canWork(double time) {System.out.println("Teacher преподает " + time + " часа"); }
}
/*
Если класс имплементирует, но не реализует интерфейс(-ы), то он обязан стать абстрактным
*/
abstract class CaretakerAtSchool implements Rescuer, SimpleAbilities, SpecialSkills {

}