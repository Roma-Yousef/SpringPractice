package controller;
import java.util.ArrayList;
//import java.util.Hashtable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Model.Student;
import service.StudentService;

@CrossOrigin
@RestController
@RequestMapping("/Student")
public class StudentController {

	@Autowired
	StudentService ss;

	@RequestMapping("/all")
	public ArrayList<Student> getAll() {
		return ss.getAll();
	}

	@RequestMapping("{id}")
	public Student getStudent(@PathVariable("id") String id) {
		return ss.getStudent(id);
	}
}


