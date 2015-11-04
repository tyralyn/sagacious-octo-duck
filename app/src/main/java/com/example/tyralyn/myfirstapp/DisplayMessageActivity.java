package com.example.tyralyn.myfirstapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//Class that handles initial processing of JSON data
public class DisplayMessageActivity extends AppCompatActivity {

    public static List<AddressBookContact> addressBook;
    public static ObjectMapper mapper = new ObjectMapper();
    public TextView textView;
    public RequestQueue q;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addressBook = new ArrayList<AddressBookContact>();

        //get message from intent
        Intent intent = getIntent();
        String message = intent.getStringExtra(MyActivity.EXTRA_MESSAGE);
        //create textview object
        textView = new TextView(this);
        textView.setTextSize(10);

        //set up new Volley RequestQ
        q = Volley.newRequestQueue(this);
        String url = "https://solstice.applauncher.com/external/contacts.json";
        //
        q.add(getAddressBookContacts(url));
        setContentView(textView);

    }

    public StringRequest getAddressBookContacts(String url) {
        //set up request for string data obtained via Volley
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {
            @Override
            //if string data is recieved, use jackson objectmapper to bind to addressbook
            public void onResponse(String response) {
                //unpack/parse JSON data form webpage
                try {
                    addressBook = mapper.readValue(response, new TypeReference<List<AddressBookContact>>() {
                    });
                    textView.setText(addressBook.get(addressBook.size()-1).getCompany());
                } catch (IOException e) {
                    e.printStackTrace();
                }
                //set up what's going to happen with with the parsed text
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                textView.setText("noResponseContent");
            }
        });
        return stringRequest;
    }

   /*private List<StringRequest> getAddressBookDetails(String url) {
        //send request for data from contact list json file
        if (addressBook != null) {
            if (!addressBook.isEmpty()) {
                for (int i = 0; i < addressBook.size(); i++) {
                    final int index = i;
                    String detailURL = addressBook.get(i).getDetailsURL();
                    StringRequest detailRequest = new StringRequest(Request.Method.GET, detailURL, new Response.Listener<String>() {
                        @Override

                        //if string data is recieved, use jackson objectmapper to bind to addressbook
                        public void onResponse(String response) {
                            //unpack/parse JSON data form webpage
                            try {
                                addressBook.get(index).addressBookDetail = mapper.readValue(response, new TypeReference<List<AddressBookContact>>() {
                                });
                            } catch (IOException e) {
                                e.printStackTrace();
                                textView.setText("IO exception");
                            }

                            //set up what's going to happen with with the parsed text
                            textView.setText(addressBook.get(2).getCompany());
                        }
                    }, new Response.ErrorListener() {
                        @Override
                        public void onErrorResponse(VolleyError error) {
                            textView.setText("couldn't find it :(");
                        }
                    });
                    q.add(detailRequest);
                    textView.setText(addressBook.get(index).addressBookDetail.getEmail());
                }
            }
        }
        textView.setText(s);

        setContentView(textView);

    }*/

}
