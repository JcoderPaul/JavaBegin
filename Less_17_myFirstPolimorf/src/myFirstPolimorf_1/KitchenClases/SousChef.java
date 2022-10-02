package myFirstPolimorf_1.KitchenClases;

import myFirstPolimorf_1.FoodClases.Bukatiny;
import myFirstPolimorf_1.FoodClases.Food;

public class SousChef extends Chef {
    /*
    Если мы попробуем убрать возвращаемый объект при сохранении имени и аргумента,
    среда разработки этого не позволит, нам просто придется создать другой метод
    (возможно с очень похожим, но другим названием).
    !!! При этом правило наследования сохраняется - мы не можем указать (возвращаемый
    тип данных - return type) super-class Food, поскольку, для класса Pasta наследником
    является класс Bukatiny. (либо придется использовать кастомизацию возвращаемого
    объекта апкастинг или даункастинг)!!!
    Т.е. либо родитель, либо дети (не super родителя), естественно в теле метода можно
    поиграть с создаваемыми объектами.
    !!! Класс наследник расширяет границы родителя и знает о его содержимом, но вот класс родитель
    находится в пределах своих границ и не знает, что творится за их пределами, т.е. чего еще может,
    или содержит, наследник (наследники) !!!
    */
    @Override
    public Bukatiny make_a_dish(String name_of_dish) {
        System.out.println("СуШеф намесил -> " + name_of_dish);
        Food bukatiny = new Bukatiny();
        bukatiny.name_of_food = name_of_dish;
        return (Bukatiny) bukatiny;
    }
}
