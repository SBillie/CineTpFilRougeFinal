package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.AdminBo;

@Repository
public interface AdminDAO extends JpaRepository<AdminBo, Integer> {

	
}
