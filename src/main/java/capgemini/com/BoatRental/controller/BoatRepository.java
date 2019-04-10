package capgemini.com.BoatRental.controller;

import capgemini.com.BoatRental.model.Boat;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BoatRepository extends CrudRepository<Boat,Long> {
    List<Boat> findAll();

    Boat findById(long id);
}

