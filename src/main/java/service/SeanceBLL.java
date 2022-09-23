package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.SeanceBo;
import repository.SeanceDAO;


@Service
public class SeanceBLL {
	
@Autowired	
private SeanceDAO dao;
	

public List<SeanceBo> selectAll(){
return dao.findAll();

}

public SeanceBo selectById(int id){
return dao.findById(id).get();

}

public void save(SeanceBo se) {
dao.save(se);
}

public void delete(SeanceBo se) {
dao.delete(se);
}

public void delete(int id) {
dao.deleteById(id);
}

public boolean contains(int id) {
return dao.existsById(id);
}


}
