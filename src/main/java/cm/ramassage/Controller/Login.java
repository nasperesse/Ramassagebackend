package cm.ramassage.Controller;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/login")
public class Login extends HttpServlet{


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


       String email = req.getParameter("email");
       String pass = req.getParameter("pass");


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
