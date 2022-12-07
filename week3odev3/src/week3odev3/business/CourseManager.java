package week3odev3.business;

import java.util.ArrayList;
import java.util.List;

import week3odev3.core.logging.Logger;
import week3odev3.dataAccess.CourseDao;
import week3odev3.entities.Course;

public class CourseManager {
	private CourseDao courseDao;
	private Logger[] loggers;
	private List<Course> courseList = new ArrayList<>();

	public CourseManager(CourseDao courseDao, Logger[] loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;
	}

	public void add(Course course) throws Exception {
		if (course.getCoursePrice() < 10) {
			throw new Exception("Kurs fiyati 0'dan kucuk olamaz : " + course.getCoursePrice());
		}

		for (Course courses : courseList) {
			if (courses.getCourseName().equals(course.getCourseName())) {
				throw new Exception("Bu kurs ismi mevcuttur." + course.getCourseName());
			}

		}
		courseDao.add(course);
		for (Logger logger : loggers) {
			logger.log(course.getCourseName());
		}
	}

}
