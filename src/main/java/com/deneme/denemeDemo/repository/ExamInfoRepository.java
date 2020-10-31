package com.deneme.denemeDemo.repository;

import com.deneme.denemeDemo.entity.ExamInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExamInfoRepository extends JpaRepository<ExamInfo,Integer> {
}
