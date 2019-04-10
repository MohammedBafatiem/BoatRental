package capgemini.com.BoatRental.api;

import capgemini.com.BoatRental.controller.BoatRepository;
import capgemini.com.BoatRental.controller.GuestRepository;
import capgemini.com.BoatRental.controller.ReservationRepository;
import capgemini.com.BoatRental.model.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

public class ReservationEndPoint {

    @RestController

    public class ReservationController {


        @Autowired
        private ReservationRepository reservationRepository;
        @Autowired
        private BoatRepository tableRepository;
        @Autowired
        private GuestRepository guestRepository;



        @RequestMapping(value = "/get-reservation", method = RequestMethod.GET)
        public List<Reservation> getAll() {
            return reservationRepository.findAll();
        }

        @RequestMapping(value = "/save-reservation", method = RequestMethod.POST, consumes = "application/json")
        public void saveReservation(@RequestBody Reservation reservation) {


            reservationRepository.save(reservation);
        }

        @RequestMapping(value = "/delete-reservation", method = RequestMethod.DELETE, consumes = "application/json")
        public void deleteReservation(@RequestBody Reservation reservation) {
            reservationRepository.deleteById(reservation.getId());

        }



        }

















}
