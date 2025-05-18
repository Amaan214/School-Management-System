package com.school.lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.school.lms.entity.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {

}
