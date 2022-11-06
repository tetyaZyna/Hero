package com.something;

abstract class Hero {
    public String name;

    public Hero(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }//Зачем сеттер

    public abstract void attackEnemy();

}
