package SmartCampus.controller;

import java.util.Optional;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;
import SmartCampus.dto.RoomDTO;
import SmartCampus.model.Room;
import SmartCampus.service.RoomService;
import jakarta.validation.Valid;


@RestController
@RequestMapping("/api/rooms")
@CrossOrigin("*")
public class RoomController {

    private final RoomService roomService;

    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    @GetMapping
    public Iterable<RoomDTO> getAllRooms() {
        Iterable<Room> rooms = roomService.getAllRooms();
    
        List<RoomDTO> roomDTOs = new ArrayList<>();
    
        for (Room room : rooms) {
            roomDTOs.add(toDTO(room));
        }
    
        return roomDTOs;
    }

    @GetMapping("/{id}")
    public RoomDTO getRoomById(@PathVariable("id") Long id) {
        Optional<Room> room = roomService.getRoomById(id);

        return room.map(this::toDTO)
                .orElseThrow(() -> new RuntimeException("Room not found"));
    }

    @PostMapping
    public RoomDTO createRoom(@Valid @RequestBody RoomDTO roomDTO) {

        Room room = new Room(
                null,
                roomDTO.name(),
                roomDTO.building(),
                roomDTO.floor(),
                roomDTO.capacity(),
                null,
                null,
                null
        );

        Room savedRoom = roomService.createRoom(room);

        return toDTO(savedRoom);
    }

    @PutMapping("/{id}")
    public RoomDTO updateRoom(
            @PathVariable("id") Long id,
            @Valid @RequestBody RoomDTO roomDTO) {

        Room room = new Room(
                id,
                roomDTO.name(),
                roomDTO.building(),
                roomDTO.floor(),
                roomDTO.capacity(),
                null,
                null,
                null
        );

        Room updatedRoom = roomService.updateRoom(room);

        return toDTO(updatedRoom);
    }

    @DeleteMapping("/{id}")
    public void deleteRoom(@PathVariable("id") Long id) {
        roomService.deleteRoom(id);
    }

    private RoomDTO toDTO(Room room) {
        return new RoomDTO(
                room.getId(),
                room.getName(),
                room.getBuilding(),
                room.getFloor(),
                room.getCapacity()
        );
    }
}