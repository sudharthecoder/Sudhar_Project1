package BusResv;

import java.util.ArrayList;
import java.util.Scanner;

public class BusDemo {
    public static void main (String[] Args){
        int useropt = 1;
        Scanner sc = new Scanner(System.in);

        // creating objects for the bus class and saving it in arraylist of objets
        ArrayList<Bus> buses = new ArrayList<Bus>();

        // Now adding all the bus details as seperate objects
        buses.add(new Bus(1,true,2)); //Bus 1 details
        buses.add(new Bus(2,false,60)); //Bus 2 details
        buses.add(new Bus(3,true,55)); //Bus 3 details

        for(Bus b : buses ){
            b.displayBusInfo();
        }

        //creating objects for the bookings and saving it in arraylist of objects
        ArrayList<Booking> bookings = new ArrayList<Booking>();

        while (useropt ==1){
            System.out.println("Enter 1 to book or 2 to exit");
            useropt = sc.nextInt();
            if (useropt == 1) {
                System.out.println("Booking initiated...");
                Booking bookingobj = new Booking();
                //bookings.add(bookingobj);
                if (bookingobj.isAvailable(bookings, buses)){ //object booking should be checked with isAvailable method in booking class
                    bookings.add(bookingobj); //if true, we can add the booking in the array list bookings
                    System.out.println("Booking confirmed");
                    //System.out.println("Remaining Seats - " + bookingobj.remainingSeats(bookings,buses));

                }
                else {
                    System.out.println("Sorry Bus is Full. Try another bus or date");
                }
            }
        }
    }
}
