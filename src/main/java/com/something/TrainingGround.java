package com.something;

public class TrainingGround {
    public static void main(String[] args) {
        Hero hero = new Hero("H");
        Warrior warrior = new Warrior("W");
        Archer archer = new Archer("A");
        Mage mage = new Mage("M");
        hero.attackEnemy();
        warrior.attackEnemy();
        archer.attackEnemy();
        mage.attackEnemy();
    }
}
