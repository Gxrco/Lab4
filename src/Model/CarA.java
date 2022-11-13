package Model;

import java.util.ArrayList;

public class CarA extends CarB implements ICarA{

    private boolean speakerStatus;

    private ArrayList<Trip> Ptrips = new ArrayList<>();

    @Override
    public boolean getSpeakerStatus() {
        return this.speakerStatus;
    }

    @Override
    public boolean ChangeSpeakerStatus() {
        speakerStatus = !speakerStatus;
        return this.speakerStatus;
    }

    @Override
    public String TripPlanification(String tripday, String tripHour_, String tripPlace, String tripLength, String tripObjective) {
        Trip trip = new Trip(tripday, tripHour_, tripPlace, tripLength, tripObjective);
        Ptrips.add(trip);
        return trip.toString();
    }

    public ArrayList<Trip> getPtrips() {
        return Ptrips;
    }
}
