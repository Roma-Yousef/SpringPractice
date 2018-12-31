package controller;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Model.Course;
import service.CourseService;

@CrossOrigin
@RestController
@RequestMapping("/Course")
public class CourseController {

	
		@Autowired
		CourseService cs;
	
	    
		@RequestMapping("/all")
		public ArrayList<Course> getAll() {
			return cs.getAll();
		}

		@RequestMapping("{code}")
		public Course getCourse(@PathVariable("code") String code) {
			return cs.getCourse(code);
		}

}
	

