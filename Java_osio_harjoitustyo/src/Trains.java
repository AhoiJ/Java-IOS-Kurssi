
public class Trains {

    private String station;
   private int arrived_trains;
   private int arriving_trains;
   private int departed_trains;
   private int departing_trains;
   private boolean include_nonstopping;
   private int version;

    public Trains(String station, int arrived_trains, int arriving_trains, int departed_trains, int departing_trains, boolean include_nonstopping, int version) {
        this.station = station;
        this.arrived_trains = arrived_trains;
        this.arriving_trains = arriving_trains;
        this.departed_trains = departed_trains;
        this.departing_trains = departing_trains;
        this.include_nonstopping = include_nonstopping;
        this.version = version;
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public int getArrived_trains() {
        return arrived_trains;
    }

    public void setArrived_trains(int arrived_trains) {
        this.arrived_trains = arrived_trains;
    }

    public int getArriving_trains() {
        return arriving_trains;
    }

    public void setArriving_trains(int arriving_trains) {
        this.arriving_trains = arriving_trains;
    }

    public int getDeparted_trains() {
        return departed_trains;
    }

    public void setDeparted_trains(int departed_trains) {
        this.departed_trains = departed_trains;
    }

    public int getDeparting_trains() {
        return departing_trains;
    }

    public void setDeparting_trains(int departing_trains) {
        this.departing_trains = departing_trains;
    }

    public boolean isInclude_nonstopping() {
        return include_nonstopping;
    }

    public void setInclude_nonstopping(boolean include_nonstopping) {
        this.include_nonstopping = include_nonstopping;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "Trains{" +
                "station='" + station + '\'' +
                ", arrived trains='" + arrived_trains + '\'' +
                ", arriving trains='" + arriving_trains + '\'' +
                ", departed trains=" + departed_trains +
                ", departing trains='" + departing_trains + '\'' +
                ", nonstopping='" + include_nonstopping + '\'' +
                ", version='" + version + '\'' +
                '}';
    }


}
