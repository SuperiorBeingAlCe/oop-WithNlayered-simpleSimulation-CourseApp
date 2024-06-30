package oopWithNlayeredCourse.Business;

import java.util.ArrayList;
import java.util.List;

import oopWithNlayeredCourse.core.logging.Logger;
import oopWithNlayeredCourse.dataAccess.CategoryDao;
import oopWithNlayeredCourse.entities.Category;

public class CategoryManager {

	private CategoryDao[] dao;
	private Logger[] loggers;
	  List<Category> categoryList = new ArrayList<>();
	
	  public CategoryManager(CategoryDao[] categoryDao, Logger[] loggers, List<Category> categoryList) {
	        this.dao = categoryDao;
	        this.loggers = loggers;
	        this.categoryList = categoryList;
	    }

	    public CategoryManager(CategoryDao[] categoryDao, Logger[] loggers) {
	        this.dao = categoryDao;
	        this.loggers = loggers;
	    }


	    public void add(Category category) {
	        // Condition checks
	        if (isDuplicateCategory(category)) {
	            System.out.println("Category " + category.getName() + " bu kategori zaten var");
	            return;
	        }

	        categoryList.add(category);
	        
		
		for (Logger logger : loggers) {
			logger.log(category.getName());
		}
		
	}
	
	   private boolean isDuplicateCategory(Category category) {
	        for (Category categoryToCheck : categoryList) {
	            if (categoryToCheck.getId() == category.getId() ||
	                    categoryToCheck.getName().equals(category.getName())) {
	                return true; // Found a duplicate
	            }
	        }
	        return false; // No duplicates found
	    }
	
}
