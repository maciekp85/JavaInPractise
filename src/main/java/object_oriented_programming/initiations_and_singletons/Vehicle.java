package object_oriented_programming.initiations_and_singletons;

import object_oriented_programming.abstraction_and_encapsulation.hermet.VehState;

import java.util.Calendar;

import static object_oriented_programming.abstraction_and_encapsulation.hermet.VehState.MOVING;
import static object_oriented_programming.abstraction_and_encapsulation.hermet.VehState.STOPPED;

/**
 * Created by nishi on 2016-07-04.
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

    // Niestatyczny blok inicjacyjny
    // -- w niedziele wszystkie samochody początkowo stoją
    // -- w poniedziałek te o parzystych numerach początkowo jadą, inne stoją
    // -- w pozostałe dni tygodnia, wszystkie jadą
    {
        int dayOfWeek = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
        switch (dayOfWeek) {
            case Calendar.SUNDAY: state = STOPPED; break;
            case Calendar.MONDAY: state = (currNr % 2 == 0 ? MOVING : STOPPED); break;
            default: state = MOVING; break;
        }
    } // koniec bloku

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
            this.error("Nie można reperować sprawnego pojazdu");
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
            this.error("Żaden z pojazdów nie jest w ruchu - nie ma zdarzenia");
        }

        this.state = VehState.BROKEN;
        v.state = VehState.BROKEN;
    }

    public String toString() {
        String s = this.owner == null?"sklep":this.owner.getName();
        return "Pojazd, właścicielem którego jest " + s + " jest w stanie " + this.state;
    }

    private void setState(VehState newState) {
        if(this.state == VehState.BROKEN) {
            this.error("Nie jest możliwe przejście ze stanu " + this.state + " do stanu " + newState);
        } else {
            this.state = newState;
        }

    }

    protected void error(String msg) {
        throw new IllegalArgumentException(msg);
    }
}
