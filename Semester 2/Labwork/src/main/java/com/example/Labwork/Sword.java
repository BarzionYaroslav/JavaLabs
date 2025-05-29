package com.example.Labwork;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

public class Sword extends Weapon{
    private float sharpness;

    public Sword(){
        special = "Critical Slash";
    };

    public Sword(String name, float dmg, float sharpness) {
        this.name = name;
        this.dmg = dmg;
        this.sharpness = sharpness;
        special = "Critical Slash";
    }

    public float getSharpness() {
        return sharpness;
    }

    public void setSharpness(float sharpness) {
        this.sharpness = sharpness;
    }

    @Override
    public float totalDamage(){
        return dmg*sharpness;
    }

    @Override
    public float doSpecial(){
        return dmg*sharpness*1.5f;
    }
}
