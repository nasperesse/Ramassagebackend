package cm.ramassage.Controller;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Class.forName;

@WebServlet("/login")
public class Login extends HttpServlet{


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String email = req.getParameter("email");
        String pass = req.getParameter("pass");

        try {
            forName("com.mysql.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/db_reise?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","nasperesse","mysql");

            List<Integer> result = new ArrayList<Integer>();



        } catch (Exception e) {
            e.printStackTrace();
        }


        String abfrage = "select id from User where ";


        if (email.equals("ange@yahoo.fr") && pass.equals("ange")){

            HttpSession session = req.getSession();

            session.setAttribute("email",email);

            resp.sendRedirect("home.jsp");

        }
        else {

            resp.sendRedirect("no.jsp");

        }


    }
}
