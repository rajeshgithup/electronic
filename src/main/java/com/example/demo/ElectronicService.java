package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class ElectronicService {
	@Autowired ElectronicDao ed;
	public String saveall(List<ElectronicEntity>e)throws PriceException {
		for(ElectronicEntity x:e) {
			if(x.getPrice()>400000) {
				throw new PriceException();	
			}
		}
		return ed.saveall(e);
	}
	public ElectronicEntity find(int id) {
		ElectronicEntity x=ed.find(id);
			if(x.getModelyear()==2023) {
			
		}
			return x;
		
	}
	public String savedata(ElectronicEntity e) {
		return ed.savedata(e);
	}
	public String del(int id) {
		return ed.del(id);

}
	public List<ElectronicEntity> findall() {
		return ed.findall();
}
	public String update(int id,ElectronicEntity e) {
		return ed.update(id,e);
	}
	public List<ElectronicEntity> get(String name) {
		return ed.get(name);
}
	public List<ElectronicEntity>getage(int age){
		return ed.getage(age);
	}
	public List<ElectronicEntity>get1(int price1,int price2){
		return ed.get1(price1, price2);
	}
}