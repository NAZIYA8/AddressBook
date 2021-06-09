package service;


import java.util.Scanner;

import model.Person;

public class AddressBook {
    private static Scanner scan = new Scanner(System.in);

    /**
     * create contacts
     * Which adds personal details
     */
    public static void createContacts() {
        Person person = new Person();
        System.out.println("Enter First Name");
        person.setFirstname(scan.next());
        System.out.println("Enter last Name");
        person.setLastName(scan.next());
        System.out.println("Enter Address");
        person.setAddress(scan.next());
        System.out.println("Enter State");
        person.setState(scan.next());
        System.out.println("Enter City");
        person.setCity(scan.next());
        System.out.println("Enter Zip");
        person.setZip(scan.nextInt());
        System.out.println("Enter Phone");
        person.setPhone(scan.nextInt());
        System.out.println("Enter Email1");
        person.setEmail(scan.next());
        System.out.println("-------------");

    }

    public static void main(String[] args) {

        boolean isExit = false;

        while (!isExit) {
            System.out.println("Enter option 1.Add\n2.Edit\n3.Delete\n4.Exit\n5.ShowContact");
            int userInput = scan.nextInt();
            switch (userInput) {
                case 1:
                    createContacts();
                    break;
                case 2:
                    //edit
                    break;
                case 3:
                    //delete
                    break;
                case 4:
                    //delete
                    isExit = true;
                    break;
                case 5:
                    //showContact
                    break;
                default:

                    break;
            }
        }
    }
}
