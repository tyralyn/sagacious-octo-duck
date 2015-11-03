package com.example.tyralyn.myfirstapp;


import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URL;

/**
 * Created by tyralyn on 11/2/2015.
 */
public class AddressBookUnpacker {
    public static String testString;
    public void testle() {
        String url = "https://solstice.applauncher.com/external/contacts.json";
        ObjectMapper mapper = new ObjectMapper();
        //mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);

        try {
            AddressBookContact contact = mapper.readValue(new URL(url), AddressBookContact.class);
            //System.out.println(contact.name);
            //testString = contact.birthdate;
        } catch (IOException e) {
            testString = "IO exception";
        }
        //testString = "fishy";

    }

}
