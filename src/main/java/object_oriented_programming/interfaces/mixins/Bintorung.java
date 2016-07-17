package object_oriented_programming.interfaces.mixins;

/**
 * Created by nishi on 2016-07-17.
 * Based on example from the "Java Programowanie praktyczne od podstaw" book by Krzysztof Barteczko
 */
public class Bintorung implements Bear, Cat {

    private String name;

    public Bintorung(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "My name is " + name + " and I am Bintorung, or " + bear() + cat();
    }
}
