package com.school.lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.school.lms.entity.Subject;

public interface SubjectRepository extends JpaRepository<Subject, Long>{

}
