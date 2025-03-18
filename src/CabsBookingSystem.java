import com.sachin.controller.CabController;


public class CabsBookingSystem {
        public static void main(String[] args) {
            CabController cabController = new CabController();

            // Booking Rides
            cabController.bookCab("U101", 10);
            cabController.bookCab("U102", 8);

            // Display Available Cabs
            cabController.showAvailableCabs();

            // Display Ride History
            cabController.showRideHistory();

            // Display Cabs with Contact Numbers
            cabController.showCabsWithContacts();
        }
    }
