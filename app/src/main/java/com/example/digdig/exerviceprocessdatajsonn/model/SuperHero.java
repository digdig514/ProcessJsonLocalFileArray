package com.example.digdig.exerviceprocessdatajsonn.model;

import java.util.ArrayList;

/**
 * Created by digdig on 17-06-20.
 */

public class SuperHero {
private String name;
private int age;
private String identity;
private ArrayList<String> powers;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public ArrayList<String> getPowers() {
        return powers;
    }

    public void setPowers(ArrayList<String> powers) {
        this.powers = powers;
    }

    public SuperHero(String name, int age, String identity, ArrayList<String> powers) {
        this.name = name;
        this.age = age;
        this.identity = identity;
        this.powers = powers;
    }

    @Override
    public String toString() {
        return "SuperHero{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", identity='" + identity + '\'' +
                ", powers=" + powers +
                '}';
    }
}
