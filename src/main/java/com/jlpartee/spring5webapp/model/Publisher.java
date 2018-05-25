package com.jlpartee.spring5webapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String address1;
    private String address2;
    private String city;
    private String state;
    private int zipcode;
    private int zipPlusFour;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public int getZipPlusFour() {
        return zipPlusFour;
    }

    public void setZipPlusFour(int zipPlusFour) {
        this.zipPlusFour = zipPlusFour;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Publisher publisher = (Publisher) o;

        return id != null ? id.equals(publisher.id) : publisher.id == null;

    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Publisher {" +
                "id=" + id +
                ", name = '" + name + '\'' +
                ", address1 = '" + address1 + '\'' +
                ", address2 = '" + address2 + '\'' +
                ", city = '" + city + '\'' +
                ", state = '" + state + '\'' +
                ", zipcode = '" + zipcode + '\'' +
                ", zipplusfour = '" + zipPlusFour + '\'' +
                '}';
    }
}
