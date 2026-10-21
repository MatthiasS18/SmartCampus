package SmartCampus.db;

import org.springframework.data.repository.CrudRepository;

import SmartCampus.model.Incident;

public interface IncidentDB extends CrudRepository<Incident,Long> {
    
}
