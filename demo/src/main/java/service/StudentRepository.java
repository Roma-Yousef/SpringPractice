package service;

import org.springframework.data.repository.CrudRepository;

import Model.Student;

public interface StudentRepository extends CrudRepository<Student, String>{
	
}
