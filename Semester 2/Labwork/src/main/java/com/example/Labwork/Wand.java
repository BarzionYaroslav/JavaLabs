package com.example.Labwork;

public class Wand extends Weapon {
    private float deathelm;
    private float heal;
    private float lifeelm;

    public Wand(){
        special = "Healing Spell";
    };

    public Wand(String name, float basedmg, float deathelm, float baseheal, float lifeelm) {
        this.name = name;
        this.dmg = basedmg;
        this.deathelm = deathelm;
        this.heal = baseheal;
        this.lifeelm = lifeelm;
        special = "Healing Spell";
    }

    public float getHeal() {
        return heal;
    }

    public float getDeathelm() {
        return deathelm;
    }

    public float getLifeelm() {
        return lifeelm;
    }

    public void setHeal(float baseheal) {
        this.heal = baseheal;
    }

    public void setDeathelm(float deathelm) {
        this.deathelm = deathelm;
    }

    public void setLifeelm(float lifeelm) {
        this.lifeelm = lifeelm;
    }

    @Override
    public float totalDamage(){
        if (lifeelm==0)
            return (dmg*deathelm);
        else
            return (dmg*deathelm)/lifeelm;
    }

    @Override
    public float doSpecial(){
        if (deathelm==0)
            return (heal*lifeelm);
        else
            return (heal*lifeelm)/deathelm;
    }
}
