package com.danieleoliva.backendlesssetup;

/**
 * Created by danieloliva on 1/17/18.
 */

public class Person {
    //lets test the back end

    private String name;
    private String surname;


    public Person(){
        name = null;

        surname = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
