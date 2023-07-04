package com.bemal.customer_management_system.models;

import jakarta.persistence.*;

@Entity
@Table(name = "County")
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "country_id")
    private Long country_id;

    @Column(name = "country_name")
    private String country_name;

    public Country(Long country_id, String country_name) {
        this.country_id = country_id;
        this.country_name = country_name;
    }

    public Long getCountry_id() {
        return country_id;
    }

    public void setCountry_id(Long country_id) {
        this.country_id = country_id;
    }

    public String getCountry_name() {
        return country_name;
    }

    public void setCountry_name(String country_name) {
        this.country_name = country_name;
    }

    @Override
    public String toString() {
        return "Country{" +
                "country_id=" + country_id +
                ", country_name='" + country_name + '\'' +
                '}';
    }
}
