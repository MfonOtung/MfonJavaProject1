package org.mfon;

import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        // Create a Mercedes Car with the following properties:
        // year: 2018, model: GLA, number of doors: 4/5, ...


        List<Vehicle> cars = new ArrayList<Vehicle>();
        Vehicle car1 = new Vehicle("Mercedes");
        //car1.brand = "mercedes";
        car1.model = "GLA";
        car1.color = Colour.RED;
        car1.numberOfDoors = "4/5";
        car1.numberOfSeats = 5;
        car1.transmission = "Automatic";
        cars.add(car1);

        //System.out.println(car1.brand);

        Vehicle car2 = new Vehicle(
                "Audi",
                "Q5",
                Colour.BLUE,
                2500,
                "Mfon",
                5,
                "4/5",
                "Automatic",
                new Date(100,Calendar.DECEMBER,15)
        );
        /*car2.brand = "Audi";
        car2.color = Colour.BLACK;
        car2.price = 80000000;
        car2.registrationYear = new Date(123, Calendar.NOVEMBER, 18);
        car2.numberOfSeats = 4;
        car2.transmission = "Automatic";*/
        //car2.ownerOfTheCar = "Mfon Essien Otung";

        car2.setTransmission("Manual");
        //System.out.println("Numbber of seat = " + car2.numberOfSeats + "\n" + "transmission = "+car2.transmission);
        System.out.println("Numbber of seat = " + car2.numberOfSeats);
        System.out.println("transmission = "+car2.getTransmission());
        cars.add(car2);

        List<UserProfile> clients = new ArrayList<UserProfile>();
        // user1
        UserProfile user1 = new UserProfile();
        user1.setFirstName("Malik");
        user1.setLastName("Stone");
        user1.setDateOfBirth(new Date(70, Calendar.OCTOBER, 6));
        user1.setAddress("Honey Street 10");
        user1.setPhoneNumber(114565567);
        user1.setEmail("Maltone@stik.com");
        user1.setUserName("Stonik");
        user1.setDate(new Date(123, Calendar.JANUARY, 15));
        System.out.println("Date of Registration = " + user1.getDate());

        clients.add(user1);

        // user2
        UserProfile user2 = new UserProfile();
        user2.FirstName = "Henry";
        user2.LastName = "Petals";
        user2.DateOfBirth = new Date(90, Calendar.JUNE, 24);
        user2.Address = "10 Greyson Street";
        user2.PhoneNumber = 01234567;
        user2.Email = "hen11als@pe.com";
        user2.UserName = "Hepry";
        user2.Date = new Date(123, Calendar.DECEMBER, 6 );
        clients.add(user2);

        // user3
        UserProfile user3 = new UserProfile();
        user3.FirstName = "Dorothy";
        user3.LastName = "Pekins";
        user3.DateOfBirth = new Date(35, Calendar.AUGUST, 29);
        user3.Address = "104A Marcus Close";
        user3.PhoneNumber = 123433267;
        user3.Email = "dottypeks02@gmail.com";
        user3.UserName = "dopygal";
        user3.Date = new Date(123, Calendar.DECEMBER, 6 );
        clients.add(user3);

        System.out.println("Full Name = " + user3.FirstName + " " + user3.LastName);
        System.out.println("Address =" + user3.Address);
        System.out.println("Phone =" + user3.PhoneNumber);
        System.out.println("Email = " + user3.Email);


        // seller

        Seller newSeller1 = new Seller();

        List<Integer> myList1 = new ArrayList<Integer>();
        myList1.add(67);
        myList1.add(18);
        myList1.add(97);

        // create a list of integers. Use a for loop fo i going fom 0 to 10
        // and add random integers to the list

        List<Integer> myList2 = new ArrayList<Integer>();
        int number = 10;
        Random myRandonNumber = new Random();
        for (int i=0; i<number; i++){
            int val = myRandonNumber.nextInt(1000);
            myList2.add(val);

        }


    }

}