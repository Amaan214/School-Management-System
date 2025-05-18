package com.school.lms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.lms.entity.Classroom;
import com.school.lms.repository.ClassroomRepository;
import com.school.lms.service.Interface.ClassroomServiceInterf;

@Service
public class ClassroomService implements ClassroomServiceInterf {

	@Autowired
	private ClassroomRepository classrepo;

	@Override
	public List<Classroom> getAllClassroom() {
		return classrepo.findAll();
	}

	@Override
	public Classroom getClassById(long id) {
		return classrepo.findById(id)
				.orElseThrow(() -> new RuntimeException("Id not found."));
	}

	@Override
	public Classroom addClass(Classroom classroom) {
		return classrepo.save(classroom);
	}

	@Override
	public Classroom updateClass(long id, Classroom classroom) {
		Classroom exists = getClassById(id);
		exists.setSection(classroom.getSection());
		exists.setGrade(classroom.getGrade());
		return classrepo.save(exists);
	}

	@Override
	public void deleteClass(long id) {
		classrepo.deleteById(id);
	}

}
