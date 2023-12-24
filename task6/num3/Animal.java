package ru.mirea.task6.num3;

import java.io.Serializable;

public class Animal implements Nameable, Serializable {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}