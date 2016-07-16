package object_oriented_programming.virtual_methods_and_polymorphism;

/**
 * Created by nishi on 2016-07-16.
 * Based on example from the "Java Programowanie praktyczne od podstaw" book by Krzysztof Barteczko
 */
public class Animal {

    private String name = "without name";

    Animal(){}
    Animal(String name) {
        this.name = name;
    }

    public String getType() {
        return "some animal";
    }

    public String getName() {
        return name;
    }

    public String getVoice() {
        return "?";
    }

    /**
     * Speak method simulate animal voice by typing proper message
     */
    public String speak() {
        return getType() + " " + getName() + " speaks " + getVoice();
    }
}
