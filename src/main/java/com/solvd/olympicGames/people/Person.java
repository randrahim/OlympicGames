package com.solvd.olympicGames.people;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.Objects;

public abstract class Person {
    private String firstName;
    private String lastName;
    private String DOB;
    private String address;
    private String phoneNo;
    private String email;
    private String gender;
    private static final Logger logger = LogManager.getLogger(Person.class);

    // ------------------------ Constructors -------------------------//
    public Person() {
    }

    public Person(String firstName, String lastName, String DOB, String address, String phoneNo, String email, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.DOB = DOB;
        this.address = address;
        this.phoneNo = phoneNo;
        this.email = email;
        this.gender = gender;
    }

    // ------------------------ Setters -------------------------//

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    // ------------------------ Getters -------------------------//

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDOB() {
        return DOB;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    // ------------------------ Add Override equals(), hashCode(), toString() -------------------------//

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return Objects.equals(getFirstName(), person.getFirstName()) && Objects.equals(getLastName(), person.getLastName()) && Objects.equals(getDOB(), person.getDOB()) && Objects.equals(getAddress(), person.getAddress()) && Objects.equals(getPhoneNo(), person.getPhoneNo()) && Objects.equals(getEmail(), person.getEmail()) && Objects.equals(getGender(), person.getGender());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName(), getDOB(), getAddress(), getPhoneNo(), getEmail(), getGender());
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", DOB='" + DOB + '\'' +
                ", address='" + address + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
