package cm.ramassage.Controller;

import cm.ramassage.model.User;
import org.springframework.stereotype.Component;



import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;


@Component("control")
@Transactional
public class Registrierung {

    @PersistenceContext
    EntityManager em;

    boolean geprüft=false;


    public void neuUser(String name, String vorname, String aufenhaltsort, String telefonnr, String geburtsdatum, String geburtsort, String nationalite, String email, String pass) {

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


    public void istAuthentified(String email, String pass) {


        Query query = em.createQuery("select id from User where email=? and mdpasse = ?");

        query.setParameter(1,email);
        query.setParameter(2,pass);

        List<Integer> result = new ArrayList<Integer>();

        result = query.getResultList();


        if (result.isEmpty()) {

            System.out.println("etweder Ihrer pass oder ihrer email ist falsh");
        } else if (result.size() != 1) {

            System.out.println("entschuldigen uns bitte wir haben ein problem getroffen");

            result.forEach(x-> System.out.println(x));
        } else{


             int id = result.get(0);

            User eingelogt = em.find(User.class,id);

            geprüft = true;
          em.persist(eingelogt.fahrtanbieten("Yaounde", "12:20","12.06.2017","Douala", "12.12.2017","15:50"));
          em.close();

          System.out.println("Ihre Pass und email ist correct");

            System.out.println("willkommen herr oder mdme "+eingelogt.getName());
        }

    }

    public void auloggen(){

        geprüft = false;
        System.out.println("Sie wurden richtig ausgeloogt");
    }


    public void fahrtanbieten(){

        if (geprüft){



        }
        else System.out.println("Sie müssen zuerst ein  Konto besitzen");


    }

}
