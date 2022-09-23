package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.VilleBo;

@Repository
public interface VilleDAO extends JpaRepository<VilleBo, Integer>{


}



