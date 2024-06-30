package oopWithNlayeredCourse.entities;

import java.util.Iterator;
import java.util.List;

public class Course {

	private int id;
	private String name;
	private String description;
	 private List<Instructor> instructors;
	private double price;
	private String imgUrl;
	
	public Course() {
	
	}

	public Course(int id, String name, String description,List<Instructor> instructors ,double price, String imgUrl) {
	
		this.id = id;
		this.name = name;
		this.description = description;
		this.instructors = instructors;
		this.price = price;
		this.imgUrl = imgUrl;
	}
	
	public Course(int id, String name, String description,Instructor instructor ,double price, String imgUrl) {
		
		this.id = id;
		this.name = name;
		this.description = description;
		addInstructor(instructor);
		this.price = price;
		this.imgUrl = imgUrl;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	
	  public List<Instructor> getInstructors() {
	        return instructors;
	    }

	    public void setInstructors(List<Instructor> instructors) {
	        this.instructors = instructors;
	    }

	    public void addInstructor(Instructor instructor) {
	        this.instructors.add(instructor);
	    }

	    public boolean removeInstructor(Instructor instructor) {
	        return this.instructors.remove(instructor);
	    }
	    
	    public boolean removeInstructorByName(String firstName, String lastName) {
	        Iterator<Instructor> iterator = this.instructors.iterator();
	        while (iterator.hasNext()) {
	            Instructor instructor = iterator.next();
	            if (instructor.getFirstName().equals(firstName) && instructor.getLastName().equals(lastName)) {
	                iterator.remove(); // Safely remove the matching instructor
	                return true; // Instructor found and removed
	            }
	        }
	        return false; // No instructor found with the given name
	    }

	
		
	
}
