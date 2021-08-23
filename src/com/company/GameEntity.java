package com.company;

public class GameEntity {
    public int Heals;
    public int Damage;

    public int getHeals() {
        return Heals;
    }

    public void setHeals(int heals) {
        Heals = heals;
    }

    public int getDamage() {
        return Damage;
    }

    public void setDamage(int damage) {
        Damage = damage;
    }
    public String info(){
        return " boss heals " + Heals +" bossdamage  "+ Damage;
    }
}
