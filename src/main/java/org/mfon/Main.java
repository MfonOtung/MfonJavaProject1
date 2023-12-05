package org.mfon;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to my first Java Application");

        // Variables and Data types
        int age = 34;
        int numberOfDoors ;

        String message = "Hello Dakar";
        boolean hasClientPaid = true;

        double price = 157;  // it take int or float

        double x, y, z ;

        x = 10;
        y = 7;
        z = x / y;

        if(age == 0){
            System.out.println("the child is not yet born");
        } else if (age > 0 && age <= 25) {
            System.out.println("your age is "+ age);
        }else {
            System.out.println("You are an adult");
        }

        //
        double carPrice = 20879000;

        /*Assignment 1:
        Write a for loop for I going from 0 to 12.
        If I is even number then print it.*/

                int number=12;
                System.out.print("List of even numbers from 1 to "+number+": ");
                for (int I=1; I<=number; I++)
                {

                    if (I%2==0)
                    {
                        System.out.print(I + " ");
                    }
                }


    }

}