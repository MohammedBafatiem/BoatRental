package capgemini.com.BoatRental.controller;

import capgemini.com.BoatRental.model.Trip;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TripRepository  extends CrudRepository<Trip, Long> {

    List<Trip> findAll();

    void deleteById(String id);
}

