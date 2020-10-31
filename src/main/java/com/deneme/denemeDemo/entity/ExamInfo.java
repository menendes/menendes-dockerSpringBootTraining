package com.deneme.denemeDemo.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class ExamInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int examInfoId;

    private String examNote;
    private boolean isActive;
}
