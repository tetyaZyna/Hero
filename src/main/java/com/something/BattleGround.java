package com.something;

import java.util.Scanner;

public class BattleGround {
    public static void main(String[] args) {
        System.out.println("Ви запустили гру");
        System.out.println("Оберіть клас:");
        System.out.println("[1] - Воїн  [2] - Маг   [3] - Лучник");
        System.out.println("[0] - Завершити гру");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть число: ");
        int heroNumber = scanner.nextInt();
        if (heroNumber == 0){
            System.out.println("\nГру завершено");
        } else if (heroNumber == 1) {
            System.out.println("\nВи обрали воїна");
            System.out.print("Введіть ім'я: ");
            String name = scanner.next();
            Hero hero = new Warrior(name);
            System.out.print("Воїн " + name + " зайшов до данжу");
            enterDungeon(hero);
        }else if (heroNumber == 2) {
            System.out.println("\nВи обрали мага");
            System.out.print("Введіть ім'я: ");
            String name = scanner.next();
            Hero hero = new Mage(name);
            System.out.print("Маг " + name + " зайшов до данжу");
            enterDungeon(hero);
        }else if (heroNumber == 3) {
            System.out.println("\nВи обрали лучника");
            System.out.print("Введіть ім'я: ");
            String name = scanner.next();
            Hero hero = new Archer(name);
            System.out.print("Лучник " + name + "зайшов до данжу");
            enterDungeon(hero);
        }else {
            System.out.println("\nПомилка");
        }
    }

    private static void enterDungeon(Hero hero) {
        Enemy enemy = new Enemy(200);
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n\nПеред собою вы побачили монстра. Що будете робити?:");
        System.out.println("[1] - Втекти  [2] - Битись");
        System.out.print("Виберіть дію: ");
        int i = 0;
        do {
            int choiceAction = scanner.nextInt();
            if (choiceAction == 1) {
                System.out.println("\nВи вирішили рятуватись втечею");
                System.out.println("Ви успішно втекли");
                i = 1;
            } else if (choiceAction == 2) {
                System.out.println("\nВи вирішили битись");
                do {
                    hero.attackEnemy();
                    System.out.println(Enemy.getHealth());
                }while (enemy.isAlive());
                i = 1;
            }else {
                System.out.print("Помилка, спробуйте ще раз: ");
            }
        } while (i != 1);

    }
}
