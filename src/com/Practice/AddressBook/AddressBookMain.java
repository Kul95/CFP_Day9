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

    // Update Contact details method.....
    public void updateContacts() {
        boolean found=false;
        System.out.println("Enter your first name: ");
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        for (Contacts contacts11 : set) {
            if (contacts11.getFirstName().equals(contacts11.firstName)) {
                System.out.println("Enter the first name: ");
                String firstName1 = sc.nextLine();
                System.out.println("Enter the last name: ");
                String lastName = sc.nextLine();
                System.out.println("Enter the address: ");
                String address = sc.nextLine();
                System.out.println("Enter the city: ");
                String city = sc.nextLine();
                System.out.println("Enter the state: ");
                String state = sc.nextLine();
                System.out.println("Enter the zip code: ");
                int zip = sc.nextInt();
                System.out.println("Enter the Phone number: ");
                long phone1 = sc.nextLong();
                System.out.println("Enter the email: ");
                String email = sc.nextLine();
                contacts11.setFirstName(firstName1);
                contacts11.setLastName(lastName);
                contacts11.setAddress(address);
                contacts11.setCity(city);
                contacts11.setState(state);
                contacts11.setZip(zip);
                contacts11.setPhone(phone1);
                contacts11.setEmail(email);
                System.out.println(contacts11);
                System.out.println("Contact details updated.");
                found = true;
            }
        }
        if (!found) {
            System.out.println("Contact first name  is not present....");
        } else {
            System.out.println("Contact details updated successfully....");
        }
    }

    // Delete Contact details....
    public void deleteContacts() {
        boolean found=false;
        System.out.println("Enter your first name: ");
        String firstName = sc.nextLine();
        Contacts contactDelete = null;
        for (Contacts contacts2 : set) {
            if (contacts2.getFirstName().equals(contacts2.firstName)) {
                contactDelete = contacts2;
                found = true;
            }
        }
        if (!found) {
            System.out.println("Contact details is not present..");
        } else {
            set.remove(contactDelete);
            System.out.println("Contact details deleted successfully");
        }

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
                // Update Contacts.....
                case 3:
                    System.out.println("Update Contacts: ");
                    addressBookMain1.updateContacts();
                    break;
                // Delete Contacts....
                case 4:
                    System.out.println("Delete Contacts: ");
                    addressBookMain1.deleteContacts();
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

