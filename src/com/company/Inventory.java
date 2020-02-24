package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Inventory {



    static int maxsize = 10;
    static int count = 0;
    static ArrayList<Bicycle> inventory = new ArrayList<Bicycle>(maxsize);
    public static void main(String[] args){
    }

    public int get_count(){
        for (int i = 0; i < inventory.size(); i++){
            if (inventory.get(i) != null){
                count++;
            }
        }
        return count;
    }

    public static void addItem(String brand,String color, int yearManufactured, double massOfBicycle, double massOfRider, double price){
        inventory.add(new Bicycle(brand, color, yearManufactured, massOfBicycle, massOfRider, price));

    }

    public static void get_item(int i){
        System.out.println("Bicycle " + (i + 1));
        System.out.println("Brand: " + inventory.get(i).getBrand());
        System.out.println("Color: " + inventory.get(i).getColor());
        System.out.println("Year manufactured: " + inventory.get(i).getYearManufactured());
        System.out.println("Mass of a bicycle: " + inventory.get(i).getMassOfBicycle() + "kg");
        System.out.println("Maximum mass of a rider: " + inventory.get(i).getMassOfRider() + "kg");
        System.out.println("Price: " + "$" + inventory.get(i).getPrice());
        System.out.println("");
    }

    public static void find_item(){
        System.out.println("Enter the name of the brand you are looking for");
        Scanner input = new Scanner(System.in);
        String brandNeeded = input.nextLine();
        int tempCount = 0;
        for (int i = 0; i < inventory.size(); i++){
            if (inventory.get(i).getBrand().equalsIgnoreCase(brandNeeded)){
                tempCount++;
                System.out.println("Bicycle is found");
                System.out.println("Bicycle " + (i + 1));
                System.out.println("Brand: " + inventory.get(i).getBrand());
                System.out.println("Color: " + inventory.get(i).getColor());
                System.out.println("Year manufactured: " + inventory.get(i).getYearManufactured());
                System.out.println("Mass of a bicycle: " + inventory.get(i).getMassOfBicycle() + "kg");
                System.out.println("Maximum mass of a rider: " + inventory.get(i).getMassOfRider() + "kg");
                System.out.println("Price: " + "$" + inventory.get(i).getPrice());
                System.out.println("");
            }
        }
        System.out.println("Bicycles found: " + tempCount);
    }





}
