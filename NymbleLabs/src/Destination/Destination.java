package Destination;

import Activity.ActivitiesList;

public class Destination {
    public String destinationName;
    public ActivitiesList activities;
    public Destination (String destinationName, ActivitiesList activites) {
        this.destinationName = destinationName;
        this.activities = activites;
    }
}
