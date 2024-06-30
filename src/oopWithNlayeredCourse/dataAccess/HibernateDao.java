package oopWithNlayeredCourse.dataAccess;

import java.util.List;

import oopWithNlayeredCourse.entities.Category;
import oopWithNlayeredCourse.entities.Course;
import oopWithNlayeredCourse.entities.Instructor;

public class HibernateDao implements CourseDao, CategoryDao, InstructorDao{

	//course
	@Override
	public void add(Course course) {
		
		
	}

	@Override
	public void delete(Course course) {
		
		
	}

	@Override
	public void update(Course course) {
	
		
	}

	//Instructor
	@Override
	public void add(Instructor instructor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Instructor instructor) {
		// TODO Auto-generated method stub
		
	}
	
	
//category
	@Override
	public void update(Instructor instructor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void add(Category category) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Category category) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Category category) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Instructor> getInstructorList() {
		// TODO Auto-generated method stub
		return null;
	}

}
