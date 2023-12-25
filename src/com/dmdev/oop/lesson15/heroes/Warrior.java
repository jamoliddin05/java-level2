package com.dmdev.oop.lesson15.heroes;

import com.dmdev.oop.lesson15.enemies.Enemy;

public class Warrior extends Hero {
    public Warrior(String name, int damage, int health) {
        super(name, damage, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " взмахнул мечом на " + enemy.getName());
        enemy.takeDamage(getDamage());
    }
}
