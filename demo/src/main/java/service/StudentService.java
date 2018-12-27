package service;

import java.util.ArrayList;
//import java.util.Hashtable;
//import java.util.stream.Stream;

import org.springframework.stereotype.Service;

import Model.Student;
@Service
public class StudentService {
	ArrayList<Student> Student = new ArrayList<Student>();
	
	public StudentService() {
		Student p = new Student();
		p.setId("1");
		p.setAge(21);
		p.setFirstName("Steve");
		p.setLastName("Smith");
		Student.add(p);

		p = new Student();
		p.setId("2");
		p.setAge(25);
		p.setFirstName("Tom");
		p.setLastName("Brown");
		Student.add(p);
	}
	public Student getStudent(String id) {
		for(Student Student:Student) {
			if(Student.getId().equalsIgnoreCase(id)) return Student;
		}
	    return null;
	}
	public ArrayList<Student> getAll() {
		return Student;
	}

}
