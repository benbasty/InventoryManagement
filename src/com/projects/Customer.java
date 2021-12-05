package com.projects;

public class Customer {
    private int customerId;
    private String customerName;
    private int purchasedQuantity;
    private int itemNumber;
    private float totalPaid;

    // getters and setters


    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getPurchasedQuantity() {
        return purchasedQuantity;
    }

    public void setPurchasedQuantity(int purchasedQuantity) {
        this.purchasedQuantity = purchasedQuantity;
    }

    public int getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(int itemNumber) {
        this.itemNumber = itemNumber;
    }

    public float getTotalPaid() {
        return totalPaid;
    }

    public void setTotalPaid(float totalPaid) {
        this.totalPaid = totalPaid;
    }

    // add customer details
    public void addCustomerDetails(Customer customer) {
        this.customerId = customer.customerId;
        this.customerName = customer.customerName;
        this.purchasedQuantity = customer.purchasedQuantity;
        this.itemNumber = customer.itemNumber;
        this.totalPaid = customer.totalPaid;

    }

    // display customer details
    public void displayCustomerDetails(Customer customer) {
        System.out.println("------------------------------------------------------------");
        System.out.println("Customer Name: " + customer.customerName);
        System.out.println("Customer ID: " + customer.customerId);
        System.out.println("Purchased Quantity: " + customer.purchasedQuantity);
        System.out.println("Item No: " + customer.itemNumber);
        System.out.println("Total Bill Paid: " + customer.totalPaid);
        System.out.println("------------------------------------------------------------");

    }
}


