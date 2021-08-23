package com.company;

public class Boss extends GameEntity {
    GameEntity gameEntity = new GameEntity();
    Weapon weaponBoss = new Weapon() {};
public String Info (){
    return  " boss имеет "+weaponBoss.getTypeweapon()+"оружия " + weaponBoss.getNameweapon();
}
    public String Info1(){
        return super.info();
    }
}