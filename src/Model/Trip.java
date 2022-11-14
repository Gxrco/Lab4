package Model;

/**
 * The type Trip.
 */
public class Trip {
    private String day;
    private String hour;
    private String place;
    private String lenght;
    private String objective;

    /**
     * Instantiates a new Trip.
     *
     * @param _day       the day
     * @param _hour      the hour
     * @param _place     the place
     * @param _length    the length
     * @param _objective the objective
     */
    public Trip(String _day, String _hour, String _place, String _length, String _objective){
        day = _day;
        hour = _hour;
        place = _place;
        lenght = _length;
        objective = _objective;
    }


    /**
     * Gets day.
     *
     * @return the day
     */
    public String getDay() {
        return day;
    }

    /**
     * Sets day.
     *
     * @param day the day
     */
    public void setDay(String day) {
        this.day = day;
    }

    /**
     * Gets hour.
     *
     * @return the hour
     */
    public String getHour() {
        return hour;
    }

    /**
     * Sets hour.
     *
     * @param hour the hour
     */
    public void setHour(String hour) {
        this.hour = hour;
    }

    /**
     * Gets place.
     *
     * @return the place
     */
    public String getPlace() {
        return place;
    }

    /**
     * Sets place.
     *
     * @param place the place
     */
    public void setPlace(String place) {
        this.place = place;
    }

    /**
     * Gets lenght.
     *
     * @return the lenght
     */
    public String getLenght() {
        return lenght;
    }

    /**
     * Sets lenght.
     *
     * @param lenght the lenght
     */
    public void setLenght(String lenght) {
        this.lenght = lenght;
    }

    /**
     * Gets objective.
     *
     * @return the objective
     */
    public String getObjective() {
        return objective;
    }

    /**
     * Sets objective.
     *
     * @param objective the objective
     */
    public void setObjective(String objective) {
        this.objective = objective;
    }

    @Override
    public String toString() {
        return day+" - "+hour+" : "+place+": "+lenght+" : "+objective;
    }
}
