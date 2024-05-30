
import java.io.*;
import java.util.*;

/**
 * 
 */
public class Reservation {

    /**
     * Default constructor
     */
    public Reservation() {
    }

    /**
     * 
     */
    public String accountNumber = -99;

    /**
     * 
     */
    public Address physicalAddress;

    /**
     * 
     */
    public Address mailingAddress;

    /**
     * 
     */
    public Date reservationStartDate;

    /**
     * 
     */
    public int numberOfNights;

    /**
     * 
     */
    public int numberOfBeds = 2;

    /**
     * 
     */
    public int numberOfBedrooms = 1;

    /**
     * 
     */
    public int numberOfBathrooms = 1;

    /**
     * 
     */
    public int sizeSqFt;

    /**
     * 
     */
    public float priceOfReservation;

    /**
     * 
     */
    public ReservationStatus reservationStatus = ReservationStatus.DRAFT;

    /**
     * 
     */
    public ReservationType reservationType;

    /**
     * 
     */
    public String reservationNumber;

    /**
     * @param reservationNumber
     */
    public void calculateFullPrice(String reservationNumber) {
        // TODO implement here
    }

    /**
     * 
     */
    public void toString() {
        // TODO implement here
    }

    /**
     * 
     */
    public void createNewReservation() {
        // TODO implement here
    }

    /**
     * @param reservationNumber
     */
    public void calculatePricePerNight(String reservationNumber) {
        // TODO implement here
    }

}