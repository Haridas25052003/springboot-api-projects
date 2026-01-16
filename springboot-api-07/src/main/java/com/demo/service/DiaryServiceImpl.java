package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.DiaryDao;
import com.demo.model.Diary;

@Service
public class DiaryServiceImpl implements DiaryService{

	@Autowired
	private DiaryDao dd;

	@Override
	public List<Diary> findAll() {
		return dd.findAll();
	}

	@Override
	public List<Diary> getDiaryById(int id) {
		
		return dd.getDiaryById(id);
	}

	@Override
	public List<Diary> getDiaryByCategory(String category) {
		
		return dd.getDiaryByCategory(category);
	}

	@Override
	public List<Diary> getDiaryByRemark(String remark) {
		
		return dd.getDiaryByRemark(remark);
	}

	@Override
	public void deleteById(int id) {
		dd.deleteById(id);
	}
}
