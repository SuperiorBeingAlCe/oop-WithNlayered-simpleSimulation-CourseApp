package oopWithNlayeredCourse.Business;



import java.util.List;

import oopWithNlayeredCourse.core.logging.Logger;
import oopWithNlayeredCourse.dataAccess.InstructorDao;
import oopWithNlayeredCourse.entities.Instructor;

public class InstructorManager {

	 List<Instructor> instructorList;
	private InstructorDao dao;
    private Logger[] loggers;
	
public InstructorManager() {
	
}    
    
    
	public InstructorManager(InstructorDao dao,Logger[] loggers,  List<Instructor> instructorList) {
	
		this.dao = dao;
		this.loggers = loggers;
		this .instructorList =instructorList;
	}
	
	public InstructorManager(InstructorDao dao,Logger[] loggers) {
		this.dao = dao;
		this.loggers = loggers;
	}
	
	 public void add(Instructor instructor) {
	        // Check duplicate instructors
	        if (isDuplicateInstructor(instructor)) {
	            System.out.println("eğitmen adı tekrar edemez");
	            return;
	        }

	        instructorList.add(instructor);
		
		for (Logger logger : loggers) {
			logger.log(instructor.getFirstName());
		}
	}
	
	 private boolean isDuplicateInstructor(Instructor instructor) {
	        for (Instructor instructorToCheck : instructorList) {
	            if (instructorToCheck.getId() == instructor.getId() || (
	                    instructorToCheck.getFirstName().equals(instructor.getFirstName()) &&
	                            instructorToCheck.getLastName().equals(instructor.getLastName())))
	                return true; // Found a duplicate
	        }
	        return false; // No duplicates found
	    }

	    // Async get function?
	    List<Instructor> getInstructorListFromDatabase(InstructorDao instructorDao) {
	        return instructorDao.getInstructorList();
	    }

	    void updateInstructorListFromDatabase(InstructorDao instructorDao) {
	        setInstructorList(instructorDao.getInstructorList());
	    }
	    
    public List<Instructor> getInstructorList() {
        return instructorList;
    }

    public void setInstructorList(List<Instructor> instructorList) {
        this.instructorList = instructorList;
    }
	
	
	
}
