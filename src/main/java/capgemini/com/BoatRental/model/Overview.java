package capgemini.com.BoatRental.model;

public class Overview {
    private int numberOfBoat;
    private int  NumberOfSeats;
    private String	TotalTimeOfEndedTrips;
    private double  income;
    private double	TotalTime;
    private double TotalIncome;
    private int	NumOfOngoingTrips;
    private double AverDurationOfEndedTrips;

    public int getNumberOfBoat() {
        return numberOfBoat;
    }

    public void setNumberOfBoat(int numberOfBoat) {
        this.numberOfBoat = numberOfBoat;
    }

    public int getNumberOfSeats() {
        return NumberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        NumberOfSeats = numberOfSeats;
    }

    public String getTotalTimeOfEndedTrips() {
        return TotalTimeOfEndedTrips;
    }

    public void setTotalTimeOfEndedTrips(String totalTimeOfEndedTrips) {
        TotalTimeOfEndedTrips = totalTimeOfEndedTrips;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public double getTotalTime() {
        return TotalTime;
    }

    public void setTotalTime(double totalTime) {
        TotalTime = totalTime;
    }

    public double getTotalIncome() {
        return TotalIncome;
    }

    public void setTotalIncome(double totalIncome) {
        TotalIncome = totalIncome;
    }

    public int getNumOfOngoingTrips() {
        return NumOfOngoingTrips;
    }

    public void setNumOfOngoingTrips(int numOfOngoingTrips) {
        NumOfOngoingTrips = numOfOngoingTrips;
    }

    public double getAverDurationOfEndedTrips() {
        return AverDurationOfEndedTrips;
    }

    public void setAverDurationOfEndedTrips(double averDurationOfEndedTrips) {
        AverDurationOfEndedTrips = averDurationOfEndedTrips;
    }

    public int getNumberOfUsedBoats() {
        return NumberOfUsedBoats;
    }

    public void setNumberOfUsedBoats(int numberOfUsedBoats) {
        NumberOfUsedBoats = numberOfUsedBoats;
    }

    private int  NumberOfUsedBoats;
}
