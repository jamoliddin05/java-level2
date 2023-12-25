package com.dmdev.oop.lesson15;

import com.dmdev.oop.lesson15.enemies.Creeper;
import com.dmdev.oop.lesson15.enemies.Enemy;
import com.dmdev.oop.lesson15.enemies.Slenderman;
import com.dmdev.oop.lesson15.enemies.Zombie;
import com.dmdev.oop.lesson15.heroes.Archer;
import com.dmdev.oop.lesson15.heroes.Hero;
import com.dmdev.oop.lesson15.heroes.Mage;
import com.dmdev.oop.lesson15.heroes.Warrior;

public class TrainingGround {
    public static void main(String[] args) {
        Hero warrior = new Warrior("Боромир", 10, 150);
        Hero archer = new Archer("Гэндольф", 15, 100);
        Hero mage = new Mage("Леголас", 20, 70);

        Enemy zombie = new Zombie("Зомби", 10, 100);
        Enemy creeper = new Creeper("Крипер", 30, 50);
        Enemy slenderman = new Slenderman("Слендермен", 15, 100);

        attackEnemy(zombie, warrior, archer, mage);
        attackHero(warrior, zombie, creeper, slenderman);
    }

    public static void attackEnemy(Enemy enemy, Hero... heroes) {
        while (enemy.isAlive()) {
            for (Hero hero : heroes) {
                if (enemy.isAlive()) {
                    hero.attackEnemy(enemy);
                }
            }
        }
    }

    public static void attackHero(Hero hero, Enemy... enemies) {
        while (hero.isAlive()) {
            for (Enemy enemy : enemies) {
                if (hero.isAlive()) {
                    enemy.attackHero(hero);
                }
            }
        }
    }
}
