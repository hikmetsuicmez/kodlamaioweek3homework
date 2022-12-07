package week3odev3.dataAccess;

import week3odev3.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao{

	@Override
	public void add(Instructor instructor) {
		System.out.println("Jdbc ile eklendi : " + instructor.getFirstName());
		
	}

}
