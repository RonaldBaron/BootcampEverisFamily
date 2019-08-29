package com.app.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Family;
import com.app.repo.IFamilyRepo;

@RestController
@RequestMapping("/")
public class RestControllerFamily {

	@Autowired
	private IFamilyRepo rep;
	
	
   @GetMapping
	public String mensaje() {
		return "Welcome Family";
	}
	
	
	
	@GetMapping("/listfamily")
	public List<Family> listar(){
		return rep.findAll();
	}
	
	@PostMapping
	public  void insertar(@RequestBody Family p) {
		rep.save(p);
	}
	
	@PutMapping
	public void modificar(@RequestBody Family p) {
		rep.save(p);
	}
	
	@DeleteMapping(value="{/id}")
	public void eliminar(@PathVariable("id") String id) {
		
		rep.deleteById(id);
	}
	
	
	
	
}
