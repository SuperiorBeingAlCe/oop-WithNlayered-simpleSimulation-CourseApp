package oopWithNlayeredCourse;

import java.util.ArrayList;
import java.util.List;

import oopWithNlayeredCourse.Business.CategoryManager;
import oopWithNlayeredCourse.Business.CourseManager;
import oopWithNlayeredCourse.Business.InstructorManager;
import oopWithNlayeredCourse.core.logging.DatabaseLogger;
import oopWithNlayeredCourse.core.logging.FİleLogger;
import oopWithNlayeredCourse.core.logging.Logger;
import oopWithNlayeredCourse.core.logging.MailLogger;
import oopWithNlayeredCourse.dataAccess.CategoryDao;
import oopWithNlayeredCourse.dataAccess.CourseDao;
import oopWithNlayeredCourse.dataAccess.HibernateDao;
import oopWithNlayeredCourse.dataAccess.JbdcDao;
import oopWithNlayeredCourse.entities.Category;
import oopWithNlayeredCourse.entities.Course;
import oopWithNlayeredCourse.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {
		
		 Instructor instructor1 = new Instructor(0, "Engin", "Demiröğ");
	        Instructor instructor2 = new Instructor(1, "Halit Enes", "Kalaycı");
	        Instructor instructor3 = new Instructor(2, "John", "Doe");

	        List<Instructor> instructors = new ArrayList<Instructor>();
	        instructors.add(instructor1);
	        instructors.add(instructor2);
	        instructors.add(instructor3);
	        Instructor[] instructors1 = {instructor2, instructor3};

	        Category category1 = new Category(0, "All");
	        Category category2 = new Category(1, "Programming");

	        Course course1 = new Course(0, "Java", "açıklama", instructors, 300, "image.jpg");
	        Course course2 = new Course(1, "Front-End", "açıklama", instructor3, 200, "image.jpg");
	        Course course3 = new Course(2, "Kotlin", "açıklama ", List.of(instructors1), -1, "image.jpg");
	        List<Course> courseList = new ArrayList<>();
	        courseList.add(course1);


	        // Create Daos, Loggers, Managers
	        CourseDao[] courseDaos = {new JbdcDao(), new HibernateDao()};
	        Logger[] loggers = {new DatabaseLogger(), new MailLogger(), new FİleLogger()};

	        CourseManager courseManager = new CourseManager(courseDaos, loggers, courseList);
	        courseManager.add(course1);
	        courseManager.add(course2);
	        courseManager.add(course3);


	        // CategoryDaos
	        CategoryDao[] categoryDaos = {new JbdcDao(), new HibernateDao()};
	        CategoryManager categoryManager = new CategoryManager(categoryDaos, loggers);
	        System.out.println("\nCategory operations");
	        categoryManager.add(category1);
	        categoryManager.add(category2);
	        categoryManager.add(category1);

	        InstructorManager instructorManager = new InstructorManager();


	}

}
