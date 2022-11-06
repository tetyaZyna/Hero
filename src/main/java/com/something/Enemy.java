package com.something;

public class Enemy implements Mortal{
    private static int health;

    public Enemy(int health) {
        Enemy.health = health;
    }//IDE предлагает использовать Enemy вместо this

    public static int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        Enemy.health = health;
    }//IDE предлагает использовать Enemy вместо this (зачем использовать сеттер)

    public static int takeDamage(int damage){
        health = health - damage;
        return health;
    }

    public boolean isAlive() {
        return health > 0;
    }
}
