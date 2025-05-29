package com.example.Labwork;
import org.springframework.stereotype.Component;

import java.util.List;

public abstract class Weapon {
    protected String name;
    protected float dmg;
    protected String special;
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public float totalDamage(){return 0;}
    public float getDmg(){return dmg;}
    public void setDmg(float dmg){this.dmg = dmg;}
    public String getSpecial(){return special;}
    public void setSpecial(){this.special=special;}
    public float doSpecial(){return 0;}
}
