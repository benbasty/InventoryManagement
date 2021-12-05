package com.projects;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int menuChoice;
        Scanner scanner = new Scanner(System.in);
        ArrayList<Shop> shops = new ArrayList<Shop>();
        ArrayList<Customer> customers = new ArrayList<Customer>();
        do {
            Shop s = new Shop();
            Customer c = new Customer();
            menu();
            menuChoice = scanner.nextInt();
            switch (menuChoice) {
                case 1:
                    System.out.print("Enter Item Name: ");
                    scanner.nextLine();
                    s.setItemName(scanner.nextLine());
                    System.out.print("Enter Item Number: ");
                    s.setItemNumber(Integer.parseInt(scanner.nextLine()));
                    System.out.print("Enter Item Price: $");
                    s.setItemPrice(Integer.parseInt(scanner.nextLine()));
                    System.out.println("Thank you. All items (name, number and price) have been added");
                    s.addNewItem(s);
                    shops.add(s);
                    break;
                case 2:
                    System.out.println("Here are your Items");
                    s.displayItems(shops);
                    break;
                case 3:
                    System.out.println("Adding customer Details");
                    System.out.println("===========================================");
                    System.out.print("Enter Customer Name: ");
                    scanner.nextLine();
                    c.setCustomerName(scanner.nextLine());
                    System.out.print("Enter Customer Id: ");
                    c.setCustomerId(Integer.parseInt(scanner.nextLine()));
                    System.out.print("Enter Customer Purchased Quantity: ");
                    c.setPurchasedQuantity(Integer.parseInt(scanner.nextLine()));
                    System.out.print("Enter Customer Item No: ");
                    c.setItemNumber(Integer.parseInt(scanner.nextLine()));
                    System.out.print("Enter Customer Total Bill Paid: $");
                    c.setTotalPaid(Float.parseFloat(scanner.nextLine()));
                    c.addCustomerDetails(c);
                    customers.add(c);
                    System.out.println("Here Are Your Customer's Details");
                    c.displayCustomerDetails(c);
                    break;
                default:
                    break;

            }
        } while (menuChoice != 0);

    }

    public static void menu() {
        System.out.println("Welcome To The Inventory Management System");
        System.out.println("1. Add a New Item");
        System.out.println("2. Display all Items");
        System.out.println("3. Add Customer Details");
        System.out.println("0. Exit");
    }
}
