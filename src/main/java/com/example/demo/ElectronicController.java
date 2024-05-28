package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController

public class ElectronicController {
	@Autowired ElectronicService es;
	@PostMapping("/saveall")
public String saveall(@RequestBody List<ElectronicEntity>e) throws PriceException {
      return es.saveall(e);
}
	@PostMapping("/datapost")
	public String savedata(@RequestBody ElectronicEntity e) {
		return es.savedata(e);
	}
	@GetMapping("/find/{id}")
	public ElectronicEntity find(@PathVariable int id) {
		return es.find(id);
	}
	@DeleteMapping("del/{id}")
	public String del(@PathVariable int id) {
		return es.del(id);
	}
	@GetMapping("/findall")
	public List<ElectronicEntity> findall() {
		return es.findall();
}
	@GetMapping("/get/{name}")
	public List<ElectronicEntity> get(@PathVariable String name) {
		return es.get(name);
	}
	@GetMapping("/getage/{age}")
	public List<ElectronicEntity>getage(@PathVariable int age){
		return es.getage(age);
	}
	@GetMapping("/get1/{price1}/{price2}")
	public List<ElectronicEntity> get1(@PathVariable int price1,@PathVariable int price2){                                      
		return es.get1(price1,price2);
	}
	@PutMapping("/update/{id}")
	public String update(@PathVariable int id,@RequestBody ElectronicEntity e) {
		return es.update(id,e);
}
}