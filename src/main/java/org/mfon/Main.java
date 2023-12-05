package org.mfon;

import java.util.Calendar;
import java.util.Date;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        // Create a Mercedes Car with the following properties:
        // year: 2018, model: GLA, number of doors: 4/5, ...

        /*Vehicle car1 = new Vehicle("Mercedes");
        //car1.brand = "mercedes";
        car1.model = "GLA";
        car1.color = Colour.RED;
        car1.numberOfDoors = "4/5";
        car1.numberOfSeats = 5;
        car1.transmission = "Automatic";*/

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

        // use1
        UserProfile user1 = new UserProfile();
        user1.FirstName = "Malik";
        user1.LastName = "Stone";
        user1.DateOfBirth =  new Date(70, Calendar.OCTOBER, 6);
        user1.Address = "Honey Street 10";
        user1.PhoneNumber = 114565567;
        user1.Email = "Maltone@stik.com";
        user1.UserName = "Stonik";
        user1.Date = new Date(123, Calendar.JANUARY, 15);
        System.out.println("Date of Registration = " + user1.Date);


        // user2


        // user3

    }

}