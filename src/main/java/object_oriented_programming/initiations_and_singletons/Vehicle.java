package object_oriented_programming.initiations_and_singletons;

import object_oriented_programming.abstraction_and_encapsulation.hermet.VehState;

import java.util.Calendar;

import static object_oriented_programming.abstraction_and_encapsulation.hermet.VehState.MOVING;
import static object_oriented_programming.abstraction_and_encapsulation.hermet.VehState.STOPPED;

/**
 * Created by nishi on 2016-07-04.
 * Based on example from the "Java Programowanie praktyczne od podstaw" book by Krzysztof Barteczko
 */
public class Vehicle {
    private int width;
    private int height;
    private int length;
    private int weight;
    private static int initNr;
    private int currNr = ++initNr;
    private Person owner;
    private VehState state;

    // Non-static initial block
    // on sunday all vehicles stop first
    // on monday vehicles with even numbers drive, other stops
    // on other days of week, all vehicles drive
    {
        int dayOfWeek = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
        switch (dayOfWeek) {
            case Calendar.SUNDAY: state = STOPPED; break;
            case Calendar.MONDAY: state = (currNr % 2 == 0 ? MOVING : STOPPED); break;
            default: state = MOVING; break;
        }
    } // end of block

    Vehicle(int w, int h, int l, int ww) {
        this(null, w, h, l, ww);
    }

    Vehicle(Person p, int w, int h, int l, int ww) {
        this.owner = p;
        this.width = w;
        this.height = h;
        this.length = l;
        this.weight = ww;
    }

    public void start() {
        this.setState(VehState.MOVING);
    }

    public void stop() {
        this.setState(STOPPED);
    }

    public void repair() {
        if(this.state != VehState.BROKEN) {
            this.error("You can not repair capable vehicle");
        } else {
            this.state = STOPPED;
        }

    }

    public VehState getState() {
        return this.state;
    }

    public int getCurrNr() {
        return currNr;
    }

    public void sellTo(Person p) {
        this.owner = p;
    }

    public void crash(Vehicle v) {
        if(this.state != VehState.MOVING && v.state != VehState.MOVING) {
            this.error("No vehicles drives - no events");
        }

        this.state = VehState.BROKEN;
        v.state = VehState.BROKEN;
    }

    public String toString() {
        String s = this.owner == null?"shop":this.owner.getName();
        return "Vehicle whose owner is " + s + " is able to " + this.state;
    }

    private void setState(VehState newState) {
        if(this.state == VehState.BROKEN) {
            this.error("Yo can not move from state " + this.state + " to state " + newState);
        } else {
            this.state = newState;
        }

    }

    protected void error(String msg) {
        throw new IllegalArgumentException(msg);
    }
}
