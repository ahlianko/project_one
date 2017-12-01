package Project_one;

import Project_one.model.entity.Aircraft.Aircraft;
import Project_one.model.entity.Aircraft.CargoAircraft;
import Project_one.model.entity.Aircraft.PassengersAircraft;
import Project_one.model.entity.Airline.Airline;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Aircraft aerbous = new PassengersAircraft("Aerobus",240,1230,6000,530);
        Airline UIA = new Airline(aerbous, "UIA");
        UIA.countTotalCargo();
        UIA.countTotalPassengers();
        System.out.println("Cargo " + UIA.getTotalCargo() + " pass " +UIA.getTotalPassengers());
        UIA.addAircraft(new CargoAircraft("AN",1000, 400, 5000));
        UIA.countTotalPassengers();
        UIA.countTotalCargo();
        System.out.println("Cargo " + UIA.getTotalCargo() + " pass " +UIA.getTotalPassengers());


    }
}
