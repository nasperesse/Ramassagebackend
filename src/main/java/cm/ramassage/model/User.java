package cm.ramassage.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Entity
 @Table
public class User {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    private String name;
    private String vorname;
    private String telefonnr;
    private String geburtsdatum;
    private String geburtsort;
    private String nationaliaet;
    private String aufenthaltsort;

    public void setTelefonnr(String telefonnr) {
        this.telefonnr = telefonnr;
    }

    public String getAufenthaltsort() {
        return aufenthaltsort;
    }

    public void setAufenthaltsort(String aufenthaltsort) {
        this.aufenthaltsort = aufenthaltsort;
    }


    private String email;

    private String mdpasse;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getGeburtsdatum() {
        return geburtsdatum;
    }

    public void setGeburtsdatum(String geburtsdatum) {
        this.geburtsdatum = geburtsdatum;
    }

    public String getGeburtsort() {
        return geburtsort;
    }

    public void setGeburtsort(String geburtsort) {
        this.geburtsort = geburtsort;
    }

    public String getNationaliaet() {
        return nationaliaet;
    }

    public void setNationaliaet(String nationaliaet) {
        this.nationaliaet = nationaliaet;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMdpasse() {
        return mdpasse;
    }

    public String getTelefonnr() {
        return telefonnr;
    }

    public Set<Fahrt> getFahrt() {
        return fahrt;
    }

    public void setFahrt(Set<Fahrt> fahrt) {
        this.fahrt = fahrt;
    }

    public void setMdpasse(String mdpasse) {
        this.mdpasse = mdpasse;
    }


    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
    Set<Fahrt> fahrt;


    public Fahrt fahrtanbieten(String abfahrtsort, String abfahrtszeit, String abfahrtsdatum, String ankunftsort, String ankunftsdatum, String ankunftszeit){


        Fahrt fa = new Fahrt();

        fa.setAbfahrtsdatum(abfahrtsdatum);
        fa.setAbfahrtsort(abfahrtsort);
        fa.setAbfahrtszeit(abfahrtszeit);
        fa.setAnkunfsdatum(ankunftsdatum);
        fa.setAnkunfsort(ankunftsort);
        fa.setGetAnkunfszeit(ankunftszeit);
        fa.setUser(this);



        return fa;


    }
}
