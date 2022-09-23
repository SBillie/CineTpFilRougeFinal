package repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.GerantBo;

@Repository
public interface GerantDAO extends JpaRepository<GerantBo, Integer> {

	

}
