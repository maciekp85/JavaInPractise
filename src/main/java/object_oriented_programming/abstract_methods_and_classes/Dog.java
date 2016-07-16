package object_oriented_programming.abstract_methods_and_classes;

/**
 * Created by nishi on 2016-07-16.
 * Based on example from the "Java Programowanie praktyczne od podstaw" book by Krzysztof Barteczko
 */
public class Dog extends Animal {

    Dog() {}
    Dog(String s) {
        super(s);
    }

    public String getType() {
        return "Dog";
    }

    public String getVoice() {
        return "HAU, HAU!";
    }
}
