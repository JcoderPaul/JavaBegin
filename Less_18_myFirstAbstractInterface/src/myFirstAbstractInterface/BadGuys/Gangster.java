package myFirstAbstractInterface.BadGuys;

import myFirstAbstractInterface.AbilityInterfaces.СanDoTerribleThings;
import myFirstAbstractInterface.Workers.Employ;

public class Gangster extends Employ implements СanDoTerribleThings {
    @Override
    public void canKill() {System.out.println("Gangster убивает");}
    @Override
    public void canTorment() {System.out.println("Gangster избивает");}
    @Override
    public void knowsHowToInterrogate() {System.out.println("Gangster допрашивает");}

    @Override
    public void canEat(String food) {
        System.out.println("Gangster кушает " + food);
    }
    @Override
    public void canSleep(int time) {
        System.out.println("Gangster спит " + time + " часа");
    }
    @Override
    public void canWork(double time) {
        System.out.println("Gangster переступает закон " + time + " часов");
    }
}
