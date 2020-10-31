package com.deneme.denemeDemo.repository;

import com.deneme.denemeDemo.entity.Exam;
import com.deneme.denemeDemo.entity.UserExam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserExamRepository extends JpaRepository<UserExam,Integer> {

  @Query(value = "SELECT e FROM user_exam u ,exam e WHERE u.user_id = :userId and u.exam_id = e.exam_id", nativeQuery = true)
  List<Exam> findExams(@Param("userId") int userId);
}
