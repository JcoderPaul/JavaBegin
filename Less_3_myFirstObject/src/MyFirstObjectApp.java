import java.util.ArrayList;
import java.util.List;
/*
Повторение мать учения. Пришлось вернуться назад, чтобы проработать пропуски.
Все что я делаю в уроках, это напоминание самому себе, возможно корявые но какие есть,
естественно в боевом коде подобных комментариев не будет. Но самый острый ум,
тупее самого тупого карандаша, поэтому я все записываю и складываю в архив, даже если
не придётся никогда этим воспользоваться.
*/

/*
!!! Имя файла MyFirstObjectApp и имя единственного публичного класса должны совпадать
Классов в данном куске коде может быть много, но публичным может быть только один,
методов main тоже может быть несколько. !!!
*/
public class MyFirstObjectApp {
    public static void main(String[] args) {
        // Создание объекта с конструктором по умолчанию и не приватными переменными.
        BankAccount firstClient = new BankAccount();
        // Обращение и задание переменных напрямую (ни через конструктор с аргументами, ни через сеттеры)
        firstClient.iD = 1;
        firstClient.clientName = "Петр Алексеевич Романов";
        firstClient.balance = 123.5;
        // Создание объекта с пустым конструктором, однако с private переменными, которые
        // придется задавать через сеттеры, а извлекать через геттеры
        DepositaryAccount firstDepoClient = new DepositaryAccount();
        // Задаем значения переменных объекта через сеттеры
        firstDepoClient.setDepoId(1);
        firstDepoClient.setClientDepoName("Борис Абрамович Березовский");
        // Создаем список объектов Stock
        List<Stock> babAmount = new ArrayList<>();
        // Создаем объекты класса Stock и тут же инициализируем переменные созданных объектов
        Stock avva = new Stock();
        // Переменные данного класса не private и не protected, т.е. их снова можно задавать, через имя
        // созданого класса, а не через сеттеры.
        avva.stockIssuer = "AVVA";
        avva.stockAmount = 1_000_000.56;

        Stock logovaz = new Stock();
        logovaz.stockIssuer = "ЛОГОВАЗ";
        logovaz.stockAmount = 2_000_000.12;
        // Помещаем объекты в список
        babAmount.add(avva);
        babAmount.add(logovaz);
        // Помещаем список в нужную переменную (по факту мы организуем ссылку на некую область памяти)
        firstDepoClient.setDepoAmount(babAmount);

        System.out.println("Данные банка -> \nID клиента: " + firstClient.iD +
                           "\nФИО: " + firstClient.clientName +
                           "\nБаланс: " + firstClient.balance);
        System.out.println("\n************************************************************************");

        System.out.println("Данные депозитаря -> \nID депонента: " + firstDepoClient.getDepoId() +
                "\nФИО: " + firstDepoClient.getClientDepoName() +
                "\nБаланс: " + firstDepoClient.getDepoAmount());

        System.out.println("Количество эмитентов в портфеле: " + firstDepoClient.getDepoAmount().size());


    }
}
// Простой класс имитирующий банковский счет, переменные имеют дефолтное состаяние
// и не требуют специальных методов для обращения к ним.
class BankAccount {
    /* Ниже описаны переменные будущего объекта
    (на данный момент пока только класса, схемы, некоего каркаса)
    При этом они имеют дефолтные состояни или значения по умолчанию.
    Мы их можем задать тут же, и тогда каждый новый объект будет их
    принимать в себя, хотя и будет занимать свою область памяти, как
    три 'зеленых - безколесых - мерседеса' стоящщих рядом на сборке.
    Естественно в дальнейшем их можно изменить, для каждого объекта.
    */
    int iD; // Дефолтное значение = 0, простой тип данных (примитивный)
    String clientName; // Дефолтное значение = null, ссылочный тип данных (строка это объект)
    double balance; // Дефолтное значение = 0.0
}
// Класс имитирующий депозитарный счет для хранения ЦБ, тут все переменные private и
// даже создав экземпляр класса к ним нет возможности обратится напрямую. Задать значения,
// а также получить их можно через специальные методы данного класса геттеры и сеттеры
// (задаттчики и берутчики или задуны и беруны, прекрасные русские слова)
class DepositaryAccount{
    private int depoId;
    private String clientDepoName;
    private List<Stock> depoAmount;
    // Метор позволяющий извлечь данные из переменной (в нашем случае depoId), обычно
    // начинается на *.get поэтому и называется старым русским словом геттер.
    // На вход ничего не принимает, т.е. без аргументов, однако возвращает значение
    // 'int', что указано в сигнатуре метода. Если метод что-то возвращает то в нем
    // будет присутствовать return и 'возвращаемое значение'.
    public int getDepoId() {
        return depoId;
    }
    // Метод позволяющий задать значение переменной depoId, обычно начинается на *.set
    // поэтому имеет простое русскоязычное определение сеттер. Ничего не возвращает
    // поэтому void, но на вход получает аргумент, который передается в переменную
    // (присваевается переменной, значение которой мы задаем).
    public void setDepoId(int depoId) {
        this.depoId = depoId;
    }

    public String getClientDepoName() {
        return clientDepoName;
    }

    public void setClientDepoName(String clientDepoName) {
        this.clientDepoName = clientDepoName;
    }

    public List<Stock> getDepoAmount() {
        return depoAmount;
    }

    public void setDepoAmount(List<Stock> depoAmount) {
        this.depoAmount = depoAmount;
    }
}
// Класс имитирующий некий пакет акций
class Stock{
    String stockIssuer;
    double stockAmount;

    // Метод позволяющий выводить сведения о классе (о его переменных) на печать.
    // Без него, в ходе печати, например массива, мы получим список ссылок на объекты
    // вида Stock@6f496d9f, Stock@723279cf . . . Реализация позволяет вернуть символьную
    // строку описывающую объект в некой удобной форме.
    @Override
    public String toString() {
        return "Stock => {" +
                "stockIssuer = '" + stockIssuer + '\'' +
                ", stockAmount = " + stockAmount +
                '}' + "\n";
    }
}