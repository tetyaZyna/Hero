package com.something;

public class Hero {
    public String name;
    private int damage = 5;

    public Hero(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void attackEnemy(){
        System.out.println("Герой " + name + " атакував");
        Enemy.takeDamage(damage);
        System.out.println(Enemy.getHealth());
    }

}
