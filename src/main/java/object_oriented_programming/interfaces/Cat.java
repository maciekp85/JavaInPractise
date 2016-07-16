package object_oriented_programming.interfaces;

/**
 * Created by nishi on 2016-07-16.
 * Based on example from the "Java Programowanie praktyczne od podstaw" book by Krzysztof Barteczko
 */
public class Cat extends Animal implements Moveable, Speakable {

    Cat(){}
    Cat(String s) {
        super(s);
    }

    public String getType() {
        return "Cat";
    }

    public String getVoice(int voice) {
        if(voice == LOUD)
            return "MIAUUUUU...";
        else
            return "miauuuuu...";
    }

    public Cat start() {
        System.out.println(getType() + " " + getName() + " sneaking");
        return this;
    }

    public Cat stop() {
        System.out.println(getType() + " " + getName() + " stopped");
        return this;
    }
}
