package exercicioPropostoSet.entities;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Instructor {
	
	private String name;
	
	private List<Course> courses;

	public Instructor(String name) {
		this.name = name;
		courses = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public List<Course> getCourses() {
		return courses;
	}
	
	public void add (Course course) {
		courses.add(course);
	}
	
	public Integer getTotalStudents() {
		
		Set<Student> total = new HashSet<>();
	
		for(int i = 0; i < courses.size(); i++) {
			for(int j = 0; j < courses.get(i).getStudents().size(); j++) {
				total.add(courses.get(i).getStudents().get(j));
			}
		}
		
		return total.size();
	}

}
