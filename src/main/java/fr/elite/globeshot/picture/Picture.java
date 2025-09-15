package fr.elite.globeshot.picture;

import fr.elite.globeshot.user.Comment;
import fr.elite.globeshot.world.Country;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Picture {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String url;
    private Country country;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true) // Propagates operations on `Comment` table
    @JoinColumn(name = "picture_id") // Simple relation -> picture_id inside `Comment` table
    private List<Comment> comments = new ArrayList<>();

    private LocalDateTime createdAt = LocalDateTime.now();
}
