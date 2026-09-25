package SmartCampus.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import SmartCampus.db.EquipmentDB;
import SmartCampus.model.Equipment;

@Service 
public class EquipmentService {

    private final EquipmentDB equipmentDB;

    public EquipmentService(EquipmentDB equipmentDB) {
        this.equipmentDB = equipmentDB;
    }

    public Iterable<Equipment> getAllEquipment() {
        return equipmentDB.findAll();
    }

    public Optional<Equipment> getEquipmentById(Long id) {
        return equipmentDB.findById(id);
    }

    public Equipment createEquipment(Equipment equipment) {
        return equipmentDB.save(equipment);
    }

    public Equipment updateEquipment(Equipment equipment) {
        return equipmentDB.save(equipment);
    }

    public void deleteEquipment(Long id) {
        equipmentDB.deleteById(id);
    }
}
