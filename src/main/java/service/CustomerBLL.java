package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.CustomerBo;
import repository.CustomerDAO;

@Service
public class CustomerBLL {

@Autowired
private CustomerDAO dao;
	
public List<CustomerBo> selectAll(){
	return dao.findAll();

}

public CustomerBo selectById(int id){
	return dao.findById(id).get();

}

public void save(CustomerBo cu) {
	dao.save(cu);
}

public void delete(CustomerBo cu) {
	dao.delete(cu);
}

public void delete(int id) {
	dao.deleteById(id);
}

public boolean contains(int id) {
	return dao.existsById(id);
}


}
