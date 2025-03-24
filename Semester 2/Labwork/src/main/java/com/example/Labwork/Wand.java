package com.example.Labwork;

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
