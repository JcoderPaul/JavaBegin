package Less_19_myFirstInstanceOf;

public class myFirstInstanceOf_Less_2 {
    public static void main(String[] args) {
        MovieMaker md_1 = new MovieDirector();
        MovieProducer mp_2 = new MovieProducer();
        SimpleHumanAbility ms_3 = new ScreenWriter();
        MovieMaker mm_4 = new MovieMaker() {
            @Override
            void canRead() {System.out.println("Может читать");}

            @Override
            void canLongWork() {System.out.println("Может долго работать");}
        };
        /*
        Применение кастомизации к интерфейсу в массиве, апкастинг обычно происходит автоматом,
        а вот даункастинг мы прописываем руками, и к стати можем случайно обмануть компилятор,
        но при запуске у нас вылетит ошибка не соответствия типов.
        */
        MovieMaker[] mm_array = {md_1, mp_2, ((MovieMaker)ms_3), mm_4};
        for (MovieMaker mm_print:mm_array) {
            if (mm_print instanceof ScreenWriter){
                ((ScreenWriter)mm_print).canRelax();
            }
        }
//******************************************************************************************************
        // Переменная класса MovieMaker ссылается на потомка этого же класса MovieDirector
        MovieMaker mm_5 = new MovieDirector();
        // И вызывает метод класса MovieDirector это происходит в RunTime
        mm_5.canDoTrick();
        // Но вызывает переменные родителя без дополнительной кастомизации это CompileTime
        System.out.println(mm_5.age);
        // Вызываем переменную 'age' объекта 'new MovieDirector()'
        System.out.println(((MovieDirector)mm_5).age);
        /*
        Взято на https://ru.stackoverflow.com/ ->
        Коллега поделилась историей своего собеседования. Интервьюер задал вопрос по Java -
        "Как получить экземпляр абстрактного класса?". Она естественно ответила - "Никак.
        Нельзя создать объект абстрактного класса". Он с ней не согласился, заявив, что мы
        можем сделать это с помощью анонимного класса.

        По его мнению, в представленном ниже примере, в переменной 'mm_6' окажется ссылка на
        экземпляр абстрактного класса AbstractClass, то есть с помощью анонимного класса будет
        получен экземпляр абстрактного класса.
        */
        MovieMaker mm_6 = new MovieMaker() {
            @Override
            void canRead() { }
            @Override
            void canLongWork() {}
        };
        /*
        Однако таким образом будет получен экземпляр анонимного класса, но не абстрактного.
        В данном случае, анонимный класс это наследник, т.е. конкретный класс, хоть и созданный
        для выполнения единовременной конкретной задачи.

        Пообщавшись с множеством интервьюеров не только из сферы IT, я пришел к мнению, что первое
        впечатление играет очень важную роль (внешний вид, речь, и т.д.) и будь ты трижды профессионал,
        если допрашивающему я не приглянулся сразу ... то ладно бы отказ, можно и разумного фидбэка
        не получить, что ставит в тупик.
        */
        mm_6.canDoTrick();
        /* Но если мы попробуем сделать ->
        -> ((MovieDirector)mm_6).canDoTrick();
        то словим 'Exception in thread "main" java.lang.ClassCastException', что логично, мы не
        создавали объект 'MovieDirector' 'на который бы ссылалась переменная 'mm_6', т.е. она ничего
        не знает о методах другого класса.
        */
    }
}
