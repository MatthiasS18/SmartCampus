package SmartCampus.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import SmartCampus.db.RoomDB;
import SmartCampus.model.Room;

@Service
public class RoomService {

    private final RoomDB roomDB;

    public RoomService(RoomDB roomDB) {
        this.roomDB = roomDB;
    }

    public Iterable<Room> getAllRooms() {
        return roomDB.findAll();
    }

    public Optional<Room> getRoomById(Long id) {
        return roomDB.findById(id);
    }

    public Room createRoom(Room room) {
        return roomDB.save(room);
    }

    public Room updateRoom(Room room) {
        return roomDB.save(room);
    }

    public void deleteRoom(Long id) {
        roomDB.deleteById(id);
    }
}