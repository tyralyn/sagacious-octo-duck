package com.example.tyralyn.myfirstapp;

/**
 * Created by tyralyn on 11/2/2015.
 */
public class AddressBookDetail {
    public class Address {
        String street;
        String city;
        String state;
        String country;
        String zip;
        int latitude;
        int longitude;
    }

    String employeeID;
    boolean favorite = false;
    String largeImageURL;
    String email;
    String website;
    Address address;
}
