package capgemini.com.BoatRental.model;

public class Boat {
    private int BoatNummber;
    private float minPrice;
    private int NumberOfSeat;
    private float actPrice;

    public int getNumberOfSeat() {
        return NumberOfSeat;
    }

    public void setNumberOfSeat(int numberOfSeat) {
        NumberOfSeat = numberOfSeat;
    }

    public int getBoatNummber() {
        return BoatNummber;
    }

    public void setBoatNummber(int boatNummber) {
        BoatNummber = boatNummber;
    }

    public float getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(float minPrice) {
        this.minPrice = minPrice;
    }

    public float getActPrice() {
        return actPrice;
    }

    public void setActPrice(float actPrice) {
        this.actPrice = actPrice;
    }


}
