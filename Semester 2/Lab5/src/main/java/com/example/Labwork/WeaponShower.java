package com.example.Labwork;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class WeaponShower {
    private Weapon weapon;

    @Autowired
    public WeaponShower(@Qualifier("gun") Weapon weapon) {
        this.weapon = weapon;
    }

    public void show(){
        weapon.check();
        weapon.doDamage();
    }
}
