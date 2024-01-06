package Activity;


public class Activity {
    public String activityName;
    public int cost;
    public String description;
    public int capacity;
    public int remainingCapacity;

    public String destination;

    public Activity(String activityName, int cost, String description, int capacity, String destination) {
        this.activityName = activityName;
        this.cost = cost;
        this.description = description;
        this.capacity = capacity;
        this.remainingCapacity = capacity;
        this.destination = destination;
    }

}