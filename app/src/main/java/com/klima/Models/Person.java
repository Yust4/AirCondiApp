package com.klima.Models;

public class Person {
    String name;
    String phoneNumber;
    String comment;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }


    public Person(String name, String phoneNumber, String comment) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.comment = comment;
    }
}
