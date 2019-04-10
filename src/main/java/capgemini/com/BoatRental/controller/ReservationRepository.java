package capgemini.com.BoatRental.controller;

import capgemini.com.BoatRental.model.Reservation;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ReservationRepository  extends CrudRepository<Reservation, Long> {

    List<Reservation> findAll();

    void deleteById(String id);
}
