package com.example.tyralyn.myfirstapp;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationConfig;

import java.io.IOException;
import java.net.URL;
import java.util.List;

/**
 * Created by tyralyn on 11/2/2015.
 */
public class AddressBookUnpacker {
    public static String testString;
    public void testle(String string,  List<AddressBookContact> addressBook, ObjectMapper mapper) {
        String url = "https://solstice.applauncher.com/external/contacts.json";
        //mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        try {
            //AddressBookContact contact = mapper.readValue(string, AddressBookContact.class);
            //AddressBookDetail detail = mapper.readValue(new URL(url), AddressBookDetail.class);
            addressBook = mapper.readValue(string, new TypeReference<List<AddressBookContact>>(){});
            //System.out.println(contact.name);
            testString = addressBook.get(0).getName();
            //System.out.println(detail);
        } catch (IOException e) {
            e.printStackTrace();
            testString = "IO exception";
        }
        //testString = "fishy";

    }

}
