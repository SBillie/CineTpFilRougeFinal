package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.GerantBo;
import repository.GerantDAO;

@Service
public class GerantBLL {
	
@Autowired	
private GerantDAO dao;
	
public List<GerantBo> selectAll(){
	return dao.findAll();

}

public GerantBo selectById(int id){
	return dao.findById(id).get();

}

public void save(GerantBo g) {
	dao.save(g);
}

public void delete(GerantBo g) {
	dao.delete(g);
}

public void delete(int id) {
	dao.deleteById(id);
}

public boolean contains(int id) {
	return dao.existsById(id);
}

}
