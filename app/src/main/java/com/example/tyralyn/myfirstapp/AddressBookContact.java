package com.example.tyralyn.myfirstapp;

import java.io.StringBufferInputStream;

/**
 * Created by tyralyn on 11/2/2015.
 */


public class AddressBookContact {
    public class Phone {
        private String work;
        private String home;
        private String mobile;

        public String getWork() {return work;}
        public void setWork(String s) {work = s;}
        public String getHome() {return home;}
        public void setHome(String s) {home = s;}
        public String getMobile() {return mobile;}
        public void setMobile(String s){mobile = s;}
    }

    private  String name;
    private int employeeId;
    private String company;
    private String detailsURL;
    private String smallImageURL;
    private String birthdate;
    private Phone phone;
    public AddressBookDetail addressBookDetail;

    public String getName() {return name;}
    public void setName(String s) {name = s;}
    public int getEmployeeId() {return employeeId; }
    public void setEmployeeId(int i) {employeeId = i;}
    public String getCompany() {return company;}
    public void setDetailsURL(String s) {detailsURL = s;}
    public String getDetailsURL() {return detailsURL;}
    public void setCompany(String s) {company = s;}
    public String getSmallImageURL() {return smallImageURL;}
    public void setSmallImageURL(String s) {smallImageURL = s;}
    public String getBirthdate() {return birthdate;}
    public void setBirthdate(String s) {birthdate=s;}
    public Phone getPhone() {return phone;}
    public void setPhone(Phone p) {phone = p;}
}
