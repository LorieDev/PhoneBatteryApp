/*
This class is called Phone.

This class contains:
- Attributes
- Constructor
- Methods
- Setter
- Getters
*/

package com.lorie;

public class Phone {

    // Attributes
    String brand;
    int battery;

    // Constructor
    public Phone(String brand, int battery) {

        this.brand = brand;
        this.battery = battery;
    }

    // Method to Charge the Phone Battery
    public void chargePhone(int battery) {

        this.battery += battery;
    }

    // Setter to Update the Phone Brand
    public void setBrand(String brand) {

        this.brand = brand;
    }

    // Getter to Return the Phone Brand
    public String getBrand() {

        return brand;
    }

    // Getter to Return the Battery Level
    public int getBattery() {

        return battery;
    }
}