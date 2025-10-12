package tn.esprit.tpfoyer.Service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.Model.Reservation;
import tn.esprit.tpfoyer.Repository.ReservationRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class ReservationServiceImp {
    ReservationRepository reservationRepository;
    
    public List<Reservation> retrieveAllReservations() {
        return reservationRepository.findAll();
    }

    
    public Reservation addReservation(Reservation r) {
        return reservationRepository.save(r);
    }

    
    public Reservation updateReservation(Reservation r) {
        return reservationRepository.save(r);
    }

    
    public Reservation retrieveReservation(Long idReservation) {
        return reservationRepository.findById(idReservation).get();
    }

    
    public void removeReservation(Long idReservation) {
        reservationRepository.deleteById(idReservation);
    }
}
