package tn.esprit.tpfoyer.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.Model.Reservation;
import tn.esprit.tpfoyer.Service.ReservationServiceImp;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/reservations")
public class ReservationController {
    ReservationServiceImp reservationService;

    @GetMapping("/all")
    public List<Reservation> getReservations() {
        List<Reservation> listReservations = reservationService.retrieveAllReservations();
        return listReservations;
    }

    @PostMapping("/add")
    public Reservation addReservation(@RequestBody Reservation r) {
        Reservation reservation = reservationService.addReservation(r);
        return reservation;
    }

    @PutMapping("/update")
    public Reservation updateReservation(@RequestBody Reservation r) {
        Reservation reservation = reservationService.updateReservation(r);
        return reservation;
    }

    @GetMapping("/retrieve/{idReservation}")
    public Reservation retrieveReservation(@PathVariable("idReservation") Long idReservation) {
        return reservationService.retrieveReservation(idReservation);
    }

    @DeleteMapping("/remove/{idReservation}")
    public void removeReservation(@PathVariable("idReservation") Long idReservation) {
        reservationService.removeReservation(idReservation);
    }
}
