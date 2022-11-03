package com.something;

public class Hero {
    public String name;

    public Hero(String name) {
        this.name = name;
    }

    public Hero() {
        this.name = "Link";
    }

    public String getName() {
        return name;
    }

    public void attackEnemy(){
        System.out.println("Герой " + name + " атакував");
    }

}
