package controller;

import model.Model;
import model.entity.aircraft.Aircraft;
import model.entity.aircraft.CargoAircraft;
import model.entity.airline.Airline;
import dao.AirlineDao;
import dao.impl.JDBCDaoFactory;
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
