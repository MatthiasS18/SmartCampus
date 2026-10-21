package SmartCampus.db;

import org.springframework.data.repository.CrudRepository;

import SmartCampus.model.Equipment;

public interface EquipmentDB extends CrudRepository<Equipment,Long> {
    
}
