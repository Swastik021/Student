package com.school.service;

import com.school.dto.Student;

import co.school.dao.StudentDao;

public class StudentService {
	StudentDao studentDao = new StudentDao();
	public Student saveStudent(Student student) {
		return studentDao.saveStudent(student);
	}

	

}
