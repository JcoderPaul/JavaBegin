package myFirstPolimorf_1;

import myFirstPolimorf_1.FoodClases.*;
import myFirstPolimorf_1.KitchenClases.Chef;

public class myFirstPolimorf_Less_1 {
    public static void main(String[] args) {
        Chef ch_1 = new Chef();
        ch_1.setExperience(3);
        ch_1.name_of_restaurant = "Magilan";
        ch_1.make_a_dish("Kanilony");
        System.out.println(ch_1.getExperience() + " " + ch_1.name_of_restaurant);
//****************************************************************************************************
        System.out.println("---------------- Учитель ---------------- ");
        Employ teach = new Teacher();
        teach.eat();
        teach.works();
        // А вот метод teach.resting(); мы не можем использовать
        Teacher teach_2 = new Teacher();
        // И даже тут запуская метод teach_2.resting();
        // мы все равно ловим - Ambiguous method (Неоднозначный метод)
        // Статический метод родителя естественно принадлежит всем его потомкам
        teach_2.go_to_vacation();
        teach_2.died_at_work();

        System.out.println("---------------- Водитель ---------------- ");
        CarDriver cd_1 = new CarDriver();
        cd_1.eat(); // Метод родителя
        cd_1.eat("Гамбургер");
        cd_1.go_to_vacation();
        cd_1.died_at_work();
    }
}

class Employ{
    String name;
    double salary = 100;
    int age;
    int experience;

    public void eat(){
        System.out.println("Employ кушает");
    }
    public void works(){
        System.out.println("Employ работает");
    }
    private void resting(){
        System.out.println("Employ отдыхает");
    }
    static void go_to_vacation(){
        System.out.println("Employ ушел в отпуск");
    }
    final void died_at_work(){
        System.out.println("Employ помер");
    }
}

class Teacher extends Employ{
    int count_of_student;
    @Override // Аннотация к перезаписанному методу
    public void eat(){
        System.out.println("Teacher кушает");
    }
    // Среда разработки пока не ругается, но в момент обращения к методу, выдаст
    // предупреждение Ambiguous method (Неоднозначный метод)
    private void resting(){
        System.out.println("Teacher отдыхает");
    }
    /*
    Если мы попытаемся переписать final метод, то среда разработки выкинет предупреждение
    о том, что метод с подобным модификатором нельзя перезаписать.

    final void died_at_work(){
        System.out.println("Employ помер");
    }

    */
}

class CarDriver extends Employ{
    String model_of_car;

    // А вот это метод уже перегруженный (появился аргумент)
    public void eat(String food){
        Food food_1 = new Food();
        food_1.setName_of_food(food);
        System.out.println("CarDriver кушает " + food_1.getName_of_food());
    }
    static void go_to_vacation(){
        System.out.println("CarDriver ушел в отпуск");
    }
}

