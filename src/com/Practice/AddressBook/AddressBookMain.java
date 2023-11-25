package com.Practice.AddressBook;

import java.util.HashSet;
import java.util.Scanner;

public class AddressBookMain {
    HashSet<Contacts> set = new HashSet<>();
    Scanner sc = new Scanner(System.in);
    // Add Contact details method...
    void addContacts() {
        System.out.println("Add Details: ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first name: ");
        String firstName = scanner.nextLine();
        System.out.println("Enter the last name: ");
        String lastName = scanner.nextLine();
        System.out.println("Enter the address: ");
        String address = scanner.nextLine();
        System.out.println("Enter the city: ");
        String city = scanner.nextLine();
        System.out.println("Enter the state: ");
        String state = scanner.nextLine();
        System.out.println("Enter the zip Code: ");
        int zip = scanner.nextInt();
        System.out.println("Enter the phone number: ");
        long phone = scanner.nextLong();
        System.out.println("Enter the email: ");
        String email = scanner.nextLine();
        Contacts contacts11 = new Contacts(firstName, lastName, address, city, state, zip, phone, email);
        set.add(contacts11);
        System.out.println("Contact details added successfully...." + set);

    }
    static boolean ordering = true;
    public static void main(String[] args) {
        AddressBookMain addressBookMain1 = new AddressBookMain();
        Scanner sc = new Scanner(System.in);
        // Do while loop....
        do {
            System.out.println("Welcome to AddressBook Project"
                    + "\n1. Add Contact Details"
                    + "\n2. View Contact details"
                    + "\n3.Update Contact details"
                    + "\n4. Delete Contact details"
                    + "\n5. View All Contact details"
                    + "\n6. Exit ");
            System.out.println("Enter the choice! :");
            int choice = sc.nextInt();
            // Switch Cases..........
            switch (choice) {
                //Add contacts...
                case 1:
                    System.out.println("Add Contacts: ");
                    addressBookMain1.addContacts();
                    break;
                default:
                    System.out.println("Please enter valid choice: ");
                    break;
                // Exit from program
                case 6:
                    System.out.println("Exit  " + "\n Thank you for using This application");
                    break;

            }
        } while (ordering);
    }
    }

