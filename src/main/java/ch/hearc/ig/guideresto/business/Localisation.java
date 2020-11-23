package ch.hearc.ig.guideresto.business;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Localisation {
    @Column(name="ADRESSE")
    private String street;
    @Column(name="ADRESSE") // possible de mettre 2 fois la meme chose ??
    private City city;

    public Localisation() {
        this(null, null);
    }
    
    public Localisation(String street, City city) {
        this.street = street;
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
}