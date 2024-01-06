package Activity;

import java.util.ArrayList;
import java.util.List;



public class ActivitiesList {
    public List<Activity> activities;

    public ActivitiesList() {
        this.activities = new ArrayList<>();
    }

    public void addActivity(Activity activity) {
        this.activities.add(activity);
    }

    /*
        printAllAvailableActivities method returns all the basic details of the activity
        if there is available seats in the activity
     */

    public void printAllAvailableActivities(){
        this.activities.forEach(activity -> {
            if (activity.remainingCapacity > 0) {
                System.out.println("Activity Name :" + activity.activityName);
                System.out.println("Activity Cost :" + activity.cost);
                System.out.println("Activity Description :" + activity.description);
                System.out.println("Activity Actual Capacity :" + activity.capacity);
                System.out.println("Activity Remaining Capacity :" + activity.remainingCapacity);
            }
        });

    }

    // printAllActivities method returns all the basic details of the activity
    public void printAllActivities(){
        this.activities.forEach(activity -> {
            System.out.println("Activity Name :" + activity.activityName);
            System.out.println("Activity Cost :" + activity.cost);
            System.out.println("Activity Description :" + activity.description);
            System.out.println("Activity Capacity :" + activity.capacity);
        });
    }
}
