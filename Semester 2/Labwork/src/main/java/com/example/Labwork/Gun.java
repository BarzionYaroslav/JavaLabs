package com.example.Labwork;

public class Gun implements Weapon{
    private int bullets;

    public Gun(int bullet){
        this.bullets=bullet;
    }

    @Override
    public void doDamage() {
        if (bullets>0) {
            System.out.println("Pow! Damaged!");
            bullets--;
        }
        else
            System.out.println("Oh shoot! I mean, no shoot, cuz yer outta ammo!");
    }
    @Override
    public void check() {
        if (bullets>0)
            System.out.println("Gun is alright! You got " + bullets + " shots left");
        else
            System.out.println("Gun isn't alright. No bullets");
    }
    public int getBullets(){
        return bullets;
    }

    public void setBullets(int bullet){
        bullets=bullet;
    }
}
