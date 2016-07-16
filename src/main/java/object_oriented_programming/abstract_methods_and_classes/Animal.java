package object_oriented_programming.abstract_methods_and_classes;

/**
 * Created by nishi on 2016-07-16.
 * Based on example from the "Java Programowanie praktyczne od podstaw" book by Krzysztof Barteczko
 */
abstract class Animal {

    private String name = "without name";

    Animal(){}
    Animal(String name) {
        this.name = name;
    }

    abstract String getType();

    abstract String getVoice();

    public String getName() {
        return name;
    }


    /**
     * Speak method simulate animal voice by typing proper message
     */
    public String speak() {
        return getType() + " " + getName() + " speaks " + getVoice();
    }
}
