package object_oriented_programming.interfaces;

/**
 * Created by nishi on 2016-07-04.
 * Based on example from the "Java Programowanie praktyczne od podstaw" book by Krzysztof Barteczko
 */
public class Person {
    private String name;
    private String pesel;

    Person(String name, String id) {
        this.name = name;
        this.pesel = id;
    }

    public String getName() {
        return this.name;
    }

    public String getPesel() {
        return this.pesel;
    }
}
