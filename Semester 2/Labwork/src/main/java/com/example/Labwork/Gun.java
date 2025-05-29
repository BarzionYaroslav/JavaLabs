package com.example.Labwork;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

public class Gun extends Weapon{
    private int bullets;
    private float range;
    private float aim;

    public Gun(){
        special = "Perfect Shot";
    };

    public Gun(String name, int bullets, float dmg, float range, float aim) {
        this.name = name;
        this.bullets = bullets;
        this.dmg = dmg;
        this.range = range;
        this.aim = aim;
        special = "Perfect Shot";
    }

    public int getBullets(){
        return bullets;
    }

    public float getAim() {
        return aim;
    }


    public float getRange() {
        return range;
    }

    public void setAim(float aim) {
        this.aim = aim;
    }

    public void setRange(float range) {
        this.range = range;
    }

    @Override
    public float getDmg(){
        if (range==0)
            return (dmg * (float)bullets * aim);
        else
            return (dmg * (float)bullets * aim)/range;
    }

    @Override
    public float doSpecial(){
        return (dmg * (float)bullets*aim);
    }

    public void setBullets(int bullet){
        bullets=bullet;
    }
}
