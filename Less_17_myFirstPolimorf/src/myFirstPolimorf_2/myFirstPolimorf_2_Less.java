package myFirstPolimorf_2;
/*
- Compile time связь определена для методов private, finale (фиксируются на классе),
static (фиксируются на классе) и для всех переменных класса.
- Run time связь определяется для всех остальных методов (не private, не static, не final)
в процессе исполнения программы.
*/
public class myFirstPolimorf_2_Less {
    void getImage(Gun gun){System.out.println("(MAIN) Out of GUN");}
    void getImage(ArcheryBow bow){System.out.println("(MAIN) Out of BOW");}

    public static void main(String[] args) {
    myFirstPolimorf_2_Less less_out = new myFirstPolimorf_2_Less();
    // Создали объект и тут возникает махонька путонка, 'g_1' это ссылочная переменная класса
    // родителя Gun, но ссылается она его детенка на ArcheryBow и по этому ->
    Gun g_1 = new ArcheryBow();
    // -> как обычная переменная она показывает какому из перегруженных методов *.getImage()
    // работать в данной ситуации, естественно методу, что принимает переменную Gun и это видно
    // еще на этапе компиляции (Compile time)
    less_out.getImage(g_1);
    // Но ссылка все равно идет на объект ArcheryBow и значит запустится именно его метод *.getTtd(),
    // а вот это определяется уже в процессе исполнения кода (Run time)
    g_1.getTtd();
    g_1.effective_range(150);
    // А вот тут интересный момент !!! ссылка класса Gun, но на объект ArcheryBow, однако активируется
    // статический метод класса Gun, что логично, ниже приведен другой пример ->
    g_1.loading_the_gun();
    // Поскольку методы у дочернего и родительского класса похожи (а ссылка одного класса, указывает
    // на другой класс - неоднозначность), мы явно (кастомизируем) указываем, метод какого класса запускать.
    ((ArcheryBow) g_1).setCaliber(5.45);
    // Явно указываем переменную какого класса (родительского или дочернего)
    // мы хотим увидеть, через ссылку 'g_1'
    System.out.println("Класс GUN -> " + g_1.automaticFire);
    System.out.println("Класс ArcheryBow -> " + ((ArcheryBow)g_1).automaticFire);
    // Перекрывание одноименных переменных, !!! разного типа !!! тоже возможно !!!,
    // указываем переменную какого класса (родительского или дочернего)
    // мы хотим увидеть, через ссылку 'g_1'
    System.out.println("Класс GUN -> " + g_1.reliability);
    System.out.println("Класс ArcheryBow -> " +((ArcheryBow) g_1).reliability);
    System.out.println("------------------------------------");
    ArcheryBow long_bow = new ArcheryBow();
    less_out.getImage(long_bow);
    long_bow.getTtd();
    long_bow.effective_range(300);
    long_bow.setCaliber(85.7);
    // -> Ссылочная переменная класса ArcheryBow указывает на объект этого же класса и тут уже
    // активируется статический метод дочернего класса (В данном случае происходит, сокрытие одного метода
    // другим (hiding), т.е. метод дочернего класса, перекрывает метод родителя).
    // Еще раз методы (переменные) private не перегружаются, не перекрываются, не наследуются - они собственность
    // родительского класса (которая не достанутся непутевым детям)
    long_bow.loading_the_gun();
    System.out.println("Наличие функции автоматической стрельбы -> " + long_bow.automaticFire);
    System.out.println("Надежность -> " + long_bow.reliability);
    System.out.println("------------------------------------");
    Gun gun_2 = new Gun();
    less_out.getImage(gun_2);
    gun_2.getTtd();
    // Приватный метод виден только в пределах своего класса, поэтому - gun_2.setCaliber(12.7);
    // в данном классе (MAIN методе) выдаст предупреждение и не скомпилируется, см. пример ниже ->
    gun_2.effective_range(1500);
    gun_2.loading_the_gun();
    System.out.println(gun_2.automaticFire);
    }
}
/*
Похожий эксперимент я уже проводил в прошлом примере. Методы private, static(???), final не
перезаписываются в классах наследниках.
*/
class Gun{

    boolean automaticFire = true;
    // Переменные с одним названием, но разного типа в классе родителе и классе наследнике,
    // тоже могут сокрывать одна другую.
    String reliability = "Very high!";
    void getTtd(){
        System.out.println("(GUN Class) getTtd of GUN");
    }
    /*
    !!! Еще раз методы (переменные) private не перегружаются, не перекрываются, не наследуются - они собственность
    родительского класса !!!
     */
    private void setCaliber(double caliber){
        System.out.println("Gun have -> " + caliber + " caliber");
    }
    final void effective_range(double range){
        System.out.println("Gun effective range of kill -> " + range);
    }
    static void loading_the_gun(){
        System.out.println("Gun was loading very fast!");
    }

    public static void main(String[] args) {
        Gun big_fucking_gun = new Gun();
        // -> а вот внутри своего класса приватный метод доступен для работы
        big_fucking_gun.setCaliber(120.6);
    }
}
class ArcheryBow extends Gun{
    boolean automaticFire = false;
    int reliability = 10;
    @Override
    // Если мы добавим эту аннотацию к методу, который, вроде бы, кажется нам перезаписанным,
    // то среда разработки выдаст предупреждение, если он таковым не является (естественно,
    // это не основная функция этой аннотации).
    void getTtd(){
        System.out.println("(Archery Class) getTtd of ArcheryBow");
    }
    // На этапе написания кода private метода у наследника вопросов не возникает, а вот затем,
    // возникает ошибка - два идентичных метода, т.е. непонятно, что запускать (вроде, как, наследство
    // видеть ты можешь, а вот воспользоваться им нет, заводи свою частную собственность), придется делать
    // похожий метод с другим именем или менять модификатор доступа и тогда это совершенно другой метод.
    public void setCaliber(double caliber){
        System.out.println("BOW have -> " + caliber + " caliber");
    }
    /*
    Если раскомментировать метод, получим предупреждение о невозможности перегрузить
    final метод, оно и понятно - он же окончательный (константа)

    final void effective_range(double range){
        System.out.println("Gun effective range of kill -> " + range);
    }
    */
    static void loading_the_gun(){
        System.out.println("ArcheryBow was loading not so fast!");
    }
}