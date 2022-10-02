package myFirstPolimorf_1.KitchenClases;

import myFirstPolimorf_1.FoodClases.Pasta;

/*
Класс шеф-повар является наследником от класса работник-кухни и тот и другой могут готовить
делать блюда, метод make_a_dish. При этом естественно они возвращают некую готовую еду.
Класс еда - Food - в нашем примере, тоже имеет потомков Apple, Pasta ...
!!! Так вот, в случае перезаписи метода класса родителя, в наследнике, мы можем использовать,
класс наследник возвращаемого объекта (возвращаемый тип данных - return type). !!!
Т.е. если у Food есть наследник Pasta (Apple ... ApricotPie), то его мы и можем подставить.
*/
public class Chef extends Kitchener {
    @Override
    public Pasta make_a_dish(String name_of_dish) {
        System.out.println("Мастер сотворил -> " + name_of_dish);
        Pasta carbanare = new Pasta();
        carbanare.name_of_food = name_of_dish;
        return carbanare;
    }
}
