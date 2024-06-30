package oopWithNlayeredCourse.dataAccess;

import java.util.List;

import oopWithNlayeredCourse.entities.Instructor;

public interface InstructorDao {

	public void add(Instructor instructor);
	public void delete(Instructor instructor);
	public void update(Instructor instructor);

	  List<Instructor> getInstructorList();
	
}
