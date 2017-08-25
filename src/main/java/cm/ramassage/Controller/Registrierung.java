package cm.ramassage.Controller;

import cm.ramassage.model.User;
import org.springframework.stereotype.Component;



import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;


@Component("control")
@Transactional
public class Registrierung {

    @PersistenceContext
    EntityManager em;





    public void neuUser(String name,String vorname,String aufenhaltsort,String telefonnr,String geburtsdatum,String geburtsort,String nationalite,String email,String pass){

        User user = new User();

        user.setEmail(email);
        user.setName(name);
        user.setVorname(vorname);
        user.setMdpasse(pass);
        user.setGeburtsdatum(geburtsdatum);
        user.setGeburtsort(geburtsort);
        user.setTelefonnr(telefonnr);
        user.setNationaliaet(nationalite);
        user.setAufenthaltsort(aufenhaltsort);

        System.out.println(user.getEmail());
        System.out.println("-------------------------------------------");
        em.persist(user);

        em.close();

        System.out.println(user.getGeburtsdatum());

        System.out.println(user.getId());




    }


    public boolean istAuthentified(String email, String pass){



        if (true){

            return true;
        }
        else return false;
    }
}
