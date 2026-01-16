package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Diary;
import com.demo.service.DiaryService;

@RestController
public class DiaryController {
	
	@Autowired
	private DiaryService ds;
	
	@GetMapping(value="/")
	public List<Diary> m1(){
		return ds.findAll();
	}
	
	@GetMapping(value="/req1/{id}")
	public List<Diary> m2(@PathVariable int id){
		return ds.getDiaryById(id);
	}
	
	@GetMapping(value="/req2/{category}")
	public List<Diary> m3(@PathVariable String category){
		return ds.getDiaryByCategory(category);
	}
	
	@GetMapping(value="/req3/{remark}")
	public List<Diary> m4(@PathVariable String remark){
		return ds.getDiaryByRemark(remark);
	}

	@DeleteMapping(value="/req4/{id}")
	public String m5(@PathVariable int id){
		ds.deleteById(id);
		return "question deleted successfully";
	}
}
