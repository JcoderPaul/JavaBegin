package Less_19_myFirstInstanceOf;
/*
instanceof - двоичный оператор, используемый для проверки, является ли объект (экземпляр)
подтипом данного типа. Он возвращает либо true, либо false. Он возвращает true, если левая
часть выражения является экземпляром имени класса с правой стороны. Instanceof оценивает
значение true, если объект принадлежит определенному классу или его суперклассу; else вызывает
ошибку компиляции. Если мы применим оператор instanceof с любой переменной с нулевым значением,
он вернет false. Это полезно, когда ваша программа может получить информацию о типе времени
выполнения для объекта. Ключевое слово instanceof также известно как оператор сравнения типов,
поскольку он сравнивает экземпляр с типом.
*/
public class myFirstInstanceOf_Less_1 {
    public static void main(String[] args) {
        System.out.println("----------------------------MovieMaker----------------------------");
        MovieMaker md_1 = new MovieDirector();
        MovieMaker md_null = null; // Ссылка на null (на ничто)
        /*
        Всегда проверяется сам объект, не переменная на него ссылающаяся, а именно объект.
        */
        System.out.println(md_1 instanceof MovieMaker); //true
        System.out.println(md_1 instanceof MovieDirector); //true
        System.out.println(md_1 instanceof SimpleHumanAbility); //true
        System.out.println(md_1 instanceof MovieProducer); //false
        System.out.println(md_1 instanceof ScreenWriter); //false
        System.out.println(md_null instanceof MovieMaker); //false пустота это не объект

        MovieMaker mp_2 = new MovieProducer();
        MovieMaker ms_3 = new ScreenWriter();
        System.out.println("----------------------------SimpleHumanAbility----------------------------");
        SimpleHumanAbility sm_1 = new MovieDirector();
        System.out.println(sm_1 instanceof MovieMaker); //true
        System.out.println(sm_1 instanceof MovieDirector); //true
        System.out.println(sm_1 instanceof SimpleHumanAbility); //true
        System.out.println(sm_1 instanceof MovieProducer); //false
        System.out.println(sm_1 instanceof ScreenWriter); //false
        System.out.println(sm_1 instanceof Object); //true всеотец однако

        SimpleHumanAbility sm_2 = new MovieProducer();
        SimpleHumanAbility sm_3 = new ScreenWriter();


    }
}

abstract class MovieMaker{
    int age = 18;
    int experience = 1;
    public boolean haveTalent = false;
    abstract void canRead();
    abstract void canLongWork();
    void canDoTrick() {
        System.out.println("Лучше каскадеров могут быть только другие каскадеры");
    }

}

class MovieDirector extends MovieMaker implements SimpleHumanAbility{
    int age = 28;
    int experience = 13;
    public boolean haveTalent = true;
    @Override
    void canRead() {System.out.println("Режиссер читает сценарий и хвалит сценариста");}
    @Override
    void canLongWork() {System.out.println("Режиссер не покидает съемочную площадку до заката");}
    @Override
    public void canSleep() {System.out.println("Режиссер спит окутанный прекрасными образами");}
    @Override
    public void canEat() {System.out.println("Режиссер ест стейк");}
    @Override
    public void canRelax() {System.out.println("Режиссер выпил стакан виски и курит сигару");}
    public void canDoTrick() {
        // Вызвали метод супер-класса, внутри его потомка
        super.canDoTrick();
        System.out.println("Режиссеры вам не каскадеры, но их трюки помнят долго");
    }
}
class MovieProducer extends MovieMaker implements SimpleHumanAbility{
    @Override
    void canRead() {System.out.println("Продюсер нашел отличный сценарий и готов найти под него деньги");}
    @Override
    void canLongWork() {System.out.println("Продюсер упорно ищет деньги на перспективный сценарий");}
    @Override
    public void canSleep() {System.out.println("Продюсер спит и ему снятся деньги");}
    @Override
    public void canEat() {System.out.println("Продюсер ест фуа-гра и пьет дорогой коктейль");}
    @Override
    public void canRelax() {System.out.println("Продюсер дунул косячек и целует ночную бабочку");}
    public void canDoTrick() {System.out.println("Все хотят освоить трюки с деньгами, " +
                                                 "но продюсеры их не рассказывают");}
}
class ScreenWriter extends MovieMaker implements SimpleHumanAbility{

    @Override
    void canRead() {System.out.println("Сценарист читает правки режиссера");}
    @Override
    void canLongWork() {System.out.println("Сценарист неустанно переписывает сценарий");}
    @Override
    public void canSleep() {System.out.println("Сценарист спит плохо, ему снится режиссер");}
    @Override
    public void canEat() {System.out.println("Сценарист кушает водку заедая ее бургером");}
    @Override
    public void canRelax() {System.out.println("Сценарист продолжает кушать водку");}
    void canDoTrick() {
        System.out.println("Трюки сценаристов самые дорогие, но их никто не обязан выполнять");
    }
}

interface SimpleHumanAbility {
    void canSleep();
    void canEat();
    void canRelax();
}