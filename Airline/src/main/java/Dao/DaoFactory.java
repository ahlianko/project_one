package Dao;


import Dao.impl.JDBCDaoFactory;

public abstract class DaoFactory {
    private static DaoFactory daoFactory;

    public abstract AirlineDao createAirlineDao();

    public static DaoFactory getInstance(){
        if (daoFactory == null){
            synchronized (DaoFactory.class){
                if (daoFactory == null){
                    daoFactory = new JDBCDaoFactory();
                }
            }
        }
        return daoFactory;
    }
}
