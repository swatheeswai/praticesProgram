import java.util.*;

class Taxi {
    private static int idCounter = 1;
    int id;
    char currentLocation;
    int totalEarnings;
    List<Booking> bookings;

    public Taxi() {
        this.id = idCounter++;
        this.currentLocation = 'A';
        this.totalEarnings = 0;
        this.bookings = new ArrayList<>();
    }

    public boolean isAvailable(int pickupTime) {
        if (bookings.isEmpty()) return true;
        Booking lastBooking = bookings.get(bookings.size() - 1);
        return lastBooking.dropTime <= pickupTime;
    }

    public void addBooking(Booking booking) {
        bookings.add(booking);
        totalEarnings += booking.amount;
        currentLocation = booking.dropPoint;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Taxi-").append(id).append(" Total Earnings: Rs. ").append(totalEarnings).append("\n");
        sb.append("BookingID\tCustomerID\tFrom\tTo\tPickupTime\tDropTime\tAmount\n");
        for (Booking b : bookings) {
            sb.append(b).append("\n");
        }
        return sb.toString();
    }
}

class Booking {
    private static int bookingIdCounter = 1;
    int bookingId;
    int customerId=1;
    char pickupPoint;
    char dropPoint;
    int pickupTime;
    int dropTime;
    int amount;

    public Booking( char pickupPoint, char dropPoint, int pickupTime) {
        this.bookingId = bookingIdCounter++;
        this.customerId = customerId++;
        this.pickupPoint = pickupPoint;
        this.dropPoint = dropPoint;
        this.pickupTime = pickupTime;
        
        int distance = Math.abs(dropPoint - pickupPoint) * 15;
        this.amount = 100 + (distance > 5 ? (distance - 5) * 10 : 0);
        this.dropTime = pickupTime + Math.abs(dropPoint - pickupPoint);
    }

    @Override
    public String toString() {
        return bookingId + "\t" + customerId + "\t" + pickupPoint + "\t" + dropPoint + "\t" + pickupTime + "\t" + dropTime + "\t" + amount;
    }
}

class TaxiService {
    List<Taxi> taxis;

    public TaxiService(int numberOfTaxis) {
        taxis = new ArrayList<>();
        for (int i = 0; i < numberOfTaxis; i++) {
            taxis.add(new Taxi());
        }
    }

    public void bookTaxi( char pickupPoint, char dropPoint, int pickupTime) {
        Taxi allocatedTaxi = findAvailableTaxi(pickupPoint, pickupTime);
        if (allocatedTaxi == null) {
            System.out.println("Booking Rejected! No taxis available at this time.");
            return;
        }

        Booking booking = new Booking( pickupPoint, dropPoint, pickupTime);
        allocatedTaxi.addBooking(booking);
        System.out.println("Taxi can be allotted.");
        System.out.println("Taxi-" + allocatedTaxi.id + " is allotted.");
    }

    private Taxi findAvailableTaxi(char pickupPoint, int pickupTime) {
        Taxi bestTaxi = null;
        int minDistance = Integer.MAX_VALUE;
        int minEarnings = Integer.MAX_VALUE;

        for (Taxi taxi : taxis) {
            if (taxi.isAvailable(pickupTime)) {
                int distance = Math.abs(taxi.currentLocation - pickupPoint);
                if (distance < minDistance || (distance == minDistance && taxi.totalEarnings < minEarnings)) {
                    bestTaxi = taxi;
                    minDistance = distance;
                    minEarnings = taxi.totalEarnings;
                }
            }
        }
        return bestTaxi;
    }

    public void displayTaxiDetails() {
        for (Taxi taxi : taxis) {
            System.out.println(taxi);
        }
    }
}

public class TaxiBookingProject {
    public static void main(String[] args) {
        TaxiService taxiService = new TaxiService(4);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Book Taxi\n2. Display Taxi Details\n3. Exit");
            int choice = scanner.nextInt();
            if (choice == 1) {
                
                System.out.print("Enter Pickup Point (A-F): ");
                char pickupPoint = scanner.next().charAt(0);
                System.out.print("Enter Drop Point (A-F): ");
                char dropPoint = scanner.next().charAt(0);
                System.out.print("Enter Pickup Time (hours): ");
                int pickupTime = scanner.nextInt();
                taxiService.bookTaxi( pickupPoint, dropPoint, pickupTime);
            } else if (choice == 2) {
                taxiService.displayTaxiDetails();
            } else {
                break;
            }
        }
        scanner.close();
    }
}

