package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.AdminBo;
import service.AdminBLL;

@RestController
@RequestMapping(path="/Admin")
public class AdminController {
	
	@Autowired
	private AdminBLL bll;
	
	@GetMapping
	public ResponseEntity<List<AdminBo>> selectAll() {
		return new ResponseEntity<List<AdminBo>>(bll.selectAll(), HttpStatus.OK);
	}
	
	@GetMapping(path="/{id}")
	public ResponseEntity<AdminBo> selectById(@PathVariable("id") int id) {
		if (bll.contains(id)) {
			return new ResponseEntity<AdminBo>(bll.selectById(id), HttpStatus.OK);
		} else {
			return new ResponseEntity<AdminBo>(HttpStatus.NOT_FOUND);
		}
	}
	
	
}