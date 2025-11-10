package fr.elite.globeshot.picture;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Optional;

public interface PictureRepository extends CrudRepository<Picture, Long>, PictureRepositoryCustom {

    Iterable<Picture> findByCountry_Name(String name);

}
