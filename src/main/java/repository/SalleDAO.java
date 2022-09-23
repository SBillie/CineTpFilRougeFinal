package repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.SalleBo;

@Repository
public interface SalleDAO extends JpaRepository<SalleBo, Integer>{

	

}
