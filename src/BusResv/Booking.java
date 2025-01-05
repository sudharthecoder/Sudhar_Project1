package BusResv;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class Booking {
    int busNo;
    String passengerName;
    Date date;
    //int askingSeats;

    Booking() { //constructor for assigning the values
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Passenger name");
        passengerName = sc.next();
        System.out.println("Enter the Bus Number");
        busNo = sc.nextInt();
        System.out.println("Enter the Travelling Date in the format dd-MM-yyyy");
        String dateInput = sc.next(); // entered date from user can be got as a string by scanner class
        SimpleDateFormat sDate = new SimpleDateFormat(dateInput); //converting the string to date using SimpleDateFormat class

        try {
            date = sDate.parse(dateInput);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        //System.out.println("Enter the Total no.of seats required");
        //askingSeats = sc.nextInt();
    }

    public boolean isAvailable(ArrayList<Booking> bookings, ArrayList<Bus> buses) {

        //return askingSeats < remainingSeats(bookings, buses) ;
        int capacity = 0;
        for (Bus bus : buses)
        {
            if (bus.getBusNo() == this.busNo)
            {
                capacity = bus.getCap();
            }
        }
        int bookedSeats = 0;
        for (Booking b : bookings)
        {
            if (b.busNo == this.busNo && b.date.equals(this.date)) {
                bookedSeats  = bookedSeats + 1;
                //bookedSeats = bookedSeats + b.askingSeats;
            }

        }
        return bookedSeats < capacity ? true:false;
    }
}

//    public int remainingSeats(ArrayList<Booking> bookings, ArrayList<Bus> buses) {
//        int capacity = 0;
//        int bookedSeats = 0;
//        for (Bus bus : buses)
//        {
//            if (bus.getBusNo() == this.busNo)
//            {
//                    capacity = bus.getCap();
//            }
//        }
//
//        System.out.println(bookings);
//        for (Booking b : bookings)
//        {
//            if (b.busNo == busNo && b.date.equals(date)) {
//                 bookedSeats  = bookedSeats + 1;
//                //bookedSeats = bookedSeats + b.askingSeats;
//            }
//
//        }
//        System.out.println(capacity);
//        System.out.println(bookedSeats);
//        return capacity-bookedSeats;
//
//    }


