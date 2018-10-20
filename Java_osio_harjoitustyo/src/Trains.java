
public class Trains {

    private int trainNumber;
   private String departureDate;

    public Trains(int trainNumber, String departureDate) {
        this.trainNumber = trainNumber;
        this.departureDate = departureDate;

    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public String getdepartudeDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate){
    this.departureDate = departureDate;
    }


    @Override
    public String toString() {
        return "Train{" +
                " train number='" + trainNumber + '\'' +
                ", departure date ='" + departureDate + '\'' +
                '}';
    }


}
