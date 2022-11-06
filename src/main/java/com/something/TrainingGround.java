package com.something;

public class TrainingGround {
    public static void main(String[] args) {
        Enemy enemy = new Enemy(100);
        Warrior warrior = new Warrior("W");
        Archer archer = new Archer("A");
        Mage mage = new Mage("M");
        warrior.attackEnemy();
        archer.attackEnemy();
        mage.attackEnemy();
        System.out.println(enemy.isAlive());
    }
}
