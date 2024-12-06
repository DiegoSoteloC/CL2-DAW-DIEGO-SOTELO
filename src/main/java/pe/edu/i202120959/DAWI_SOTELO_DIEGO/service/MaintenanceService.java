package pe.edu.i202120959.DAWI_SOTELO_DIEGO.service;

import pe.edu.i202120959.DAWI_SOTELO_DIEGO.dto.FilmDetailDto;
import pe.edu.i202120959.DAWI_SOTELO_DIEGO.dto.FilmDto;
import pe.edu.i202120959.DAWI_SOTELO_DIEGO.dto.FilmRegisterDto;
import pe.edu.i202120959.DAWI_SOTELO_DIEGO.dto.FilmUpdateDto;
import pe.edu.i202120959.DAWI_SOTELO_DIEGO.entity.Language;

import java.util.List;

public interface MaintenanceService {

    List<FilmDto> getAllFilms();

    FilmDetailDto getFilmById(int id);

    FilmUpdateDto getFilmUpdateById(int id);

    void updateFilm(FilmUpdateDto filmUpdateDto);

    void deleteFilm(int id);

    void registerNewFilm(FilmRegisterDto filmRegisterDto);

    List<Language> getAllLanguages();
}
