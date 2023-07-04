package com.bemal.customer_management_system.models;

import jakarta.persistence.*;
@Entity
@Table(name = "Family")
public class Family {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "family_id")
    private Long family_id;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "family_member_id")
    private Customer familyMember;

    public Family(Long family_id, Customer customer, Customer familyMember) {
        this.family_id = family_id;
        this.customer = customer;
        this.familyMember = familyMember;
    }

    public Long getFamily_id() {
        return family_id;
    }

    public void setFamily_id(Long family_id) {
        this.family_id = family_id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Customer getFamilyMember() {
        return familyMember;
    }

    public void setFamilyMember(Customer familyMember) {
        this.familyMember = familyMember;
    }

    @Override
    public String toString() {
        return "Family{" +
                "family_id=" + family_id +
                ", customer=" + customer +
                ", familyMember=" + familyMember +
                '}';
    }
}
