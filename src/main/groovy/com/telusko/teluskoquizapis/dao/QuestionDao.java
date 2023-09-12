package com.telusko.teluskoquizapis.dao;

import com.telusko.teluskoquizapis.model.QuestionModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionDao extends JpaRepository<QuestionModel,Integer> {


}
