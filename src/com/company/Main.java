package com.company;

import static com.company.Inventory.inventory;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Inventory inventoryObject = new Inventory();
        Bicycle bicycle1 = new Bicycle("Author", "white", 2015, 14.1 , 110.5, 400 );
        Bicycle bicycle2 = new Bicycle("Gazzele", "gray", 1980, 10.2 , 90, 180 );
        Bicycle bicycle3 = new Bicycle("Merida", "black", 2019, 13.0 , 120.5, 750 );
        Bicycle bicycle4 = new Bicycle("Cannodale", "black", 2018, 15.0 , 130.0, 1100 );
        Bicycle bicycle5 = new Bicycle("Author", "blue", 2016, 13.7 , 110.5, 530 );


        Inventory.addItem(bicycle1.getBrand(), bicycle1.getColor(), bicycle1.getYearManufactured(), bicycle1.getMassOfBicycle(), bicycle1.getMassOfRider(), bicycle1.getPrice());
        Inventory.addItem(bicycle2.getBrand(), bicycle2.getColor(), bicycle2.getYearManufactured(), bicycle2.getMassOfBicycle(), bicycle2.getMassOfRider(), bicycle2.getPrice());
        Inventory.addItem(bicycle3.getBrand(), bicycle3.getColor(), bicycle3.getYearManufactured(), bicycle3.getMassOfBicycle(), bicycle3.getMassOfRider(), bicycle3.getPrice());
        Inventory.addItem(bicycle4.getBrand(), bicycle4.getColor(), bicycle4.getYearManufactured(), bicycle4.getMassOfBicycle(), bicycle4.getMassOfRider(), bicycle4.getPrice());
        Inventory.addItem(bicycle5.getBrand(), bicycle5.getColor(), bicycle5.getYearManufactured(), bicycle5.getMassOfBicycle(), bicycle5.getMassOfRider(), bicycle5.getPrice());
        System.out.println("Number of bicycles in the inventory: " + inventoryObject.get_count());
        inventoryObject.get_item(0);
        inventoryObject.get_item(1);
        inventoryObject.get_item(2);
        inventoryObject.get_item(3);
        inventoryObject.get_item(4);

        inventoryObject.find_item();
    }
}
