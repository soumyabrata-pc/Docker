package com.lern.sbmongo.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.lern.sbmongo.entity.Student;
import com.lern.sbmongo.service.IStudentMgmtService;

@Component
public class MongoRepositoryTestRunner implements CommandLineRunner {

	@Autowired
	private IStudentMgmtService service;
	
	@Override
	public void run(String... args) throws Exception {

		Student s= new Student(); 
		//s.setSno(104);s.setSname("Satyabrata");s.setSadd("HYD");
		s.setSno(105);s.setSname("Soumyabrata");s.setSadd("BLR");
		System.out.println(service.saveStudent(s));
	}

}
