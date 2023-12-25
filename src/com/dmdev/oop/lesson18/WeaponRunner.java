package com.dmdev.oop.lesson18;

import com.dmdev.oop.lesson15.heroes.Hero;
import com.dmdev.oop.lesson15.heroes.Warrior;
import com.dmdev.oop.lesson18.weapon.Bow;
import com.dmdev.oop.lesson18.weapon.Sword;

public class WeaponRunner {
    public static void main(String[] args) {
        Hero<Sword> warrior = new Warrior<>("Boromir", 10, 10);
    }
}
