package com.dmdev.oop.lesson15.heroes;

import com.dmdev.oop.lesson15.enemies.Enemy;

public class Archer extends Hero {

    public Archer(String name, int damage, int health) {
        super(name, damage, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " стрельнул из лука в " + enemy.getName());
        enemy.takeDamage(getDamage());
    }
}
