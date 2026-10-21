package SmartCampus.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import SmartCampus.db.ReservationDB;
import SmartCampus.model.Reservation;

@Service
public class ReservationService {

    private final ReservationDB reservationDB;

    public ReservationService(ReservationDB reservationDB) {
        this.reservationDB = reservationDB;
    }

    public Iterable<Reservation> getAllReservations() {
        return reservationDB.findAll();
    }

    public Optional<Reservation> getReservationById(Long id) {
        return reservationDB.findById(id);
    }

    public Reservation createReservation(Reservation reservation) {
        return reservationDB.save(reservation);
    }

    public Reservation updateReservation(Reservation reservation) {
        return reservationDB.save(reservation);
    }

    public void deleteReservation(Long id) {
        reservationDB.deleteById(id);
    }
}