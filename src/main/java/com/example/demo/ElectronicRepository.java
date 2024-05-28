package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ElectronicRepository extends JpaRepository<ElectronicEntity, Integer> {
//@Query(value="select * from electric where price like ?",nativeQuery=true)
	//different method use no path variable
//@Query(value="select * from electric where price>10000 And price<50000",nativeQuery=true)
	//@Query(value="select* from electric where price>25000",nativeQuery=true)
	//@Query(value="select ele from ElectronicEntity ele where ele.price>:id1 And ele.price <30000 ")
//public List<ElectronicEntity> get(int id);
	//@Query(value="select brand from electric where brand like 's%'",nativeQuery=true)
   //@Query(value="select * from electric where brand like?",nativeQuery=true)
   @Query(value="select * from electric where age like?",nativeQuery=true)
//@Query(value="Select * from electric  order by price",nativeQuery=true)
	public List<ElectronicEntity> get(String name);
	
	@Query(value="select ele from ElectronicEntity ele where ele.price>?1 And ele.price<?2 ")
     //@Query(value="select ele from ElectronicEntity ele where  ele.modelyear>?1 and emodelyear<?2")
	public List<ElectronicEntity>get1(int price1,int price2);
	
    @Query(value="select * from electric where modelyear=?",nativeQuery = true)
    public List<ElectronicEntity>getage(int age);
    }
