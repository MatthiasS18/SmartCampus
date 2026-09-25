package SmartCampus.db;

import org.springframework.data.repository.CrudRepository;

import SmartCampus.model.Reservation;

public interface ReservationDB extends CrudRepository<Reservation, Long> {
    
}
