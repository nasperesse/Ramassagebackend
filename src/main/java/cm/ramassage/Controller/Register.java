package cm.ramassage.Controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 * Created by Angel on 26.08.17.
 */

@WebServlet("/register")
public class Register extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter out = resp.getWriter();

        String name = req.getParameter("nachname");
        String vorname = req.getParameter("vorname");
        String wohnort = req.getParameter("ort");
        String telenr = req.getParameter("telefon");
        String geburtsdatum = req.getParameter("geburtsdatum");
        String geburtsort = req.getParameter("geburtsort");
        String nationalite = req.getParameter("ql_land");
        String email = req.getParameter("email");
        String pass = req.getParameter("pass");

        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/db_reise","nasperesse","mysql");

            PreparedStatement ps=con.prepareStatement(
                    "insert into User values(?,?,?,?,?,?,?,?,?,?)");

            ps.setString(2,wohnort);
            ps.setString(3,email);
            ps.setString(4,geburtsdatum);
            ps.setString(5,geburtsort);
            ps.setString(6,pass);
            ps.setString(7,name);
            ps.setString(8,nationalite);
            ps.setString(9,vorname);


            int i=ps.executeUpdate();
            if(i>0)
                out.print("You are successfully registered...");


        }catch (Exception e2) {System.out.println(e2);}

        out.close();
    }


}
