package myFirstAbstractInterface.AbilityInterfaces;

public interface СanDoTerribleThings {
    void canKill();
    void canTorment();
    /*
    В данном случае default это не модификатор доступа, а указатель на то, что метод имеет
    некую дефолтную реализацию. Эту реализацию могут перезаписать только необходимые нам классы,
    (выбранные нами) а все остальные классы имплементирующие данный интерфейс могут использовать
    его текущую дефолтную реализацию (реализацию по умолчанию).
    */
    default void knowsHowToInterrogate(){System.out.println("Уж допросим, так допросим");}
}
