package com.deneme.denemeDemo.controller;

import com.deneme.denemeDemo.entity.Exam;
import com.deneme.denemeDemo.entity.User;
import com.deneme.denemeDemo.entity.UserExam;
import com.deneme.denemeDemo.repository.ExamRepository;
import com.deneme.denemeDemo.repository.UserExamRepository;
import com.deneme.denemeDemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
class GeneralController {

    @Autowired
    UserRepository userRepository;

    @Autowired
    ExamRepository examRepository;

    @Autowired
    UserExamRepository userExamRepository;

    @RequestMapping("/")
    public String home() {
       return "Hello World!";
    }

    @PostMapping("/addStudent")
    public User addUser(@RequestBody User user){
        return userRepository.saveAndFlush(user);
    }

    @PostMapping("/addExam")
    public Exam addExam(@RequestBody Exam exam){
        return examRepository.saveAndFlush(exam);
    }

    @PostMapping("/assignExamToUser")
    public UserExam addUserExam(@RequestBody UserExam userExam){
        return userExamRepository.saveAndFlush(userExam);
    }

    @GetMapping("/getExamsForUser/{id}")
    public List<Exam> getExamsForUser(@PathVariable int id){
        return userExamRepository.findExams(id);
    }
}
