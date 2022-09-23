package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.SeanceBo;

@Repository
public interface SeanceDAO extends JpaRepository<SeanceBo, Integer>{

	

}
