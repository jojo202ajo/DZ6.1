package com.company;

public class Main {
    public static void main(String[] args) {
        Boss boss1 = new Boss();
        boss1.setHeals(600);
        boss1.setDamage(50);
        boss1.weaponBoss.setTypeweapon(" огно стрелной ");
        boss1.weaponBoss.setNameweapon(" ak47 ");
        System.out.println(boss1.Info1());
        System.out.println(boss1.Info());

    }


}
