package com.something;

public class Warrior extends Hero{
    public Warrior(String name) {
        super(name);
    }

    public void attackEnemy(){
        System.out.println("Мечник " + name + " атакував");
    }
}
