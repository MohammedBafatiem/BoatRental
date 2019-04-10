package capgemini.com.BoatRental.model;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Access(AccessType.PROPERTY)
    private Long id;

    @Column(name = "reservationtime")
    private LocalDateTime reservationTime;
    //private Boat boat;
    //@ManyToMany
    //@JoinBoat(name = "boatreservation",
      //      joinColumns = {@JoinColumn(name = "reservationid")},
    //inverseJoinColumns = {@JoinColumn(name = "boatid")})
    private List<Boat> boat;

    public List<Boat> getboat() {
        return boat;
    }

    public void setboat(List<Boat> boat) {
        this.boat = boat;
    }


    @JoinColumn(name = "guestid", referencedColumnName = "id")
    @OneToOne

    private Guest guest;
    @Column(name = "numberofperson")
    private int numberOfPerson;




    public int getNumberOfperson() {
        return numberOfPerson;
    }


    public LocalDateTime getReservationTime() {
        return reservationTime;
    }

    public void setReservationTime(LocalDateTime reservationTime) {
        this.reservationTime = reservationTime;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }


    public int getNumberOfPerson() {
        return numberOfPerson;
    }

    public void setNumberOfPerson(int numberOfPerson) {
        this.numberOfPerson = numberOfPerson;
    }
}
