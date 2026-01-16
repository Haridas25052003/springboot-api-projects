package com.demo.service;

import java.util.List;

import com.demo.model.Diary;

public interface DiaryService {

	List<Diary> findAll();
	
	List<Diary> getDiaryById(int id);
	
	List<Diary> getDiaryByCategory(String category);
	
	List<Diary> getDiaryByRemark(String remark);
	
	public void deleteById(int id);
}
