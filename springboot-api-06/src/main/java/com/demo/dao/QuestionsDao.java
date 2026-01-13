package com.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.model.Questions;

public interface QuestionsDao extends JpaRepository<Questions,Long>{

}
