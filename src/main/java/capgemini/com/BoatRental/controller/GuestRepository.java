package capgemini.com.BoatRental.controller;

import capgemini.com.BoatRental.model.Guest;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface GuestRepository extends CrudRepository<Guest,Long> {
    List<Guest> findAll();
    Guest findById(long id);


}
