package object_oriented_programming.interfaces.mixins;

/**
 * Created by nishi on 2016-07-17.
 * Based on example from the "Java Programowanie praktyczne od podstaw" book by Krzysztof Barteczko
 */
public interface Cat {

    default String cat() {
        return "Cat";
    }
}
