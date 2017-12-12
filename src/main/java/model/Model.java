package model;

import model.entity.airline.Airline;

public class Model {
    private Airline airline;

    public Model(Airline airline) {
        this.airline = airline;
    }

    public Model() {
    }

    public Airline getAirline() {
        return airline;
    }

    public void setAirline(Airline airline) {
        this.airline = airline;
    }
}
