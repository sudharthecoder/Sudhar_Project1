package BusResvRevamp;

import org.w3c.dom.ls.LSOutput;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;

public class Booking {
    int busNo;
    String passengerName;
    LocalDate date;
    int askingSeats;
    int bookedSeats =0;
    int availableSeats = 0;
    LocalDate userDate;
    String userDate2;
    int remainingSeats;
    int Capacity = 0;
    Booking() throws ParseException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Passenger name");
        passengerName = sc.next();

        System.out.println("Enter the Bus Number");
        busNo = sc.nextInt();

        System.out.println("Enter the Travelling Date in the format dd-MM-yyyy");
        String dateInput = sc.next();
        System.out.println(dateInput);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        //SimpleDateFormat sdate = new SimpleDateFormat(dateInput);
        try {
            // Parse the user's input into a LocalDate object
            userDate = LocalDate.parse(dateInput, formatter);
            userDate2 = userDate.format(formatter);

        } catch (DateTimeParseException e) {
            System.out.println("Invalid date format. Please enter the date in dd-MM-yyyy format.");
        }
        if( date == null ){
            this.date = userDate;
        }

        System.out.println("Enter the total no.of seats required");
        askingSeats = sc.nextInt();
    }

    public boolean isAvailable(ArrayList<Bus>buses, ArrayList<Booking>bookings){
        if (askingSeats < remainingSeats(buses, bookings)){
            bookedSeats = bookedSeats + askingSeats;
            System.out.println("final booked Seats are " + bookedSeats);
            remainingSeats = Capacity - bookedSeats;
            System.out.println("Remaining seats are " + remainingSeats);
            //finally changing the remaining seats into capacity for the next booking on same date
            Capacity = remainingSeats;

            return true;
        }
        else{
            return false;
        }
    }


    public int remainingSeats(ArrayList<Bus>buses, ArrayList<Booking>bookings){
        //To check the capacity of the bus no

        for (Bus bu : buses){
            if(bu.getBusNo() == busNo){
                Capacity = bu.getCap();
                System.out.println(Capacity);
            }
        }
        //To check the no.of available seats bus in bus with same busno we asked on that same date in bookings arraylist

        System.out.println("already Booked seats " + bookedSeats);
        for(Booking bo : bookings){
            if(bo.busNo == busNo && bo.date.equals (userDate)) {
                availableSeats = Capacity - bookedSeats;
                System.out.println("Available Seats are " + availableSeats);

            }
        }


    return availableSeats;
    }




}