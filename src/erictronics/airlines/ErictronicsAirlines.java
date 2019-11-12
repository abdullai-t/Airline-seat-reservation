package erictronics.airlines;

import java.util.ArrayList;
import java.util.Stack;
import javax.swing.JOptionPane;

/**
 * * @author tachyon
 */
public class ErictronicsAirlines {

    public static void main(String[] args) {
        // Arraylist for SeatReservation with a name of seatReserved
        ArrayList<SeatReservation> seatReserved = new ArrayList<>();
        //object of class SeatReservation
        SeatReservation seat;
        String name, email, telNum, destination, seatNum;

        // plane culumn array
        String[] col = {"A", "B", "C", "D"};

        // row array 
        String[] row = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        // total seats
        Stack<String> totalSeats = new Stack<>();
        //booked seats
        Stack<String> bookedSeats = new Stack<>();

        for (String row1 : row) {
            for (String col1 : col) {
                totalSeats.push(col1 + row1);
            }
        }

        do {
            name = JOptionPane.showInputDialog("Enter Name or * to quit");
            if ("*".equals(name)) {
                break;
            }
            email = JOptionPane.showInputDialog("Enter Email");
            telNum = JOptionPane.showInputDialog("Enter Tell No.");
            destination = JOptionPane.showInputDialog("Enter Destination");
            seatNum = JOptionPane.showInputDialog("Enter Seat Number: (A1,B1,C1, D1, A2 . to D10)");

            if (bookedSeats.contains(seatNum)) {
                System.out.println("seat is already booked");
            } else {
                bookedSeats.push(seatNum);
            }
            seat = new SeatReservation(name, email, telNum, destination, seatNum);
            seatReserved.add(seat);
            
            System.out.println("\n******************************************* flight reservation Info. *******************************************");
            totalSeats.removeAll(bookedSeats);
            System.out.println("Total available seats: " + totalSeats);
            System.out.println("Total booked seats: " + bookedSeats);
            
        } while (true);
        System.out.println("\n******************************************* Passanger's Info. *******************************************");
        seatReserved.forEach((passanger) -> {
            System.out.println(passanger);
        });

    }

}
