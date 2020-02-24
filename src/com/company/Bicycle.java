package com.company;

public class Bicycle {

    private String brand;
    private String color;
    private int yearManufactured;
    private double massOfBicycle;
    private double massOfRider;
    private double price;

    protected Bicycle(){

    }

    protected Bicycle(String brand, String color, int yearManufactured, double massOfBicycle, double massOfRider, double price){
        this.brand = brand;
        this.color = color;
        this.yearManufactured = yearManufactured;
        this.massOfBicycle = massOfBicycle;
        this.massOfRider = massOfRider;
        this.price = price;
    }

    public double getPrice(){
        return price;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public int getYearManufactured() {
        return yearManufactured;
    }

    public double getMassOfBicycle() {
        return massOfBicycle;
    }

    public double getMassOfRider() {
        return massOfRider;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYearManufactured(int yearManufactured) {
        this.yearManufactured = yearManufactured;
    }

    public void setMassOfBicycle(double massOfBicycle) {
        this.massOfBicycle = massOfBicycle;
    }

    public void setMassOfRider(double massOfRider) {
        this.massOfRider = massOfRider;
    }

    public void setPrice(double price){
        this.price = price;
    }
}
