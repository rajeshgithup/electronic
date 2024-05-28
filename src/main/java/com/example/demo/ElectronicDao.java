package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ElectronicDao {
	@Autowired ElectronicRepository er;
	public String saveall(List<ElectronicEntity>e) {
		 er.saveAll(e);
		 return "save all";
	}
	public String savedata(ElectronicEntity e) {
		er.save(e);
		return "save";
	}
	public ElectronicEntity find(int id) {
		return er.findById(id).get();
	}
	public String del(int id) {
		er.deleteById(id);
		return "delte the id";

}
	public List<ElectronicEntity> findall() {
		return er.findAll();
	
}
	public String update(int id,ElectronicEntity e) {
		ElectronicEntity x=er.findById(id).get();
		x.setBrand(e.getBrand());
		x.setPrice(e.getPrice());
		x.setModelyear(e.getModelyear());
		x.setNoofdoors(e.getNoofdoors());
		er.save(x);
		return "updated";
		
		
}
	public List<ElectronicEntity> get(String name) {
		return er.get(name);
		
	}
	public List<ElectronicEntity>getage(int age){
		return er.getage(age);
	}
	public List<ElectronicEntity>get1(int price1,int price2){
		return er.get1(price1, price2);
	}
}