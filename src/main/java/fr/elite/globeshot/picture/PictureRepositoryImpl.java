package fr.elite.globeshot.picture;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class PictureRepositoryImpl implements PictureRepositoryCustom {

    private final JdbcTemplate jdbcTemplate;

    public PictureRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public static record CountryPictureCount(String coutryName, long pictureCount) {}

    @Override
    public List<CountryPictureCount> countPicturesByCountry() {
        String sql = "SELECT c.name, COUNT(p.id) AS picture_count FROM picture p JOIN country c ON p.country_id = c.id GROUP BY c.name";

        return jdbcTemplate.query(sql, (rs, rowNum) ->
           new CountryPictureCount(rs.getString("name"), rs.getLong("picture_count")
        ));
    }
}
