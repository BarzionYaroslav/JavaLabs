package com.example.Labwork;

import java.util.Date;

public class BakedBean {
    private String firstName;
    private String surname;
    private Date birth;

    public BakedBean(String firstName, String surname, Date birth) {
        this.firstName = firstName;
        this.surname = surname;
        this.birth = birth;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "I am " + firstName + " " + surname +
                " and I was born at " + birth;
    }
}
