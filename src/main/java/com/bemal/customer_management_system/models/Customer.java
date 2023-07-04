package com.bemal.customer_management_system.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerId;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "date_of_birth", nullable = false)
    private String dateOfBirth;

    @Column(name = "nic_number", unique = true, nullable = false)
    private String nicNumber;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<Address> addresses;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<MobileNumber> mobileNumbers;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<Family> familyMembers;

    public Customer(Long customerId, String name, String dateOfBirth, String nicNumber, List<Address> addresses, List<MobileNumber> mobileNumbers, List<Family> familyMembers) {
        this.customerId = customerId;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.nicNumber = nicNumber;
        this.addresses = addresses;
        this.mobileNumbers = mobileNumbers;
        this.familyMembers = familyMembers;
    }

    public Long getCustomer_id() {
        return customerId;
    }

    public void setCustomer_id(Long customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getNicNumber() {
        return nicNumber;
    }

    public void setNicNumber(String nicNumber) {
        this.nicNumber = nicNumber;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public List<MobileNumber> getMobileNumbers() {
        return mobileNumbers;
    }

    public void setMobileNumbers(List<MobileNumber> mobileNumbers) {
        this.mobileNumbers = mobileNumbers;
    }

    public List<Family> getFamilyMembers() {
        return familyMembers;
    }

    public void setFamilyMembers(List<Family> familyMembers) {
        this.familyMembers = familyMembers;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customer_id=" + customerId +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", nicNumber='" + nicNumber + '\'' +
                ", addresses=" + addresses +
                ", mobileNumbers=" + mobileNumbers +
                ", familyMembers=" + familyMembers +
                '}';
    }
}
