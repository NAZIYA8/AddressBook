package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Person;

public class AddressBook {
    private static Scanner scan = new Scanner(System.in);
    static List<Person> personList = new ArrayList<>();

    /**
     * Adds new Contact to Address book
     */
    public static void add() {
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

        personList.add(person);
    }

    /**
     * Edit existing contact using their name
     */
    public static void edit() {
        System.out.println("Enter the name of person to edit");
        String firstName = scan.next();
        ArrayList<Person> filteredList = new ArrayList<>();

        for (int i = 0; i < personList.size(); i++) {
            if (personList.get(i).getFirstname().equalsIgnoreCase(firstName)) {
                filteredList.add(personList.get(i));
            } else {
                System.out.println("Record not exist");
            }
        }
        if (null != filteredList && filteredList.size() >= 1) {
            Person person = filteredList.get(0);
            System.out.println("Enter last Name ");
            person.setLastName(scan.nextLine());
            System.out.println("Enter Address ");
            person.setAddress(scan.nextLine());
            System.out.println("Enter State ");
            person.setState(scan.nextLine());
            System.out.println("Enter City");
            person.setCity(scan.nextLine());
            System.out.println("Enter Zip");
            person.setZip(scan.nextInt());
            System.out.println("Enter Phone");
            person.setPhone(scan.nextInt());
            System.out.println("Enter Email1");
            person.setEmail(scan.nextLine());

            for (int j = 0; j < personList.size(); j++) {
                if (personList.get(j).getFirstname().equalsIgnoreCase(person.getFirstname())) {
                    personList.set(j, person);
                }
            }
            System.out.println(personList);
        }
    }

    public static void main(String[] args) {

        boolean isExit = false;

        while (!isExit) {
            System.out.println("Enter option 1.Add\n2.Edit\n3.Delete\n4.Exit\n5.ShowContact");
            int userInput = scan.nextInt();
            switch (userInput) {
                case 1:
                    //add
                    add();
                    break;
                case 2:
                    //edit
                    edit();
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
                    System.out.println(personList);
                    break;
                default:

                    break;
            }
        }
    }
}