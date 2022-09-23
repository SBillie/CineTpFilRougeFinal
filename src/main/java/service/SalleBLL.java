package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.SalleBo;
import repository.SalleDAO;


@Service
public class SalleBLL {

@Autowired
private SalleDAO dao;
	
public List<SalleBo> selectAll(){
	return dao.findAll();

}

public SalleBo selectById(int id){
	return dao.findById(id).get();

}

public void save(SalleBo s) {
	dao.save(s);
}

public void delete(SalleBo s) {
	dao.delete(s);
}

public void delete(int id) {
	dao.deleteById(id);
}

public boolean contains(int id) {
	return dao.existsById(id);
}

}
