/*
This is the Main Application class.

In this application:
- I create a Phone object
- I display the phone information
- I charge the phone battery
- I update the phone brand
- I display the updated information
*/

package com.lorie;

public class App {

    public static void main(String[] args) {

        // Create Object
        Phone myPhone = new Phone("iPhone15", 50);

        // Display Phone Information
        System.out.println(myPhone.getBrand());
        System.out.println(myPhone.getBattery());

        // Call method charge Phone Battery
        myPhone.chargePhone(20);

        // Display Updated Battery
        System.out.println(myPhone.getBattery());

        // Update Phone Brand
        myPhone.setBrand("iPhone17");

        // Display Updated Brand
        System.out.println(myPhone.getBrand());
    }
}