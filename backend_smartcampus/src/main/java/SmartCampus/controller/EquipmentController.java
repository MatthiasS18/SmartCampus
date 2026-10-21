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
import SmartCampus.dto.EquipmentDTO;
import SmartCampus.model.Equipment;
import SmartCampus.model.Room;
import SmartCampus.service.EquipmentService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/equipment")
public class EquipmentController {

    private final EquipmentService equipmentService;
    private final RoomDB roomDB;

    public EquipmentController(
            EquipmentService equipmentService,
            RoomDB roomDB) {

        this.equipmentService = equipmentService;
        this.roomDB = roomDB;
    }

    @GetMapping
    public Iterable<Equipment> getAllEquipment() {
        return equipmentService.getAllEquipment();
    }

    @GetMapping("/{id}")
    public Optional<Equipment> getEquipmentById(
            @PathVariable("id") Long id) {

        return equipmentService.getEquipmentById(id);
    }

    @PostMapping
    public EquipmentDTO createEquipment(
            @Valid @RequestBody EquipmentDTO equipmentDTO) {

        Room room = roomDB.findById(equipmentDTO.roomId())
                .orElseThrow(() -> new RuntimeException("Room not found"));

        Equipment equipment = new Equipment(
                null,
                equipmentDTO.name(),
                equipmentDTO.type(),
                room
        );

        Equipment savedEquipment =
                equipmentService.createEquipment(equipment);

        return toDTO(savedEquipment);
    }

    @PutMapping("/{id}")
    public EquipmentDTO updateEquipment(
            @PathVariable("id") Long id,
            @Valid @RequestBody EquipmentDTO equipmentDTO) {

        Room room = roomDB.findById(equipmentDTO.roomId())
                .orElseThrow(() -> new RuntimeException("Room not found"));

        Equipment equipment = new Equipment(
                id,
                equipmentDTO.name(),
                equipmentDTO.type(),
                room
        );

        Equipment updatedEquipment =
                equipmentService.updateEquipment(equipment);

        return toDTO(updatedEquipment);
    }

    @DeleteMapping("/{id}")
    public void deleteEquipment(
            @PathVariable("id") Long id) {

        equipmentService.deleteEquipment(id);
    }

    public EquipmentDTO toDTO(Equipment equipment) {
        return new EquipmentDTO(
                equipment.getId(),
                equipment.getName(),
                equipment.getType(),
                equipment.getRoom().getId()
        );
    }
}