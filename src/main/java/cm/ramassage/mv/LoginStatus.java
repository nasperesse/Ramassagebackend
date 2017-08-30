package cm.ramassage.mv;

import org.springframework.stereotype.Component;

@Component
public enum LoginStatus {

    AUTO_BLOCK, //user die wegen mehreren falschen Versucht automatisch gesperrt wurde
    NOT_ACTIVATE,  //das konto wurde noch nicht aktiviert
    SUCCESS,       //erfolgreicher Login
    LOCKED,        //das Konto wurde deaktiviert
    WRONG_PASSWORD,   //falsches Passwort beim Login
    NOT_COMPLETE,     // wenn der Konto noch nicht fertig ist.
    AUTO_PWRESET,     //nachdem das passwort zurückgesetzt wurde
    AUTO_FINISH,       //nachdem die Erstellung des Kontos abgeschlossen ist.
    ;
}
