package myFirstAbstractInterface.AbilityInterfaces;

public interface Rescuer {
    // Переменная уже по умолчанию public static final, потому что это interface
    int min_age = 18;
    void ableToProvideFirstAid();
    void capableOfExtinguishingSmallFires(String fire_tools);
    /*
    В данном случае default это не модификатор доступа, а указатель на то, что метод имеет
    некую дефолтную реализацию. Эту реализацию могут перезаписать только необходимые нам классы,
    (выбранные нами) а все остальные классы имплементирующие данный интерфейс могут использовать
    его текущую дефолтную реализацию (реализацию по умолчанию).
    */
    default void canUseTool(){
        System.out.println("Использует специальные инструменты");
    }
    /*
    Метод с такой реализацией (static) будет виден (если сам интерфейc public) и в других пакетах,
    по имени интерфейса, а не через переменную ссылающуюся на объект. В родном пакете он естественно
    будет доступен в пределах конкретной области видимости.
    */
    static void canControlSituation(){System.out.println("Все держит под контролем");}
    static void endOfWorld(){
        System.out.println("Конец всего сущего (Интерфейс RESCUER)");
    }
}

