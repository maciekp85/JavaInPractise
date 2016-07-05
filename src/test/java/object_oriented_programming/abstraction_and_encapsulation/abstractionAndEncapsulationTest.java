package object_oriented_programming.abstraction_and_encapsulation;

import object_oriented_programming.abstraction_and_encapsulation.hermet.VehState;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by nishi on 2016-07-04.
 */
public class abstractionAndEncapsulationTest {

    private Person person;
    private Vehicle vehicle;
    private VehState beginState;

    @Before
    public void setUp() {
        person = new Person("Jan", "88041514172");
        vehicle = new Vehicle(person, 3, 2, 5, 350);
    }

    @Test
    public void start_CarStartsIfStopped_ReturnsMovingState() {
        Assert.assertNotNull(vehicle);
        Assert.assertNotNull(vehicle.getState());
        beginState = vehicle.getState();
        if(beginState == VehState.STOPPED)
            vehicle.start();

        Assert.assertEquals(VehState.MOVING, vehicle.getState());
    }

    @After
    public void tearDown() {
        System.out.println("Cleaning after " + this.getClass().getSimpleName());
    }


}
