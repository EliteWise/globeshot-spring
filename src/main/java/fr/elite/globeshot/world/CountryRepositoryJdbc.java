package fr.elite.globeshot.world;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;

@Repository
public class CountryRepositoryJdbc {

    private final JdbcTemplate jdbcTemplate;

    public CountryRepositoryJdbc(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    record CountryRecentPicture(String countryName, String pictureUrl, LocalDateTime createdAt) {}

    private final String SQL_RECENT_PICTURES = "SELECT c.name, p.url, p.created_at FROM country c JOIN picture p ON p.country_id = c.id" +
            " ORDER BY c.name, p.created_at DESC";

    // RowMapper

    // ResultSetExtractor
}
