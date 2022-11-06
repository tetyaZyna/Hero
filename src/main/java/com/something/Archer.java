package com.something;

public class Archer extends Hero{
    private final int damage = 10;
    public Archer(String name) {
        super(name);
    }

    public void attackEnemy(){
        System.out.println("Лучник " + name + " вистрілив");
        Enemy.takeDamage(damage);
        System.out.println("У ворога залишилось " + Enemy.getHealth() + "HP");
    }
}

