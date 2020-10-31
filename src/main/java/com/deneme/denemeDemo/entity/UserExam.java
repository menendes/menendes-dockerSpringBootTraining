package com.deneme.denemeDemo.entity;

import lombok.Data;
import org.hibernate.annotations.Type;

import javax.persistence.*;

@Entity
@Data
public class UserExam {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userExamId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private User user;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "exam_id")
    private Exam exam;

}
