package dao;


import dao.impl.JDBCDaoFactory;

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