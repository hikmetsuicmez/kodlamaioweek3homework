package week3odev3.dataAccess;

import week3odev3.entities.Course;

public class JdbcCourseDao implements CourseDao{

	@Override
	public void add(Course course) {
		System.out.println("Jdbc ile eklendi : " + course.getCourseName());
		
	}

}
