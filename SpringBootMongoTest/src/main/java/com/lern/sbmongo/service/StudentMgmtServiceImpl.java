package com.lern.sbmongo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lern.sbmongo.entity.Student;
import com.lern.sbmongo.repository.IStudentRepository;

@Service("studentService")
public class StudentMgmtServiceImpl implements IStudentMgmtService  {

	@Autowired
	private IStudentRepository studentRepo;
	
	@Override
	public String saveStudent(Student s) {
		
		return " mongoDb Saved with Number : "+studentRepo.insert(s).getSno();
		
	}

	
}
