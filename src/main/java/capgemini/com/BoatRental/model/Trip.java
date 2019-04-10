package capgemini.com.BoatRental.model;

public class Trip {
    private int NimberOfPerson;
    private Boat boat;

    public int getNimberOfPerson() {
        return NimberOfPerson;
    }

    public void setNimberOfPerson(int nimberOfPerson) {
        NimberOfPerson = nimberOfPerson;
    }

    public Boat getBoat() {
        return boat;
    }

    public void setBoat(Boat boat) {
        this.boat = boat;
    }
}
