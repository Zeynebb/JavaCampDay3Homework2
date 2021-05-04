package Concrete;

import Entities.Course;
import Entities.Student;

public class StudentManager {

	public void studentAdd(Student student) {
		System.out.println(student.getFistName() + " " + student.getLastName() + " isimli ogrenci sisteme eklendi.");
	}

	public void studentDelete(Student student) {
		System.out.println(student.getFistName() + " " + student.getLastName() + " isimli ogrenci sistemden silindi.");
	}

	public void studentUpdate(Student student) {
		System.out.println(
				student.getFistName() + " " + student.getLastName() + " isimli ogrencinin bilgileri guncellendi.");
	}

	public void addToCourse(Student student, Course course) {
		System.out.println(student.getFistName() + " " + student.getLastName() + " isimli ogrenci '"
				+ course.getCourseName() + "' isimli kursa kayit oldu. Kurs egitmeni: "
				+ course.getInstructor().getFistName() + " " + course.getInstructor().getLastName());
	}
	public void removeFromCourse(Student student, Course course) {
		System.out.println(student.getFistName() + " " + student.getLastName() + " isimli ogrenci '"
				+ course.getCourseName() + "' isimli kurstan kaydini sildi. Kurs egitmeni: "
				+ course.getInstructor().getFistName() + " " + course.getInstructor().getLastName());
	}

}
