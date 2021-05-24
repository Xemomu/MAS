package com.MP1;

import java.util.ArrayList;

public class Client {
    private static int lastId = 0;
    private int id;
    private String firstName;
    /**
     * Atr. pochodny
     */
    final static int premiumDiscountRate = 2;
    int premiumDiscount;
    private String lastName;
    /**
     * Atr. powtarzalny
     */
    private ArrayList<String> typeOfClient;

    public Client(String firstName, String lastName) {
        lastId++;
        this.id = lastId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void addType(String type){
        typeOfClient.add(type);
    }

    public void removeType(String type){
        typeOfClient.remove(type);
    }

    public ArrayList<String> getTypeOfClient() {
        return typeOfClient;
    }

    public void setTypeOfClient(ArrayList<String> typeOfClient) {
        this.typeOfClient = typeOfClient;
    }

    public int getPremiumDiscount() {
        return premiumDiscount*premiumDiscountRate;
    }

    public void setPremiumDiscount(int premiumDiscount) {
        this.premiumDiscount = premiumDiscount;
    }
}
