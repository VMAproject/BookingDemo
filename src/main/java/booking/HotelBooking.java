package booking;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class HotelBooking {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    private String hotelName;
    private double pricePerNight;
    private int nbOfNights;
    private double totalPrice;


    public HotelBooking() {
    }


    public HotelBooking(String hotelName, double pricePerNight, int nbOfNights, double totalPrice) {
        this.hotelName = hotelName;
        this.pricePerNight = pricePerNight;
        this.nbOfNights = nbOfNights;
        this.totalPrice = totalPrice;
    }
}
