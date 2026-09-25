package SmartCampus.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import SmartCampus.db.IncidentDB;
import SmartCampus.model.Incident;

@Service 
public class IncidentService {

    private final IncidentDB incidentDB;

    public IncidentService(IncidentDB incidentDB) {
        this.incidentDB = incidentDB;
    }

    public Iterable<Incident> getAllIncidents() {
        return incidentDB.findAll();
    }

    public Optional<Incident> getIncidentById(Long id) {
        return incidentDB.findById(id);
    }

    public Incident createIncident(Incident incident) {
        return incidentDB.save(incident);
    }

    public Incident updateIncident(Incident incident) {
        return incidentDB.save(incident);
    }

    public void deleteIncident(Long id) {
        incidentDB.deleteById(id);
    }
}
