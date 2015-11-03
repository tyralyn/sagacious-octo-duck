package com.example.tyralyn.myfirstapp;


import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationConfig;

import java.io.IOException;
import java.net.URL;

/**
 * Created by tyralyn on 11/2/2015.
 */
public class AddressBookUnpacker {
    public static String testString;
    public void testle(String string) {
        String url = "https://solstice.applauncher.com/external/contacts.json";
        ObjectMapper mapper = new ObjectMapper();
        //mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        try {
            //AddressBookContact contact = mapper.readValue(string, AddressBookContact.class);
            AddressBookDetail detail = mapper.readValue(string, AddressBookDetail.class);
            //System.out.println(contact.name);
            testString = detail.getEmail();
        } catch (IOException e) {
            e.printStackTrace();
            testString = "IO exception";
        }
        //testString = "fishy";

    }

}
