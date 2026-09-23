package SmartCampus.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data 
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String building;

    private int floor;

    private int capacity;

    @OneToMany(mappedBy = "room")
    private List<Reservation> reservation;

    @OneToMany(mappedBy = "room")
    private List<Equipment> equipment;

    @OneToMany(mappedBy = "room")
    private Incident incident;
}
