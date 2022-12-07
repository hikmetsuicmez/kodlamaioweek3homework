package week3odev3.business;

import week3odev3.core.logging.Logger;
import week3odev3.dataAccess.InstructorDao;
import week3odev3.entities.Instructor;

public class InstructorManager {
	private InstructorDao instructorDao;
	private Logger logger;
	
	
	public InstructorManager(InstructorDao instructorDao, Logger logger) {
		this.instructorDao = instructorDao;
		this.logger = logger;
	}
	
	
	public void add(Instructor instructor) {
		instructorDao.add(instructor);
		logger.log(instructor.getFirstName() +" "+ instructor.getLastName());
	}
	
}
