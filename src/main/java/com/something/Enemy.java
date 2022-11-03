package com.something;

public class Enemy {
    private static int health;

    public Enemy(int health) {
        this.health = health;
    }

    public static int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public static int takeDamage(int damage){
        health = health - damage;
        return health;
    }
}
