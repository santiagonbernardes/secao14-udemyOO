package exercicioPropostoSet.application;

import java.util.Scanner;

import exercicioPropostoSet.entities.Course;
import exercicioPropostoSet.entities.Instructor;
import exercicioPropostoSet.entities.Student;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Instructor instructor = new Instructor("Alex");
		
		instructor.add(new Course("A"));
		instructor.add(new Course("B"));
		instructor.add(new Course("C"));
		
		for(int i = 0; i < instructor.getCourses().size(); i++) {
			System.out.print("How many students for course "+ instructor.getCourses().get(i).getName() +"? ");
			int numberOfStudents = sc.nextInt();
			
			for(int j = 0; j < numberOfStudents; j++) {
				instructor.getCourses().get(i).add(new Student(sc.nextInt()));
			}
		}
		
		System.out.println("Total Students: " + instructor.getTotalStudents());
		
		sc.close();

	}

}
