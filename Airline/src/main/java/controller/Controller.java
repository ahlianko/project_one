package controller;

import model.Model;
import model.entity.Aircraft.Aircraft;
import model.entity.Aircraft.CargoAircraft;
import model.entity.Aircraft.PassengersAircraft;
import model.entity.Airline.Airline;
import Dao.AirlineDao;
import Dao.impl.JDBCDaoFactory;
import view.View;

import java.util.ArrayList;

public class Controller {
    public Model model;
    public View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {

        System.out.println("Hello World!");
//        Aircraft aerbous = new PassengersAircraft("Aerobus",240,1230,6000,530);
//        Airline UIA = new Airline(aerbous, "UIA");
//        UIA.countTotalCargo();
//        UIA.countTotalPassengers();
//        System.out.println("Cargo " + UIA.getTotalCargo() + " pass " +UIA.getTotalPassengers());
//        UIA.addAircraft(new CargoAircraft("AN",1000, 400, 5000));
//        UIA.countTotalPassengers();
//        UIA.countTotalCargo();
//        System.out.println("Cargo " + UIA.getTotalCargo() + " pass " +UIA.getTotalPassengers());
        JDBCDaoFactory dao = new JDBCDaoFactory();
        AirlineDao airlineDao = dao.createAirlineDao();

        Airline test = new Airline(new ArrayList<Aircraft>(airlineDao.findAll()), "TEst");
        CargoAircraft testCargo = new CargoAircraft("testJet",12300, 1000,12511);
        airlineDao.createCargoAicraft(testCargo);
        for (Aircraft a : test.getAirline()
                ) {
            System.out.println(a.toString());
        }
        System.out.println(test.getTotalPassengers());
        System.out.println(test.getTotalCargo());
        view.printMessage(View.bundle.getString(View.COST_OF_PARK));
    }
}
