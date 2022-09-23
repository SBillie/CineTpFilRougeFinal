package service;

import java.util.List;
import model.VilleBo;
import repository.VilleDAO;



public class VilleBLL {
	
private VilleDAO dao;
	
public List<VilleBo> selectAll(){
return dao.findAll();

}

public VilleBo selectById(int id){
return dao.findById(id).get();

}

public void save(VilleBo v) {
dao.save(v);
}

public void delete(VilleBo v) {
dao.delete(v);
}

public void delete(int id) {
dao.deleteById(id);
}

public boolean contains(int id) {
return dao.existsById(id);
}


}
