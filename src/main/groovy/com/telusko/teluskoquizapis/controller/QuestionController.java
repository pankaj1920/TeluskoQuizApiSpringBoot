package com.telusko.teluskoquizapis.controller;


import com.telusko.teluskoquizapis.model.QuestionModel;
import com.telusko.teluskoquizapis.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController {

    @Autowired
    QuestionService questionService;

    @GetMapping("allQuestions")
    public List<QuestionModel> getAllQuestion(){
        return questionService.getAllQuestion();
    }

    @GetMapping("abc")
    public String abc() {
        // Implementation here
        return "User created successfully";
    }

}
