package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.Model.ItemDetails;

public interface ItemRepo extends JpaRepository<ItemDetails, Integer>{
	@Query(value="select * from Itemtable where fk_userid=:s",nativeQuery =true )
	public List<ItemDetails> get(@Param("s") int fk_userid);
	

}
