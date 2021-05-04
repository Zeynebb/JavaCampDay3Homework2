package Concrete;

import Entities.Course;
import Entities.Instructor;

public class InstructorManager {
	
	public void instructorAdd(Instructor instructor) {
		System.out.println(instructor.getFistName() + " " + instructor.getLastName() + " isimli egitmen sisteme eklendi.");
	}
	public void instructorDelete(Instructor instructor) {
		System.out.println(instructor.getFistName() + " " + instructor.getLastName() +" isimli egitmen sistemden silindi.");
	}

	public void instructorUpdate(Instructor instructor) {
		System.out.println(instructor.getFistName() + " " + instructor.getLastName() +" isimli egitmenin bilgileri g�ncellendi.");
	}
	
	public void addCourse(Instructor instructor, Course course) {
		System.out.println(
				instructor.getFistName() + " " + instructor.getLastName() 
				+ " isimli egitmen '" + course.getCourseName()
				+ "' isimli kursu sisteme ekledi.");
	}
	public void deleteCourse(Instructor instructor, Course course) {
		System.out.println(
				instructor.getFistName() + " " + instructor.getLastName() 
				+ " isimli egitmen '" + course.getCourseName()
				+ "' isimli kursu sistemden sildi.");
	}
	public void updateCourse(Instructor instructor, Course course) {
		System.out.println(
				instructor.getFistName() + " " + instructor.getLastName() 
				+ " isimli e�itmen '" + course.getCourseName()
				+ "' isimli kursu g�ncelledi.");
	}

}
