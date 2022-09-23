package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.AdminBo;
import repository.AdminDAO;

@Service
public class AdminBLL {

@Autowired
private AdminDAO adminDAO;
	
	public List<AdminBo> selectAll(){
		return adminDAO.findAll();

}

	public AdminBo selectById(int id){
		return adminDAO.findById(id).get();

}
	
	public void save(AdminBo a) {
		adminDAO.save(a);
	}
	
	public void delete(AdminBo a) {
		adminDAO.delete(a);
	}
	
	public void delete(int id) {
		adminDAO.deleteById(id);
	}
	
	public boolean contains(int id) {
		return adminDAO.existsById(id);
	}
	

	
}
