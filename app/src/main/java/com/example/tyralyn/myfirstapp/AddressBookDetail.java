package com.example.tyralyn.myfirstapp;

/**
 * Created by tyralyn on 11/2/2015.
 */
public class AddressBookDetail {
    public class Address {
        private String street;
        private String city;
        private String state;
        private String country;
        private String zip;
        private int latitude;
        private int longitude;

        public String getStreet() {return street;}
        public void setStreet(String s) {street = s;}
        public String getCity() {return city;}
        public void setCity(String s) {city = s;}
        public String getState() {return state;}
        public void setState(String s) {state = s;}
        public String getCountry() {return country;}
        public void setCountry(String s) {country = s;}
        public String getZip() {return zip;}
        public void setZip(String s) {zip = s;}
        public int getLatitude() {return latitude;}
        public void setLatitude(int i) {latitude = i;}
        public int getLongitude() {return longitude;}
        public void setLongitude(int i) {longitude = i;}


    }

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
