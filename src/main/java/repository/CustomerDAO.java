package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.CustomerBo;

@Repository
public interface CustomerDAO extends JpaRepository<CustomerBo, Integer>{

}
