package exercicioPropostoSet.entities;

import java.util.ArrayList;
import java.util.List;

public class Course {
	
	private String name;
	
	private List<Student> students;

	public Course(String name) {
		this.name = name;
		students = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Student> getStudents() {
		return students;
	}
	
	public void add (Student student) {
		students.add(student);
	}
	
	
}
