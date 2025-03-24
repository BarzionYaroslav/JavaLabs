package com.example.Labwork;

public class WeaponShower {
    private Weapon weapon;

    public WeaponShower(Weapon weapon) {
        this.weapon = weapon;
    }

    public void show(){
        weapon.check();
        weapon.doDamage();
    }
}
