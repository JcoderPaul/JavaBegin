package myFirstAbstractInterface.AbilityInterfaces;
/*
Интерфейс может наследовать один и более других интерфейсов
*/
public interface SpecialSkills extends СanDoTerribleThings {
    int min_spec_operation = 1;
    void abilityToShoot();

    void abilityToFight();

    void abilityToThink();
    /*
        В данном случае default это не модификатор доступа, а указатель на то, что метод имеет
        некую дефолтную реализацию. Эту реализацию могут перезаписать только необходимые нам классы,
        (выбранные нами) а все остальные классы имплементирующие данный интерфейс могут использовать
        его текущую дефолтную реализацию (реализацию по умолчанию).
    */
    default void beIncorruptible(){System.out.println("Не берем взяток, деньгами");};
}
