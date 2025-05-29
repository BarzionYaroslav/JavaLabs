package com.example.Labwork;

import org.springframework.stereotype.Component;

@Component
public class Sword implements Weapon{
    @Override
    public void doDamage(){
        System.out.println("Slash! Damaged!");
    }
    @Override
    public void check(){
        System.out.println("Sword is fine!");
    }
}
