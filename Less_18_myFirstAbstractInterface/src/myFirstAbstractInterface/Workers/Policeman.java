package myFirstAbstractInterface.Workers;

import myFirstAbstractInterface.AbilityInterfaces.Rescuer;
import myFirstAbstractInterface.AbilityInterfaces.SimpleAbilities;
import myFirstAbstractInterface.AbilityInterfaces.SpecialSkills;

public class Policeman extends Employ implements Rescuer, SimpleAbilities, SpecialSkills {
    String rank;
    String subdivision;

    @Override
    public void canEat(String food) {
        System.out.println("Policeman кушает " + food);
    }
    @Override
    public void canSleep(int time) {
        System.out.println("Policeman спит " + time + " часа");
    }
    @Override
    public void canWork(double time) {
        System.out.println("Policeman ловит бандюков  " + time + " часа");
    }
    @Override
    public void ableToProvideFirstAid() {System.out.println("Policeman оказывает первую помощь");}
    @Override
    public void capableOfExtinguishingSmallFires(String fire_tools) {System.out.println("Policeman тушит пожар " + fire_tools);}
    @Override
    public void swimmable(double distance) {System.out.println("Policeman поплыл на " + distance + " метров");}
    @Override
    public void ableToFastRun(double distance) {System.out.println("Policeman быстро побег на " + distance + " метров");}
    @Override
    public void abilityToShoot() {System.out.println("Policeman метко стреляет");}
    @Override
    public void abilityToFight() {System.out.println("Policeman круто дерется");}
    @Override
    public void abilityToThink() {System.out.println("Policeman немного думает");}
    @Override
    public void beIncorruptible() {System.out.println("Policeman вам не оборотень в погонах");}
    @Override
    public void canKill() {System.out.println("Policeman новичок случайно убивает");}
    @Override
    public void canTorment() {System.out.println("Плохой Policeman чрезмерно применяет силу");}
    @Override
    public void knowsHowToInterrogate() {System.out.println("Плохой Policeman допрашивает с пристрастием");}
    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getSubdivision() {
        return subdivision;
    }

    public void setSubdivision(String subdivision) {
        this.subdivision = subdivision;
    }

}
