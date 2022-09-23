package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.FilmBo;
import repository.FilmDAO;


@Service
public class FilmBLL {
	
@Autowired	
private FilmDAO dao;
	
public List<FilmBo> selectAll(){
	return dao.findAll();

}

public FilmBo selectById(int id){
	return dao.findById(id).get();

}

public void save(FilmBo f) {
	dao.save(f);
}

public void delete(FilmBo f) {
	dao.delete(f);
}

public void delete(int id) {
	dao.deleteById(id);
}

public boolean contains(int id) {
	return dao.existsById(id);
}

}
