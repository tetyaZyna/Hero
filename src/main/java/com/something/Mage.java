package com.something;

public class Mage extends Hero{
    private int damage = 30;
    public Mage(String name) {
        super(name);
    }

    public void attackEnemy(){
        System.out.println("Маг " + name + " кастонув фаєрбол");
        Enemy.takeDamage(damage);
        System.out.println(Enemy.getHealth());
    }
}

