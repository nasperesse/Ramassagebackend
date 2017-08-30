package cm.ramassage.model;


import javax.persistence.*;

@Entity
@Table(name="Reise")
public class Fahrt {


    private String abfahrtsort;

    private String abfahrtsdatum;

    private String abfahrtszeit;

    private String ankunfsort;

    private String getAnkunfszeit;

    private String ankunfsdatum;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int fahrtid;

    public String getAbfahrtsort() {
        return abfahrtsort;
    }

    public void setAbfahrtsort(String abfahrtsort) {
        this.abfahrtsort = abfahrtsort;
    }

    public String getAbfahrtsdatum() {
        return abfahrtsdatum;
    }

    public void setAbfahrtsdatum(String abfahrtsdatum) {
        this.abfahrtsdatum = abfahrtsdatum;
    }

    public String getAbfahrtszeit() {
        return abfahrtszeit;
    }

    public void setAbfahrtszeit(String abfahrtszeit) {
        this.abfahrtszeit = abfahrtszeit;
    }

    public String getAnkunfsort() {
        return ankunfsort;
    }

    public void setAnkunfsort(String ankunfsort) {
        this.ankunfsort = ankunfsort;
    }

    public String getGetAnkunfszeit() {
        return getAnkunfszeit;
    }

    public void setGetAnkunfszeit(String getAnkunfszeit) {
        this.getAnkunfszeit = getAnkunfszeit;
    }

    public String getAnkunfsdatum() {
        return ankunfsdatum;
    }

    public void setAnkunfsdatum(String ankunfsdatum) {
        this.ankunfsdatum = ankunfsdatum;
    }

    public int getFahrtid() {
        return fahrtid;
    }

    public void setFahrtid(int fahrtid) {
        this.fahrtid = fahrtid;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @JoinColumn(name = "user_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private User user;
}
