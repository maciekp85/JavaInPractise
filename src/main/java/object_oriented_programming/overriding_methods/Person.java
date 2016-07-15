package object_oriented_programming.overriding_methods;

/**
 * Created by nishi on 2016-07-04.
 */
public class Person {
    private String name;
    private String pesel;

    Person(String aname, String id) {
        this.name = aname;
        this.pesel = id;
    }

    public String getName() {
        return this.name;
    }

    public String getPesel() {
        return this.pesel;
    }
}
