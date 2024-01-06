import java.util.ArrayList;
import java.util.List;


import Passenger.*;
import Destination.*;

public class TravelPackage {
    String packageName;
    int passengerCapacity;
    int passengerEnrolled;
    List<Destination> destinations;
    List<Passenger> passengers;

    public TravelPackage(String packageName, int passengerCapacity, List<Destination> destinations) {
        this.packageName = packageName;
        this.passengerCapacity = passengerCapacity;
        this.destinations = destinations;
        this.passengerEnrolled = 0;
        this.passengers = new ArrayList<Passenger>();
    }

    /*
    * getItinerary method returns the basic details of the travel package like packageName,packageCapacity,
    * destinations covered in the package
    * and activities associated with the destinations
    * */
    public void getItinerary() {
        System.out.println("Package Name : " + this.packageName);
        System.out.println("Passenger Capacity : " + this.passengerCapacity);
        System.out.println("Destinations Covered in the trip");
        this.destinations.forEach(destination -> {
            System.out.println("Location : " + destination.destinationName);
            System.out.println("Activities");
            destination.activities.printAllActivities();
        });
    }

    /*
     * addPassenger method add the passenger to the
     * travel package if still there is space for the new customer
     * */
    public void addPassenger(Passenger passenger) {
        if(this.passengerEnrolled < this.passengerCapacity) {
            this.passengers.add(passenger);
            this.passengerEnrolled++;
        }
    }

    /*
     * getPassengerList method returns the basic details of the travel package like packageName,packageCapacity,
     * passengers enrolled in the package
     * and the passenger details
     * */
    public void getPassengerList(){
        System.out.println("Package Name : " + this.packageName);
        System.out.println("Passenger Capacity : " + this.passengerCapacity);
        System.out.println("Passenger Enrolled : " + this.passengerEnrolled);
        this.passengers.forEach(passenger -> {
            System.out.println("Passenger Name: " + passenger.passengerName);
            System.out.println("Passenger Number: "+ passenger.passengerNumber);
        });
    }

    // findPassengerByPassengerNumber method is a helper method used to find a particular passenger by passengerNumber
    private Passenger findPassengerByPassengerNumber(List<Passenger> passengers, long passengerNumber){
        for (Passenger passenger : passengers) {
            if (passenger.passengerNumber == passengerNumber) {
                return passenger;
            }
        }
        return null;

    }

    // getPassengerDetail method returns passenger details and the activities they have signed
    public void getPassengerDetail(long passengerNumber){
        Passenger requestedPassenger = findPassengerByPassengerNumber(this.passengers, passengerNumber);
        if (requestedPassenger != null) {
            System.out.println("PassengerNumber : "+ requestedPassenger.passengerNumber);
            System.out.println("PassengerName : "+ requestedPassenger.balance);
            requestedPassenger.getSignedActivityDetails();

        }

    }
}
