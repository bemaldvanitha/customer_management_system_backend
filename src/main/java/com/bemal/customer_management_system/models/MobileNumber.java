package com.bemal.customer_management_system.models;

import jakarta.persistence.*;

@Entity
@Table(name = "MobileNumber")
public class MobileNumber {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mobile_number_id")
    private Long mobile_number_id;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @Column(name = "mobile_number")
    private Long mobile_number;

    public MobileNumber(Long mobile_number_id, Customer customer, Long mobile_number) {
        this.mobile_number_id = mobile_number_id;
        this.customer = customer;
        this.mobile_number = mobile_number;
    }

    public Long getMobile_number_id() {
        return mobile_number_id;
    }

    public void setMobile_number_id(Long mobile_number_id) {
        this.mobile_number_id = mobile_number_id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Long getMobile_number() {
        return mobile_number;
    }

    public void setMobile_number(Long mobile_number) {
        this.mobile_number = mobile_number;
    }

    @Override
    public String toString() {
        return "MobileNumber{" +
                "mobile_number_id=" + mobile_number_id +
                ", customer=" + customer +
                ", mobile_number=" + mobile_number +
                '}';
    }
}
