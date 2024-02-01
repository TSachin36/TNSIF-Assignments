package com.tnsif.assignments.assignment2.automated_resort_booking;

class Customer {
    private String name;
    private int numAdults;
    private int numChildren;
    private int numDays;

    public Customer(String name, int numAdults, int numChildren, int numDays) {
        this.name = name;
        this.numAdults = numAdults;
        this.numChildren = numChildren;
        this.numDays = numDays;
    }

    public String getName() {
        return name;
    }

    public int getNumAdults() {
        return numAdults;
    }

    public int getNumChildren() {
        return numChildren;
    }

    public int getNumDays() {
        return numDays;
    }
}