package com.something;

public class Mage extends Hero{
    private final int damage = 30;
    public Mage(String name) {
        super(name);
    }

    public void attackEnemy(){
        System.out.println("Маг " + name + " кастонув фаєрбол");
        Enemy.takeDamage(damage);
    }
}

