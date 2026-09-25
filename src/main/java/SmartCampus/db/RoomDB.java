package SmartCampus.db;

import org.springframework.data.repository.CrudRepository;

import SmartCampus.model.Room;

public interface RoomDB extends CrudRepository<Room, Long> {
    
}
