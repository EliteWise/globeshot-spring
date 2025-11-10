package fr.elite.globeshot.picture;

import jakarta.transaction.Transactional;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@Transactional
public class PictureRepositoryImplIntegrationTest {

    @Autowired
    private PictureRepositoryImpl pictureRepository;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @BeforeEach
    void setup() {
        jdbcTemplate.update("INSERT INTO country (id, name) VALUES (?, ?)", 1L, "France");
        jdbcTemplate.update("INSERT INTO picture (id, country_id) VALUES (?, ?)", 19L, 1L);
        jdbcTemplate.update("INSERT INTO picture (id, country_id) VALUES (?, ?)", 102L, 1L);
        jdbcTemplate.update("INSERT INTO picture (id, country_id) VALUES (?, ?)", 105L, 1L);
    }

    @Test
    void shouldCountPicturesByCountry() {
        var result = pictureRepository.countPicturesByCountry();

        assertThat(result).hasSize(1);
        assertThat(result.getFirst().coutryName()).isEqualTo("France");
        assertThat(result.getFirst().pictureCount()).isEqualTo(3);
    }
}
