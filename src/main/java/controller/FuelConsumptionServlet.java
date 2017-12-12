package controller;

import dao.AirlineDao;
import dao.impl.JDBCDaoFactory;
import model.entity.aircraft.Aircraft;
import model.entity.airline.Airline;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class FuelConsumptionServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        JDBCDaoFactory dao = new JDBCDaoFactory();
        AirlineDao air = dao.createAirlineDao();

        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        int min = Integer.valueOf(request.getParameter("fuel_min"));
        int max = Integer.valueOf(request.getParameter("fuel_max"));
        ArrayList<Aircraft> result = air.showSortedFuelConsumption(min, max);
        for (int i = 0; i < result.size(); i++) {
            out.print("" + i + ")" + result.get(i).toString() + " ; \n");
        }
        try {
            air.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        out.print("<br><a href="+"index.jsp"+">Go back</a>");
        out.close();
    }
}