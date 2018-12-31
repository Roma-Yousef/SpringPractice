package Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	String id;
	@Id
	Long studentCode;
	String firstName;
	String lastName;
	int age;
	
	/*public Student(String id, String firstName, String lastName, int age) {
		
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}*/
	
	public String getId() {
		return id;
	}

	public void setId(String string) {
		this.id = string;
	}
	public Long getStudentCode() {
		return studentCode;
	}
	public void setStudentCode(Long studentCode) {
		this.studentCode = studentCode;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
