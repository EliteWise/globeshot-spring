package fr.elite.globeshot.picture;

import fr.elite.globeshot.Country;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class Picture {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String url;
    private Country country;

    private LocalDateTime createdAt = LocalDateTime.now();
}
