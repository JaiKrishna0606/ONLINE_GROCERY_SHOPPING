package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.Model.ItemDetails;
import com.example.demo.Repository.ItemRepo;

@Service
public class ItemService {
	@Autowired
	ItemRepo ir;
	public ItemDetails saveinfo(ItemDetails it) {
		return ir.save(it);
	}
	public List<ItemDetails> showinfo(){
		return ir.findAll();
	}
	public ItemDetails changeinfo(ItemDetails it) {
		return ir.saveAndFlush(it);
	}
	public void deleteinfo(ItemDetails it) {
		ir.delete(it);
	}
	public Optional<ItemDetails> getbyid(int id){
		return ir.findById(id);
	}
	public List<ItemDetails> sortinfo(String s){
		return ir.findAll(Sort.by(Sort.DEFAULT_DIRECTION,s));
	}
	public List<ItemDetails> getbypage(int pgno,int pgsize){
		Page<ItemDetails> p=ir.findAll(PageRequest.of(pgno, pgsize));
		return p.getContent();
	}
	public ItemDetails saveItemdetails(ItemDetails it) {
		return ir.save(it);
	}
	public List<ItemDetails> showiteminfo(){ 
		return ir.findAll();
	}
	
	public List<ItemDetails> disp(@PathVariable int fk_userid)
	{
		return ir.get(fk_userid);
	}

}
