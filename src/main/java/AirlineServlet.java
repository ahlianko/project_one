import dao.AirlineDao;

import dao.impl.JDBCDaoFactory;

import model.entity.aircraft.PassengersAircraft;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;



public class AirlineServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        JDBCDaoFactory dao = new JDBCDaoFactory();
        AirlineDao air = dao.createAirlineDao();
        air.findAll();
        System.out.println(air);
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        String name = request.getParameter("aircraft_name");
        int pass = Integer.valueOf(request.getParameter("aircraft_passengers"));
        int cargo = Integer.valueOf(request.getParameter("aircraft_cargo"));
        int flyRange = Integer.valueOf(request.getParameter("aircraft_flyRange"));
        int fuel = Integer.valueOf(request.getParameter("aircraft_fuel"));
        PassengersAircraft test = new PassengersAircraft(name, pass, cargo, flyRange, fuel);
        air.createPassengerAicraft(test);
        out.println(test.toString());

        out.close();
    }

    public void doPost(HttpServletResponse response, HttpServletRequest request) {

    }
}
