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

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //get message from intent
        Intent intent = getIntent();
        String message = intent.getStringExtra(MyActivity.EXTRA_MESSAGE);

        //create textview object
        final TextView textView = new TextView(this);
        textView.setTextSize(10);

        //instantiate class that will process 
        final AddressBookUnpacker unpacker = new AddressBookUnpacker();
        //textView.setText(message);
        RequestQueue q = Volley.newRequestQueue(this);
       // String url = "https://solstice.applauncher.com/external/contacts.json";
        String url = "https://solstice.applauncher.com/external/Contacts/id/1.json";
        StringRequest stringRequest = new StringRequest(Request.Method.GET,url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                //textView.setText("on the website: " + response.substring(0, 100));
                unpacker.testle(response);
                textView.setText(unpacker.testString);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                textView.setText("couldn't find it :(");
            }
        });
        q.add(stringRequest);
        setContentView(textView);

    }

}
