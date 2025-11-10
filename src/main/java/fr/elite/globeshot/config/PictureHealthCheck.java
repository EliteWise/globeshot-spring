package fr.elite.globeshot.config;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;
import fr.elite.globeshot.picture.PictureRepository;


@Component
public class PictureHealthCheck implements HealthIndicator {

    private PictureRepository pictureRepository;

    public PictureHealthCheck(PictureRepository pictureRepository) {
        this.pictureRepository = pictureRepository;
    }

    @Override
    public Health health() {
        return pictureRepository.count() == 0 ? Health.down().build() : Health.up().build();
    }
}
