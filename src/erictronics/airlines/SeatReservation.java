
package erictronics.airlines;

/**
 * @author tachyon
 */
public class SeatReservation {
    private final String name;
    private final String email;
    private final String telNum;
    private final String destination;
    private final String seatNum;


    public SeatReservation(String name, String email, String telNum, String destination, String seatNum) {
        this.name = name;
        this.email = email;
        this.telNum = telNum;
        this.destination = destination;
        this.seatNum = seatNum;
    }



    @Override
    public String toString() {
        return "\nSeatReservation details \n" + "Name: " + name + "\nEmail: " + email + "\nTell No.: " + telNum + "\nDestination: " + destination +"\nSeat Number: " + seatNum;
    
    }
    
    
    
}
