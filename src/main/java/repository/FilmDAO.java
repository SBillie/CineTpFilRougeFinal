package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.FilmBo;

@Repository
public interface FilmDAO extends JpaRepository<FilmBo, Integer> {

}
