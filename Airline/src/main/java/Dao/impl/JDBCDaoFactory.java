package Dao.impl;

import Dao.AirlineDao;
import Dao.DaoFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class JDBCDaoFactory extends DaoFactory {
    @Override
    public AirlineDao createAirlineDao() {
        return new JDBCAirlineDao(getConnection());
    }

    private Connection getConnection(){
        try {
            return DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/Airline",
                    "root" ,
                    "root" );
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
