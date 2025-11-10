package fr.elite.globeshot.picture;

import java.util.List;
import java.util.Map;

public interface PictureRepositoryCustom {

    List<PictureRepositoryImpl.CountryPictureCount> countPicturesByCountry();
}
