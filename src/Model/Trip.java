package Model;

public class Trip {
    private String day;
    private String hour;
    private String place;
    private String lenght;
    private String objective;

    public Trip(String _day, String _hour, String _place, String _length, String _objective){
        day = _day;
        hour = _hour;
        place = _place;
        lenght = _length;
        objective = _objective;
    }


    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getLenght() {
        return lenght;
    }

    public void setLenght(String lenght) {
        this.lenght = lenght;
    }

    public String getObjective() {
        return objective;
    }

    public void setObjective(String objective) {
        this.objective = objective;
    }

    @Override
    public String toString() {
        return day+" - "+hour+" : "+place+": "+lenght+" : "+objective;
    }
}
