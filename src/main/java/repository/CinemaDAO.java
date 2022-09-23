package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.CinemaBo;

@Repository
public interface CinemaDAO extends JpaRepository<CinemaBo, Integer>{

}
