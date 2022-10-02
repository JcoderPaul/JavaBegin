import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Less_20_myFirstEquals {
    public static void main(String[] args) {
        Car car_1 = new Car("Red","Fiesta","Ford");
        Car car_2 = new Car("Red","Fiesta","Ford");
        Car car_3 = new Car("Silver","RAV4","Toyota");
        Car car_4 = new Car("Black","E330","Mercedes");
        Car car_5 = car_4;
        Car car_6 = new Car("Yellow","RAV4","Toyota");
        System.out.println(car_1.equals(car_2) + " или " + (car_1 == car_2));
        System.out.println(car_3.equals(car_4) + " или " + (car_3 == car_4));
        System.out.println(car_4.equals(car_5) + " или " + (car_4 == car_5));
        // Применяем кастомный equals, где цвет сравниваемых объектов не важен
        System.out.println(car_6.pseudo_equals(car_3) + " или " + (car_6 == car_3));

        List<Car> carList = new ArrayList<>();
        carList.add(car_1);
        carList.add(car_2);
        carList.add(car_3);
        carList.add(car_4); // сar_5
        carList.add(car_6);
        System.out.println(carList.contains(car_5)); // true хотя мы не добавляли его в лист
    }
}

class Car{
    String color;
    String model;
    String firma;

    public Car(String color, String model, String firma) {
        this.color = color;
        this.model = model;
        this.firma = firma;
    }
    /*
    В данном случае мы применили переписанный метод предложенный средой разработки.
    */
    @Override
    // Метод на вход принимает именно Object
    public boolean equals(Object obj) {
        // В данной проверке текущая ссылка, сопоставляется с принятой в качестве аргумента.
        // Если две разные ссылки указывают на один и тот же объект, естественно будет true.
        if (this == obj) return true;
        // Если принятая ссылка указывает на null или классы объектов не совпадают, то false
        if (obj == null || getClass() != obj.getClass()) return false;
        // Если же принятый в качестве аргументов объект можно кастомизировать как Car и ->
        Car car = (Car) obj;
        // -> все переменные обоих объектов на которые указывают ссылки эквивалентны, то true.
        return color.equals(car.color) && model.equals(car.model) && firma.equals(car.firma);
    }
    // Допустим нас интересует, схожесть только класса, модели и фирмы производителя.
    public boolean pseudo_equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Car car = (Car) obj;
        // Убираем из уравнения анализ эквивалентности объектов по цвету
        return model.equals(car.model) && firma.equals(car.firma);
    }
    // Вариант упрощенного перегруженного метода equals
    public boolean equals(Car car) {
        return color.equals(car.color) && model.equals(car.model) && firma.equals(car.firma);
    }
}
