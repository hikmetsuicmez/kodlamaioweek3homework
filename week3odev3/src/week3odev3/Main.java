package week3odev3;

import week3odev3.business.CourseManager;
import week3odev3.business.InstructorManager;
import week3odev3.core.logging.DatabaseLogger;
import week3odev3.core.logging.EmailLogger;
import week3odev3.core.logging.FileLogger;
import week3odev3.core.logging.Logger;
import week3odev3.dataAccess.HibernateCourseDao;
import week3odev3.dataAccess.JdbcCourseDao;
import week3odev3.dataAccess.JdbcInstructorDao;
import week3odev3.entities.Course;
import week3odev3.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {
		

		Course course = new Course("Java", "Software", "engin demirog", 600);
		Instructor instructor = new Instructor("Engin", "Demirog", 20000);
		
		Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new EmailLogger()};
		
		
		CourseManager courseManager = new CourseManager(new HibernateCourseDao(),loggers);
		courseManager.add(course);
		System.out.println();
		InstructorManager instructorManager = new InstructorManager(new JdbcInstructorDao(), new DatabaseLogger()); 
		instructorManager.add(instructor);
		
		
	}

}
