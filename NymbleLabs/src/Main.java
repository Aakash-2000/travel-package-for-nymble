/**
 * The Travel Package program implements an application that
 * helps to add passenger to a travels package and sign the passengers to the activities available in each destination covered in the trip.
 *
 * @author  Aakash G S
 * @version 1.0
 */

import java.util.ArrayList;
import java.util.List;

import Activity.*;
import Destination.*;
import Passenger.*;

public class Main {
    public static void main(String args[]) {

        // Manually creating instansce for the activities and other entities needed for travel package
        Activity activity1 = new Activity("Sky Diving", 100, "Explore the sky", 50, "Kodaikanal");
        Activity activity2 = new Activity("boat ride", 20, "Explore the ocean", 50, "Kodaikanal");
        ActivitiesList activitiesForDestination1 = new ActivitiesList();
        activitiesForDestination1.addActivity(activity1);
        activitiesForDestination1.addActivity(activity2);


        Destination destination1 = new Destination("kodaikanal", activitiesForDestination1);

        List<Destination> destinationsForPackage1 = new ArrayList<Destination>();
        destinationsForPackage1.add(destination1);

        TravelPackage package1 = new TravelPackage("Package 1", 20, destinationsForPackage1);
        package1.getItinerary();

        // adding passenger to the travel package
        package1.addPassenger(new Passenger("Aakash", 109, PassengerType.GOLD));
        package1.addPassenger(new Passenger("Mukesh", 110, PassengerType.STANDARD));

        //getPassengerList returns all the passengers signed for the package
        package1.getPassengerList();
        //getPassengerDetail returns all details of particular passenger
        package1.getPassengerDetail(109);



    }
}
