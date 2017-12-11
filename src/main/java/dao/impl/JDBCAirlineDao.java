package dao.impl;
import model.entity.aircraft.Aircraft;
import model.entity.aircraft.CargoAircraft;
import model.entity.aircraft.PassengersAircraft;
import dao.AirlineDao;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class JDBCAirlineDao implements AirlineDao {

    public Connection getConnection() {
        return connection;
    }

    private Connection connection;

   public JDBCAirlineDao(Connection connection) {
        this.connection = connection;
    }



    private Aircraft extractFromResultSet(ResultSet rs)
            throws SQLException {
        Aircraft result = new Aircraft();
        result.setId(rs.getInt("id"));
        result.setName(rs.getString("name"));
        result.setCargo(rs.getInt("cargo"));
        result.setFlyRange(rs.getInt("flyRange"));
        result.setFuelConsumption(rs.getInt("fuelConsumption"));
        result.setPassengers(rs.getInt("passengers"));
        return result;
    }

    @Override
    public void createCargoAicraft(CargoAircraft aircraft) {
        try (PreparedStatement ps = connection.prepareStatement
                ("INSERT INTO CargoAircraft ( name , passengers , cargo , flyRange , fuelConsumption )" +
                        " VALUES (? , ? , ? , ? , ? )")) {
            ps.setString(1, aircraft.getName());
            ps.setInt(2, aircraft.getPassengers());
            ps.setInt(3, aircraft.getCargo());
            ps.setInt(4, aircraft.getFlyRange());
            ps.setInt(5, aircraft.getFuelConsumption());

            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void createPassengerAicraft(PassengersAircraft aircraft) {
        try (PreparedStatement ps = connection.prepareStatement
                ("INSERT INTO Airline.PassengerAircraft ( name , passengers , cargo , flyRange , fuelConsumption )" +
                        " VALUES ( ? , ? , ? , ? , ? )")) {
            ps.setString(1, aircraft.getName());
            ps.setInt(2, aircraft.getPassengers());
            ps.setInt(3, aircraft.getCargo());
            ps.setInt(4, aircraft.getFlyRange());
            ps.setInt(5, aircraft.getFuelConsumption());

            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public CargoAircraft findCargoAicraftById(int id) {
        try (PreparedStatement ps = connection.prepareStatement
                ("SELECT * FROM CargoAircraft WHERE id = ?")) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return (CargoAircraft)extractFromResultSet(rs);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    @Override
    public PassengersAircraft findPassengerAicraftById(int id) {
        return null;
    }

    @Override
    public List<Aircraft> findAll() {
        List<Aircraft> resultList = new ArrayList<>();
        try (Statement ps = connection.createStatement()) {
            ResultSet rs = ps.executeQuery("SELECT * FROM CargoAircraft");

            while (rs.next()) {
                Aircraft result = extractFromResultSet(rs);
                resultList.add(result);
            }
            ResultSet rss = ps.executeQuery("SELECT * FROM PassengerAircraft");
            while (rss.next()) {
                Aircraft result = extractFromResultSet(rss);
                resultList.add(result);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return resultList;
    }

    @Override
    public void updateCargoAircraft(CargoAircraft aircraft) {
        try (PreparedStatement ps = connection.prepareStatement(
                "UPDATE CargoAircraft SET name = ? , passengers = ? , cargo = ? , flyRange = ? , fuelConsumtion = ? " +
                        "WHERE id = ?")) {
            ps.setString(1, aircraft.getName());
            ps.setInt(2, aircraft.getPassengers());
            ps.setInt(3, aircraft.getCargo());
            ps.setInt(4, aircraft.getFlyRange());
            ps.setInt(5, aircraft.getFuelConsumption());
            ps.setInt(6, aircraft.getId());
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void updatePassengerAircraft(PassengersAircraft aircraft) {
        try (PreparedStatement ps = connection.prepareStatement(
                "UPDATE PassengerAircraft SET name = ? , passengers = ? , cargo = ? , flyRange = ? , fuelConsumtion = ? " +
                        "WHERE id = ?")) {
            ps.setString(1, aircraft.getName());
            ps.setInt(2, aircraft.getPassengers());
            ps.setInt(3, aircraft.getCargo());
            ps.setInt(4, aircraft.getFlyRange());
            ps.setInt(5, aircraft.getFuelConsumption());
            ps.setInt(6, aircraft.getId());
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void deleteCargoAircraft(int id) {
        try (PreparedStatement ps = connection.prepareStatement(
                "DELETE FROM CargoAircraft WHERE id = ?")) {
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void deletePassengerAircraft(int id) {
        try (PreparedStatement ps = connection.prepareStatement(
                "DELETE FROM PassengerAircraft WHERE id = ?")) {
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    public void close() {
        try {
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}