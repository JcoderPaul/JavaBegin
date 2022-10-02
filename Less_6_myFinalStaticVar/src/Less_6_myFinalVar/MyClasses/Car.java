package Less_6_myFinalVar.MyClasses;

public class Car {
    // Тут мы сразу инициализировали фиксированную переменную
    // и она будет постоянна для всех объектов созданных из этого класса,
    // хотя в каждом объекте она будет своя оригинальная.
    final int wheel = 4;
    String color;
    // Данная константа будет инициализирована через конструктор, и вот тут
    // все будет зависеть от выбранного конструктора, т.е. у разных объектов
    // созданных через разные конструкторы, могут быть различные значения констант.
    // Т.е. они жестко фиксированны для каждого созданного объекта (пусть и свои)
    final String engine;
    final boolean transmission;
    int doors;
    // При создании объекта через пустой конструктор, по умолчанию цвет черный
    // двигатель V12
    public Car() {
        color = "Black";
        engine = "V12";
        transmission = true;
        doors = 2;
    }
    // Если мы имеем возможность выбрать цвет, то двигатель будет только V8
    public Car(String color) {
        this.color = color;
        engine = "V8";
        transmission = true;
        doors = 6;
    }

    public Car(boolean transmission) {
        this.transmission = transmission;
        if (transmission == true) {
            this.color = "White";
            this.engine = "V6";
        } else {
            System.out.println("You can choose any color and engine for you " +
                               "car, but no have transmission!");
            this.color = "nop";
            this.engine = "nop";
        }
        this.doors = 4;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDoors() {
        return doors;
    }
    // Понятно, что обычно количество дверей жестко фиксировано, но если вы
    // смотрели шоу "ТащкуНаПрокащку", по можете представить, что всякое возможно.
    // В данном случае мы в качестве аргумента передаем константное значение переменой doors.
    public void setDoors(final int doors) {
        // т.е. эту переменную внутри этого метода нельзя переприсвоить
        // например сделать так -> doors = 12;
        // Среда разработки просто не станет компилировать такой код.
        this.doors = doors;
    }

    @Override
    public String toString() {
        return "Car have { " +
                " wheel = " + wheel +
                ", color = '" + color + '\'' +
                ", engine = '" + engine + '\'' +
                ", transmission = " + transmission +
                ", doors = " + doors +
                '}';
    }
}
