package com.dmdev.oop.lesson15.enemies;

import com.dmdev.oop.lesson15.heroes.Hero;
import com.dmdev.oop.lesson15.interfaces.Mortal;

public abstract class Enemy implements Mortal {

    private String name;
    private int health;
    private int damage;

    public Enemy(String name, int damage, int health) {
        this.name = name;
        this.damage = damage;
        this.health = health;
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }

    public void attackHero(Hero hero) {
        System.out.println(getName() + " атакует " + hero.getName() +
                           ". У героя осталось " + hero.getHealth() + " здоровья!");
        hero.takeDamage(getDamage());
    };

    public void takeDamage(int damage) {
        if (isAlive() && health < damage) {
            health = 0;
            System.out.println(getName() + " погиб.");
        } else {
            this.health -= Math.min(health, damage);
            System.out.println(name + " получил урон " + damage + ". Осталось " + health);
        }
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }
}
