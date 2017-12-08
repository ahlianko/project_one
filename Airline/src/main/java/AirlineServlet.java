import Dao.AirlineDao;

import Dao.impl.JDBCDaoFactory;
import controller.Controller;
import model.Model;
import model.entity.Aircraft.PassengersAircraft;
import view.View;


import javax.annotation.Resource;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/AirlineServlet")
public class AirlineServlet extends HttpServlet {

    DataSource ds;
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
         JDBCDaoFactory jdbcDaoFactory = new JDBCDaoFactory();
        AirlineDao air =jdbcDaoFactory.createAirlineDao();
        air.findAll();
        response.getWriter().print("Hello");
        response.setContentType("text/html;charset=utf-8");
        //response.sendRedirect("index.jsp");
        PrintWriter out = response.getWriter();
        String name = request.getParameter("aircraft_name");
        int pass = Integer.valueOf(request.getParameter("aircraft_passengers"));
        int cargo = Integer.valueOf(request.getParameter("aircraft_cargo"));
        int flyRange = Integer.valueOf(request.getParameter("aircraft_flyRange"));
        int fuel = Integer.valueOf(request.getParameter("aircraft_fuel"));
        PassengersAircraft test = new PassengersAircraft(name,pass,cargo,flyRange,fuel);

        out.println(test.toString());
        out.close();
    }
}
