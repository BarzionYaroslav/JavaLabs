package com.example.Labwork;

import org.springframework.stereotype.Component;

@Component
public class Wand implements Weapon {
    @Override
    public void doDamage(){
        System.out.println("Swoosh! Damaged!");
    }
    @Override
    public void check(){
        System.out.println("Wand is fine!");
    }
}
