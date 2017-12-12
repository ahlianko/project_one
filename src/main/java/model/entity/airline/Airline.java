package model.entity.airline;

import model.entity.aircraft.Aircraft;

import java.util.ArrayList;

public class Airline {
    private ArrayList<Aircraft> airline;
    private String name;
    private int totalPassengers;
    private int totalCargo;


    public Airline(Aircraft aircraft, String name) {
        this.airline = new ArrayList<Aircraft>();
        this.airline.add(aircraft);
        this.name = name;
        countTotalPassengers();
        countTotalCargo();
    }

    public Airline(ArrayList<Aircraft> airline, String name) {
        this.airline = airline;
        this.name = name;
        countTotalPassengers();
        countTotalCargo();
    }


    public void addAircraft(Aircraft aircraft){
        this.airline.add(aircraft);
    }

    public void countTotalPassengers(){
        this.totalPassengers = 0;
        for (Aircraft aircraft: airline
             ) {
            this.totalPassengers += aircraft.getPassengers();
        }
    }

    public void countTotalCargo(){
        this.totalCargo = 0;
        for (Aircraft aircraft: airline
                ) {
            this.totalCargo += aircraft.getCargo();
        }
    }

    public ArrayList<Aircraft> getAirline() {
        return airline;
    }

    public void setAirline(ArrayList<Aircraft> airline) {
        this.airline = airline;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalPassengers() {
        return totalPassengers;
    }

    public void setTotalPassengers(int totalPassengers) {
        this.totalPassengers = totalPassengers;
    }

    public int getTotalCargo() {
        return totalCargo;
    }

    public void setTotalCargo(int totalCargo) {
        this.totalCargo = totalCargo;
    }


    @Override
    public String toString() {
        return "Airline{" +
                "airline=" + airline +
                ", name='" + name + '\'' +
                ", totalPassengers=" + totalPassengers +
                ", totalCargo=" + totalCargo +
                '}'+"\n";
    }
}
