package fr.elite.globeshot.world;

import fr.elite.globeshot.picture.Picture;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Country {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String flagUrl;

    @OneToMany(mappedBy = "country", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Picture> pictures = new ArrayList<>();

    public Long getId() { return id; }
    public String getName() { return name; }
    public String getFlagUrl() { return flagUrl; }
    public List<Picture> getPictures() { return pictures; }
}
