package myFirstPolimorf_1.KitchenClases;

import myFirstPolimorf_1.FoodClases.Food;

// Родительский класс имеет некий метод возвращающий заданный класс (возможно, имеющий наследников)
public class Kitchener {
    // Private переменные не наследуются, но доступны через public методы.
    private int experience;
    public String name_of_restaurant;
    public Food make_a_dish(String name_of_dish) {
        System.out.println("Поваренок замутил -> " + name_of_dish);
        Food something_to_eat = new Food();
        something_to_eat.name_of_food = name_of_dish;
        return something_to_eat;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
