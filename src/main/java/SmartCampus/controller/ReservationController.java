package SmartCampus.controller;

import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import SmartCampus.db.RoomDB;
import SmartCampus.db.UserDB;
import SmartCampus.dto.ReservationDTO;
import SmartCampus.model.Reservation;
import SmartCampus.model.Room;
import SmartCampus.model.User;
import SmartCampus.service.ReservationService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/reservations")
public class ReservationController {

    private final ReservationService reservationService;
    private final RoomDB roomDB;
    private final UserDB userDB;

    public ReservationController(
            ReservationService reservationService,
            RoomDB roomDB,
            UserDB userDB) {

        this.reservationService = reservationService;
        this.roomDB = roomDB;
        this.userDB = userDB;
    }

    @GetMapping
    public Iterable<Reservation> getAllReservations() {
        return reservationService.getAllReservations();
    }

    @GetMapping("/{id}")
    public Optional<Reservation> getReservationById(
            @PathVariable("id") Long id) {

        return reservationService.getReservationById(id);
    }

    @PostMapping
    public ReservationDTO createReservation(
            @Valid @RequestBody ReservationDTO reservationDTO) {

        Room room = roomDB.findById(reservationDTO.roomId())
                .orElseThrow(() -> new RuntimeException("Room not found"));

        User user = userDB.findById(reservationDTO.userId())
                .orElseThrow(() -> new RuntimeException("User not found"));

        Reservation reservation = new Reservation(
                null,
                reservationDTO.startDateTime(),
                reservationDTO.endDateTime(),
                reservationDTO.status(),
                user,
                room
        );

        Reservation savedReservation =
                reservationService.createReservation(reservation);

        return toDTO(savedReservation);
    }

    @PutMapping("/{id}")
    public ReservationDTO updateReservation(
            @PathVariable("id") Long id,
            @Valid @RequestBody ReservationDTO reservationDTO) {

        Room room = roomDB.findById(reservationDTO.roomId())
                .orElseThrow(() -> new RuntimeException("Room not found"));

        User user = userDB.findById(reservationDTO.userId())
                .orElseThrow(() -> new RuntimeException("User not found"));

        Reservation reservation = new Reservation(
                id,
                reservationDTO.startDateTime(),
                reservationDTO.endDateTime(),
                reservationDTO.status(),
                user,
                room
        );

        Reservation updatedReservation =
                reservationService.updateReservation(reservation);

        return toDTO(updatedReservation);
    }

    @DeleteMapping("/{id}")
    public void deleteReservation(
            @PathVariable("id") Long id) {

        reservationService.deleteReservation(id);
    }

    public ReservationDTO toDTO(Reservation reservation) {
        return new ReservationDTO(
                reservation.getId(),
                reservation.getStartDateTime(),
                reservation.getEndDateTime(),
                reservation.getStatus(),
                reservation.getRoom().getId(),
                reservation.getUser().getId()
        );
    }
}