package service;

import java.util.ArrayList;
//import java.util.Hashtable;
//import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Model.Course;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;
	ArrayList<Course> Course = new ArrayList<Course>();
	
	public CourseService() {
		Course c = new Course();
		c.setId("1");
		c.setCode("CS2");
		c.setName("Computer Science 2");
		Course.add(c);

		c = new Course();
		c.setId("2");
		c.setCode("NT1");
		c.setName("Introduction to Networks 1");
		Course.add(c);
		
		c = new Course();
		c.setId("3");
		c.setCode("MATH1");
		c.setName("Engineering Math 1");
		Course.add(c);

	}
	public Course getCourse(String code) {
		for(Course Course:Course) {
			if(Course.getCode().equalsIgnoreCase(code)) return Course;
		}
	    return null;
	}
	public ArrayList<Course> getAll() {
		
		ArrayList<Course> courses = new ArrayList<>();
		courseRepository.findAll()
		.forEach(courses::add);
		return courses;
	}
	public void addCourse(Course course) {
		courseRepository.save(course);
	}
	
}
