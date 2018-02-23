package org.reverside.bootcamp.ubereats.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.reverside.bootcamp.ubereats.dto.Category;
import org.reverside.bootcamp.ubereats.repository.CategoryDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CategoryTestCase {
	
	private static AnnotationConfigApplicationContext context;
	
	private static CategoryDAO categoryDAO;
	
	private Category category;
	
	@BeforeClass
	public static void init() {
		
		context = new AnnotationConfigApplicationContext();
		
		context.scan("org.reverside.bootcamp.ubereats");
		context.refresh();
		// Typecasting is used here because method returns object
		
		categoryDAO = (CategoryDAO)context.getBean("categoryDAO");
		
		
	}
  
	
	@Test 
    public void TestAddCategory( ) {
		
		category = new Category();
		//testing a static input
		category.setName("TestName");
		category.setDescription("TestDescription // I am using JUNIT to test this");
		
		assertEquals("Successfully added category inside table",true,categoryDAO.addCategory(category));
		
		
	}
}
