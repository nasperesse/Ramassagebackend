package cm.ramassage.mv;


import cm.ramassage.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/registrierung")


public class NeuUser extends HttpServlet {



@PersistenceContext
    EntityManager em;


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        User user = new User();

        String name = req.getParameter("nachname");
        String vorname = req.getParameter("vorname");
        String aufenhaltsort = req.getParameter("ort");
        String telefonnr = req.getParameter("telefon");
        String geburtsdatum = req.getParameter("geburtsdatum");
        String geburtsort = req.getParameter("geburtsort");
        String nationalite = req.getParameter("ql_land");
        String email = req.getParameter("email");
        String pass = req.getParameter("pass");

        user.setEmail(email);
        user.setName(name);
        user.setVorname(vorname);
        user.setMdpasse(pass);
        user.setGeburtsdatum(geburtsdatum);
        user.setGeburtsort(geburtsort);
        user.setTelefonnr(telefonnr);
        user.setNationaliaet(nationalite);
        user.setAufenthaltsort(aufenhaltsort);

        em.persist(user);

        em.close();





    }
}
