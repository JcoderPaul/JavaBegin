package myFirstAbstractInterface.AbilityInterfaces;

public interface SimpleAbilities {
    void swimmable(double distance);
    void ableToFastRun (double distance);
    /*
    В данном случае default это не модификатор доступа, а указатель на то, что метод имеет
    некую дефолтную реализацию. Эту реализацию могут перезаписать только необходимые нам классы,
    (выбранные нами) а все остальные классы имплементирующие данный интерфейс могут использовать
    его текущую дефолтную реализацию (реализацию по умолчанию).
    */
    default void ableToJamp (){System.out.println("Прыгаем");}
}

