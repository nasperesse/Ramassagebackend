package cm.ramassage.mv;


import cm.ramassage.model.User;

import javax.persistence.*;
import java.util.Calendar;

@Entity
public class LoginVersuch {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;


    private Calendar date;


    @Enumerated(EnumType.STRING)
    private LoginStatus status;

    @Column(insertable = false, updatable = false)
    private int user_id;


    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;


    public LoginVersuch(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    public LoginStatus getStatus() {
        return status;
    }

    public void setStatus(LoginStatus status) {
        this.status = status;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
        this.user_id = user.getId();
    }

    public  LoginVersuch(User user, LoginStatus status){

        this.user = user;
        this.status = status;
        this.date = Calendar.getInstance();

    }
}
