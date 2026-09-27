package SmartCampus.controller;

import java.util.Optional;

import jakarta.validation.Valid;

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
import SmartCampus.dto.IncidentDTO;
import SmartCampus.model.Incident;
import SmartCampus.model.Room;
import SmartCampus.model.User;
import SmartCampus.service.IncidentService;

@RestController
@RequestMapping("/api/incidents")
public class IncidentController {

    private final IncidentService incidentService;
    private final RoomDB roomDB;
    private final UserDB userDB;

    public IncidentController(
            IncidentService incidentService,
            RoomDB roomDB,
            UserDB userDB) {

        this.incidentService = incidentService;
        this.roomDB = roomDB;
        this.userDB = userDB;
    }

    @GetMapping
    public Iterable<Incident> getAllIncidents() {
        return incidentService.getAllIncidents();
    }

    @GetMapping("/{id}")
    public Optional<Incident> getIncidentById(
            @PathVariable("id") Long id) {

        return incidentService.getIncidentById(id);
    }

    @PostMapping
    public IncidentDTO createIncident(
            @Valid @RequestBody IncidentDTO incidentDTO) {

        Room room = roomDB.findById(incidentDTO.roomId())
                .orElseThrow(() -> new RuntimeException("Room not found"));

        User user = userDB.findById(incidentDTO.userId())
                .orElseThrow(() -> new RuntimeException("User not found"));

        Incident incident = new Incident(
                null,
                incidentDTO.title(),
                incidentDTO.description(),
                incidentDTO.priority(),
                incidentDTO.status(),
                room,
                user
        );

        Incident savedIncident =
                incidentService.createIncident(incident);

        return toDTO(savedIncident);
    }

    @PutMapping("/{id}")
    public IncidentDTO updateIncident(
            @PathVariable("id") Long id,
            @Valid @RequestBody IncidentDTO incidentDTO) {

        Room room = roomDB.findById(incidentDTO.roomId())
                .orElseThrow(() -> new RuntimeException("Room not found"));

        User user = userDB.findById(incidentDTO.userId())
                .orElseThrow(() -> new RuntimeException("User not found"));

        Incident incident = new Incident(
                id,
                incidentDTO.title(),
                incidentDTO.description(),
                incidentDTO.priority(),
                incidentDTO.status(),
                room,
                user
        );

        Incident updatedIncident =
                incidentService.updateIncident(incident);

        return toDTO(updatedIncident);
    }

    @DeleteMapping("/{id}")
    public void deleteIncident(
            @PathVariable("id") Long id) {

        incidentService.deleteIncident(id);
    }

    private IncidentDTO toDTO(Incident incident) {

        return new IncidentDTO(
                incident.getId(),
                incident.getTitle(),
                incident.getDescription(),
                incident.getPriority(),
                incident.getStatus(),
                incident.getRoom().getId(),
                incident.getUser().getId()
        );
    }
}