package com.school.lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.school.lms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
