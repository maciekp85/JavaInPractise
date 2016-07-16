package object_oriented_programming.abstraction_and_encapsulation.hermet;

/**
 * Created by nishi on 2016-07-04.
 * Based on example from the "Java Programowanie praktyczne od podstaw" book by Krzysztof Barteczko
 */
public enum VehState {
    BROKEN("ZEPSUTY"),
    STOPPED("STOI"),
    MOVING("JEDZIE");

    private String description;

    VehState(String s) {
        description = s;
    }

    @Override
    public String toString() {
        return description;
    }
}
