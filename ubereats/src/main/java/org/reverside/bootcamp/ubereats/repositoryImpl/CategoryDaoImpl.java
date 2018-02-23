package org.reverside.bootcamp.ubereats.repositoryImpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.reverside.bootcamp.ubereats.dto.Category;
import org.reverside.bootcamp.ubereats.repository.CategoryDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("categoryDAO")
public class CategoryDaoImpl implements CategoryDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	private static List<Category> categories = new ArrayList<>();
	
	//Category declarations 
	static {
		 Category category = new Category();
		 
		//first category definition
		category.setId(1);
		category.setName("TestName");
		category.setDescription("TestDescription // I am using JUNIT to test this");
		
		categories.add(category);
		
		
	}

	@Override
	@Transactional
	public boolean addCategory(Category category) {
		
		try {
			
			//add category to the database
			
			sessionFactory.getCurrentSession().persist(category);
			
			return true;
		}
		catch(Exception e){
			
			e.printStackTrace();
			
			return false;
		}
	}

	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Category get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateCategory(Category category) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteCategory(Category category) {
		// TODO Auto-generated method stub
		return false;
	}

}
