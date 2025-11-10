package fr.elite.globeshot.picture;

import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/picture")
public class PictureController {

    private final PictureService pictureService;

    @Autowired
    public PictureController(PictureService pictureService) {
        this.pictureService = pictureService;
    }

    @GetMapping("/{countryName}")
    public ResponseEntity<Iterable<Picture>> getPictures(@PathVariable String countryName) {
        return ResponseEntity.ok().body(pictureService.getPicturesByCountry(countryName));
    }

    @GetMapping("/static/{countryName}")
    public ResponseEntity<List<String>> getStaticPictures(@PathVariable String countryName) {
        try {
            Iterable<Picture> pictures = pictureService.getPicturesByCountry(countryName);
            List<String> urls = new ArrayList<>();
            pictures.forEach(p -> urls.add(p.getUrl()));
            return ResponseEntity.ok(urls);
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }

}
