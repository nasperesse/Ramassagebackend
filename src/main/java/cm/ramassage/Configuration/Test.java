package cm.ramassage.Configuration;

import cm.ramassage.Controller.Registrierung;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {


    public static void main(String[] args) {


        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        ctx.scan("cm.ramassage");

        Registrierung registrierung =(Registrierung ) ctx.getBean("control");


        registrierung.neuUser("Modjo","ange","Yaounde","285828282","12.06.1992","Yokadouma","Kamerun","ange@yahoo.fr","moi");

        registrierung.neuUser("Modjo","ange","Yaounde","285828282","12.06.1992","Yokadouma","Kamerun","ange@yahoo.fr","moi");

        registrierung.neuUser("Modjo","ange","Yaounde","285828282","12.06.1992","Yokadouma","Kamerun","ange@yahoo.fr","moi");

        registrierung.neuUser("Modjo","ange","Yaounde","285828282","12.06.1992","Yokadouma","Kamerun","ange@yahoo.fr","moi");
    }
}
