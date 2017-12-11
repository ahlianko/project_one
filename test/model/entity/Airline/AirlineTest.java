package model.entity.Airline;

import junit.framework.TestCase;
import model.entity.aircraft.PassengersAircraft;
import model.entity.airline.Airline;

public class AirlineTest extends TestCase {
    public void testAirlineConstructor(){
        Airline test = new Airline(new PassengersAircraft("test",5,15,5,15), "test");
        assertEquals(5, test.getTotalPassengers());
        assertEquals(15, test.getTotalCargo());
    }

}