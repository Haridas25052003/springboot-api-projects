package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.QuestionsDao;

@Service
public class QuestionsServiceImpl implements QuestionsService{
	
	@Autowired
	private QuestionsDao qd;

}
