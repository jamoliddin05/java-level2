package com.dmdev.oop.lesson15.heroes;

import com.dmdev.oop.lesson15.enemies.Enemy;
import com.dmdev.oop.lesson15.interfaces.Mortal;

public abstract class Hero implements Mortal {

    private String name;
    private int damage;
    private int health;

    public Hero(String name, int damage, int health) {
        this.name = name;
        this.damage = damage;
        this.health = health;
    }

    public abstract void attackEnemy(Enemy enemy);

    public void takeDamage(int damage) {
        if (isAlive() && health < damage) {
            health = 0;
            System.out.println(getName() + " погиб.");
        } else {
            this.health -= Math.min(health, damage);
            System.out.println(name + " получил урон " + damage + ". Осталось " + health);
        }
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public int getHealth() {
        return health;
    }
}
