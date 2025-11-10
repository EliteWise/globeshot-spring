package fr.elite.globeshot.picture;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PictureService {

    private PictureRepository pictureRepository;

    public PictureService(PictureRepository pictureRepository) {
        this.pictureRepository = pictureRepository;
    }

    public Iterable<Picture> getPicturesByCountry(String name) {
        return pictureRepository.findByCountry_Name(name);
    }
}
