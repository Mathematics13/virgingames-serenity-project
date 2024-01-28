package com.virgingames.model;

public class GamesPojo
{
    private String id;                                                                  //declaring private variables
    private String name;
    private String currency;
    private double amount;

    public String getId() {                               //generating getters and setters method
        return id;
    }

    public void setId(String id) {
        this.id = id;                                                                  //this.GV = LV
    }

    public String getName() {                                                        //Using encapsulation
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
