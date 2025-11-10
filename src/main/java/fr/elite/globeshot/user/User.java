package fr.elite.globeshot.user;

import fr.elite.globeshot.world.Country;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "Client")
public class User {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    @Column(name = "profile_pic_url")
    private String profilePicUrl;
    private String password;

    @Column(unique = true)
    private String email;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;

    @Column(name = "pictures_liked")
    private Integer picturesLiked;

    @Column(name = "last_posted_picture_date")
    private LocalDateTime lastPostedPictureDate;

    @Column(name = "account_creation_date")
    private LocalDateTime accountCreationDate;

    @Column(name = "last_update")
    private LocalDateTime lastUpdate;

    public User(Long id, String name, String profilePicUrl, String password, String email,
                Country country, int picturesLiked, LocalDateTime lastPostedPictureDate,
                LocalDateTime accountCreationDate, LocalDateTime lastUpdate) {
        this.id = id;
        this.name = name;
        this.profilePicUrl = profilePicUrl;
        this.password = password;
        this.email = email;
        this.country = country;
        this.picturesLiked = picturesLiked;
        this.lastPostedPictureDate = lastPostedPictureDate;
        this.accountCreationDate = accountCreationDate;
        this.lastUpdate = lastUpdate;
    }

    protected User() {}

    public Long getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }

    }
