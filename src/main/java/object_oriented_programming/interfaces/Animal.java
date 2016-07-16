package object_oriented_programming.interfaces;

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

    public String getName() {
        return name;
    }

    public void speak(int ... v) {
        int vol = Speakable.QUIET;
        if(v.length == 1) vol = v[0];
        String voice;

        if(this instanceof Speakable)
            voice = ((Speakable)this).getVoice(vol);
        else
            voice = "... (quiet) ...";

        System.out.println(getType() + " " + getName() + " speaks " + voice);
    }

}
