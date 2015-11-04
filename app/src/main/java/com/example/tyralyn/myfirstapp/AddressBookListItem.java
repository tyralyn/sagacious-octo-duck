package com.example.tyralyn.myfirstapp;

import android.os.Bundle;

import java.util.ArrayList;

/**
 * Created by tyralyn on 11/3/2015.
 */
public class AddressBookListItem {
    private String itemTitle;


    public String getItemTitle() {
        return itemTitle;
    }

    public void setItemTitle(String itemTitle) {
        this.itemTitle = itemTitle;
    }

    public AddressBookListItem(String title){
        this.itemTitle = title;
    }

}
