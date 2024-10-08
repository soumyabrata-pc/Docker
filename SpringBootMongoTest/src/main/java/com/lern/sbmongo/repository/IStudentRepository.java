package com.lern.sbmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lern.sbmongo.entity.Student;

public interface IStudentRepository extends MongoRepository<Student, Integer> {

}
