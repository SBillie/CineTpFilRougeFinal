package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.CinemaBo;
import repository.CinemaDAO;

@Service
public class CinemaBLL {
	
@Autowired
private CinemaDAO dao;
	
public List<CinemaBo> selectAll(){
	return dao.findAll();

}

public CinemaBo selectById(int id){
	return dao.findById(id).get();

}

public void save(CinemaBo c) {
	dao.save(c);
}

public void delete(CinemaBo c) {
	dao.delete(c);
}

public void delete(int id) {
	dao.deleteById(id);
}

public boolean contains(int id) {
	return dao.existsById(id);
}



	
}
