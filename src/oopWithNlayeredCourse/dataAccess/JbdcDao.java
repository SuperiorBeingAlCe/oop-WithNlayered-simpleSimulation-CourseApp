package oopWithNlayeredCourse.dataAccess;

import java.util.List;

import oopWithNlayeredCourse.entities.Category;
import oopWithNlayeredCourse.entities.Course;
import oopWithNlayeredCourse.entities.Instructor;

public class JbdcDao implements CourseDao, CategoryDao, InstructorDao{

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
			
			
		}

		@Override
		public void delete(Instructor instructor) {
			
			
		}
		
		
	//category
		@Override
		public void update(Instructor instructor) {
			
		}

		@Override
		public void add(Category category) {
			
			
		}

		@Override
		public void delete(Category category) {
			
			
		}

		@Override
		public void update(Category category) {

			
		}

		@Override
		public List<Instructor> getInstructorList() {
			// TODO Auto-generated method stub
			return null;
		}

}
