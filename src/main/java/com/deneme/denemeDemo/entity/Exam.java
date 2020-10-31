package com.deneme.denemeDemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
public class Exam {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int examId;

    private String examName;
    private boolean isActive;

}
