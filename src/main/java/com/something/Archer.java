package com.something;

public class Archer extends Hero{
    public Archer(String name) {
        super(name);
    }

    public void attackEnemy(){
        System.out.println("Лучник " + name + " вистрілив");
    }
}

