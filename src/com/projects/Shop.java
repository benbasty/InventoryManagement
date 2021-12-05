package com.projects;

import java.util.ArrayList;

public class Shop {
    private int itemNumber;
    private String itemName;
    private int itemPrice;

    // get and set itemNumber, itemName and itemPrice

    //getters
    public int getItemNumber() {
        return this.itemNumber;
    }
    public String getItemName() {
        return this.itemName;
    }
    public int getItemPrice() {
        return this.itemPrice;
    }

    //setters
    public void setItemNumber(int itemNumber) {
        this.itemNumber = itemNumber;
    }
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    // add a new item
    public void addNewItem(Shop shop) {
        this.itemName = shop.itemName;
        this.itemNumber = shop.itemNumber;
        this.itemPrice = shop.itemPrice;

    }

    // display all items
    public void displayItems(ArrayList<Shop> shopItems) {
        for (Shop shop: shopItems) {
            System.out.println("------------------------------------------------------------");
            System.out.println("Item No: " + shop.itemNumber);
            System.out.println("Item Name: " + shop.itemName);
            System.out.println("Item Price: " + shop.itemPrice);
            System.out.println("------------------------------------------------------------");
        }
    }
}
