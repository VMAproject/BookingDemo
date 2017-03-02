package booking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class DatabaseSeeder implements CommandLineRunner {

    private BookingRepository bookingRepository;

    @Autowired
    public DatabaseSeeder(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    @Override
    public void run(String... strings) throws Exception {

        List<HotelBooking> bookings = new ArrayList<>();

        bookings.add(new HotelBooking("Mariot", 12.2, 4, 1200));
//        bookings.add(new HotelBooking("Hilton", 12.2, 2));
//        bookings.add(new HotelBooking("Zirka", 500, 1));

        bookingRepository.save(bookings);

    }
}
