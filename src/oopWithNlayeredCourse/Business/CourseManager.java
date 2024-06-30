package oopWithNlayeredCourse.Business;

import java.util.List;

import oopWithNlayeredCourse.core.logging.Logger;
import oopWithNlayeredCourse.dataAccess.CourseDao;
import oopWithNlayeredCourse.entities.Course;
import oopWithNlayeredCourse.entities.Instructor;

public class CourseManager {

	private CourseDao[] dao;
    private Logger[] loggers;
	
    List<Course> courseList;
    

    CourseManager() {
    }

    public CourseManager(CourseDao[] courseDao, Logger[] loggers) {
        this.dao = courseDao;
        this.loggers = loggers;
    }

    public CourseManager(CourseDao[] courseDao, Logger[] loggers, List<Course> courseList) {
        this.dao = courseDao;
        this.loggers = loggers;
        this.courseList = courseList;
    }
		
		public void add(Course course) throws Exception{
			
			 
			        // Condition checks
			        if (isDuplicateCourse(course)) { // Duplicate course name
			            System.out.println("Course " + course.getPrice() + " bu kurs zaten var");
			            return;
			        }
			        if (course.getPrice() < 0) { // Course price must be > 0
			            System.out.println("Price (" + course.getPrice() + ") of course " + course.getName() + " is invalid!");
			            return;
			        }
			        courseList.add(course);
			
			for (Logger logger : loggers) {
				logger.log(course.getName());
			}
			
		}	
			 private boolean isDuplicateCourse(Course course) {
			        for (Course courseToCheck : courseList) {
			            if (courseToCheck.getId() == course.getId() ||
			                    courseToCheck.getName().equals(course.getName())) {
			                return true; // Found a duplicate
			            }
			        }
			        return false; // No duplicates found
			    }

			    public void listInstructors(Course course) {
			        List<Instructor> instructorList = course.getInstructors();
			        System.out.println("Instructor list of the " + course.getName());
			        for (Instructor instructor : instructorList) {
			            System.out.println(instructor.getFirstName() + " " + instructor.getLastName());
			        }
			    
			    
			    
		}
}

