package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.ItemDetails;
import com.example.demo.Service.ItemService;

@RestController
public class ItemController {
	@Autowired
	ItemService is;
	@PostMapping("additemdetails")
	public ItemDetails add(@RequestBody ItemDetails it) {
		return is.saveinfo(it);
	}
	@GetMapping("showitemdetails")
	public List<ItemDetails> showinfo(){
		return is.showinfo();
	}
	@PutMapping("updateitemdetails")
	public ItemDetails modify(@RequestBody ItemDetails it) {
		return is.changeinfo(it);
	}
	@DeleteMapping("deleteitemdetails")
	public String del(@RequestBody ItemDetails it) {
		is.deleteinfo(it);
		return "Your Detail is deleted Succesfully";
	}
	@GetMapping("getitem/{id}")
	public Optional<ItemDetails> showid(@PathVariable int id){
		return is.getbyid(id);
	}
	@GetMapping("sort/{itemname}")
	public List<ItemDetails> getsortinfo(@PathVariable String itemname){
		return is.sortinfo(itemname);
	}
	@GetMapping("paging/{pageno}/{pagesize}")
	public List<ItemDetails> shopageinfo(@PathVariable int pageno,@PathVariable int pagesize){
		return is.getbypage(pageno, pagesize);
	}
	@PostMapping("additem")
	public ItemDetails addite(@RequestBody ItemDetails it) {
		return is.saveItemdetails(it);
	}
	@GetMapping("showitem")
	public List<ItemDetails> showite(){
		return is.showiteminfo();
	}
	@GetMapping("/fk_userid/{fk_userid}")
	public List<ItemDetails> display(@PathVariable int fk_userid)
	{
		return is.disp(fk_userid);
	}
}
