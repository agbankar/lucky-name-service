package com.ashish.model;


import java.io.Serializable;
import java.time.LocalDate;

public class LuckyRequest implements Serializable {
    private static final long serialVersionUID = 4L;
    private String name;
    private LocalDate dateOfBirth;

    public LuckyRequest ( String name, LocalDate dateOfBirth ) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName () {
        return name;
    }

    public void setName ( String name ) {
        this.name = name;
    }

    public LocalDate getDateOfBirth () {
        return dateOfBirth;
    }

    public void setDateOfBirth ( LocalDate dateOfBirth ) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString () {
        return "LuckyRequest{" +
                "name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
