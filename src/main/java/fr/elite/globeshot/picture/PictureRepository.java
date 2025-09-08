package fr.elite.globeshot.picture;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

import java.util.Optional;

interface PictureRepository extends CrudRepository<Picture, Long> {

}
