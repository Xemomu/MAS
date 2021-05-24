package com.MP1;

import java.io.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.List;

public class Order implements Serializable {
    private int id;
    private float value;
    private String address;
    private static List<Order> extent = new ArrayList<>();
    /**
     * Atr. klasowy
     */
    private static int lastId = 0;
    /**
     * Atr. złożony
     */
    private LocalDateTime orderDateTime;
    private Dictionary<Integer, String> delivery;
    /**
     * Atr. opcjonalny
     */
    private Float discount;

    public Order(){
        addOrder(this);
    }

    public Order(float value, String address, LocalDateTime orderDateTime) {
        lastId++;
        this.id = lastId;
        this.value = value;
        this.address = address;
        this.orderDateTime = orderDateTime;
        addOrder(this);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getValue() {
        if(this.discount != null) {
            return value - (value*discount);
        } else {
            return value;
        }
    }

    /**
     * Atr. opcjonalny
     */
    public void setValue(float value) {
        this.value = value;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDateTime getOrderDateTime() {
        return orderDateTime;
    }

    public void setOrderDateTime(LocalDateTime orderDateTime) {
        this.orderDateTime = orderDateTime;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(Float discount) {
        this.discount = discount;
    }

    public static List<Order> getExtent() {
        return extent;
    }

    public static void setExtent(List<Order> extent) {
        Order.extent = extent;
    }

    public static void addOrder(Order order){
        extent.add(order);
    }

    public static void removeOrder(Order order){
        extent.remove(order);
    }

    /**
     * Metoda klasowa
     */
    public static void showExtent(){
        for (Order order : extent) {
            System.out.println(order);
        }
    }

    /**
     * Ekstensja trwałość
     */
    public static void writeExtent(ObjectOutputStream objectOutputStream) throws IOException{
        objectOutputStream.writeObject(extent);
    }

    public static void readExtent(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        extent = (ArrayList<Order>) objectInputStream.readObject();
    }

    /**
     * Przesłonięcie
     */
    @Override
    public String toString(){
        return String.format("Id: '%s', price: %s, address: %s, order time: %s", getId(), getValue(), getAddress(), getOrderDateTime());
    }
}
