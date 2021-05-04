package main;

import Concrete.InstructorManager;
import Concrete.StudentManager;
import Entities.Course;
import Entities.Instructor;
import Entities.Student;

public class Main {

	public static void main(String[] args) {		
		Student zeyneb=new Student("Zeyneb", "Yilmaz","zeyneb@email.com");
		Student zeynebEda=new Student("Zeyneb Eda", "Yilmaz","zeynebEda@email.com");
		
		Instructor engin=new Instructor("Engin", "Demirog","engin@email.com");
		
		Course java=new Course(1, "Java + React", engin);
		Course cSharp=new Course(1, "C# + Angular", engin);
		
		StudentManager studentManager=new StudentManager();
		InstructorManager instructorManager=new InstructorManager();
		
		instructorManager.instructorAdd(engin);
		instructorManager.addCourse(engin, java);
		instructorManager.addCourse(engin, cSharp);
		
		
		studentManager.studentAdd(zeyneb);
		studentManager.studentAdd(zeynebEda);
		studentManager.studentUpdate(zeynebEda);
		studentManager.studentDelete(zeyneb);

		studentManager.addToCourse(zeynebEda, java);
		studentManager.addToCourse(zeynebEda, cSharp);
		studentManager.removeFromCourse(zeynebEda, cSharp);
		
		
		
		
		

	}

}
