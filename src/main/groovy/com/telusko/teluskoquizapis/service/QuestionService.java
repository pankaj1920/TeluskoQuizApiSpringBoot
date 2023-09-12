package com.telusko.teluskoquizapis.service;

import com.telusko.teluskoquizapis.dao.QuestionDao;
import com.telusko.teluskoquizapis.model.QuestionModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
    QuestionDao questionDao;
    public List<QuestionModel> getAllQuestion() {
        return  questionDao.findAll();
    }
}
