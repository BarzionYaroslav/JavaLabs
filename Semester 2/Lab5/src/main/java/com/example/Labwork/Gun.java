package com.example.Labwork;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Gun implements Weapon{
    @Value("${GunBean.bullets}")
    private int bullets;

    public Gun(){
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
    @PostConstruct
    public void onInit()
    {
        System.out.println("Gun initialize");
    }

    @PreDestroy
    public void onDestroy()
    {
        System.out.println("Gun destroy");
    }
}
