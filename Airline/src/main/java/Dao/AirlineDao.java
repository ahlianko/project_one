package Dao;


import model.entity.Aircraft.Aircraft;
import model.entity.Aircraft.CargoAircraft;
import model.entity.Aircraft.PassengersAircraft;
import model.entity.Airline.Airline;

import java.util.List;

public interface AirlineDao extends AutoCloseable {
    void createCargoAicraft(CargoAircraft aircraft);
    void createPassengerAicraft(PassengersAircraft aircraft);
    CargoAircraft findCargoAicraftById(int id);
    PassengersAircraft findPassengerAicraftById(int id);
    List<Aircraft> findAll();
    void updateCargoAircraft(CargoAircraft entity);
    void updatePassengerAircraft(PassengersAircraft entity);
    void deleteCargoAircraft(int id);
    void deletePassengerAircraft(int id);
}
