package com.example.tyralyn.myfirstapp;

/**
 * Created by tyralyn on 11/2/2015.
 */
public class AddressBookDetail {
    private int employeeId;
    private boolean favorite;
    private String largeImageURL;
    private String email;
    private String website;
    private Address address;

    public int getEmployeeId() {return employeeId; }
    public void setEmployeeId(int i) {employeeId = i;}
    public boolean getFavorite() {return favorite;}
    public void setFavorite(boolean b) {favorite = b;}
    public String getLargeImageURL() {return largeImageURL;}
    public void setLargeImageURL(String s) {largeImageURL = s;}
    public String getEmail() {return email;}
    public void setEmail(String s) {email = s;}
    public String getWebsite() {return website;}
    public void setWebsite(String s) {website=s;}
    public Address getAddress() {return address;}
    public void setAddress(Address a) {address = a;}
}
