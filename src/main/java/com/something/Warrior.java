package com.something;

public class Warrior extends Hero{
    private final int damage = 50;
    public Warrior(String name) {
        super(name);
    }

    public void attackEnemy(){
        System.out.println("Мечник " + name + " атакував");
        Enemy.takeDamage(damage);
    }
}
