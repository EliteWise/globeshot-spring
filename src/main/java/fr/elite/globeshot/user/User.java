package fr.elite.globeshot.user;

import fr.elite.globeshot.world.Country;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class User {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String profilePicUrl;
    private String password;
    private String email;
    private Country country;
    private int picturesLiked;
    private LocalDateTime lastPostedPictureDate;

    private LocalDateTime accountCreationDate;
    private LocalDateTime lastUpdate;

}
