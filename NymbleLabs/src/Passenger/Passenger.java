package Passenger;

import Activity.*;

import java.util.ArrayList;
import java.util.List;

public class Passenger {
    public String passengerName;
    public long passengerNumber;
    public long balance;
    List<Activity> activitiesSigned;

    PassengerType passengerType;

    public Passenger(String passengerName, long passengerNumber, PassengerType passengerType){
        this.passengerName = passengerName;
        this.passengerNumber = passengerNumber;
        this.activitiesSigned = new ArrayList<>();
        this.balance = 100;
        this.passengerType = passengerType;
    }


    // getPassengerDetails returns the passenger details and all signed activities of the passenger
    public void getPassengerDetails(){
        System.out.println("Passenger Name : "+ this.passengerName);
        System.out.println("Passenger Number : "+ this.passengerNumber);
        System.out.println("Passenger Subscribed activities");
        getSignedActivityDetails();
    }

    /*
        getSignedActivityDetails method returns the details of the activities signed by the
        passenger and the cost they paid for the activity
     */
    public void getSignedActivityDetails(){
        this.activitiesSigned.forEach(activity -> {
            System.out.println("Activity Name" + activity.activityName);
            System.out.println("Activity Destination" + activity.destination);
            switch(this.passengerType){
                case GOLD:
                    System.out.println("Amount paid: "+ activity.cost);
                    break;
                case STANDARD:
                    int paidAmount = activity.cost - (int)(activity.cost * 0.1);
                    System.out.println("Amount paid: "+ paidAmount);
                    break;
                default:
                    System.out.println("No Amount Paid");

            }
        });
    }

    /*
        signToActivity method is used to add Passenger to the activities based on certain
        conditions like if activity cost less than passenger balance and the balance of the
        passenger is reduced based on the passenger type
     */
    public void signToActivity(Activity activity){
        if (activity.cost <= this.balance) {
            this.activitiesSigned.add(activity);
            switch(this.passengerType){
                case GOLD:
                    this.balance-=activity.cost;
                    break;
                case STANDARD:
                    int discountedAmount = activity.cost - (int)(activity.cost * 0.1);
                    this.balance = this.balance - discountedAmount;
                    break;
            }
            this.balance-=activity.cost;
        }
    }

}