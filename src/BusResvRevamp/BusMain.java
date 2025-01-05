package BusResvRevamp;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class BusMain {
    public static void main (String[] Args) throws ParseException {
        int userOpt = 1;
        Scanner sc = new Scanner(System.in);

        //Create a arraylist for the object in bus class
        ArrayList<Bus> buses = new ArrayList<Bus>();

        //Now adding all the bus details in the arraylist
        buses.add(new Bus(1,false,5));
        buses.add(new Bus(2, true,60));
        buses.add(new Bus(3, true, 60));
        for (Bus e : buses){
            e.displayBusInfo();
        }

        //creating objects for booking class and saving it in arraylist of objects
        ArrayList<Booking> bookings = new ArrayList<Booking>();

        while(userOpt==1){
            System.out.println("Enter 1 to book and 2 to exit");
            userOpt = sc.nextInt();
            if(userOpt==1) {
                System.out.println("Booking initiated");
                Booking bookingobj = new Booking();
                bookings.add(bookingobj);
                if(bookingobj.isAvailable(buses,bookings)){
                    bookings.add(bookingobj);
                    System.out.println("Booking confirmed for the " + bookingobj.busNo + " For the Date " + bookingobj.userDate2 + " And the remaining seats are  " + bookingobj.remainingSeats);

                }
                else{
                    System.out.println("Sorry Bus is full, Try another bus or Date");
                }
            }
        }
    }
}
