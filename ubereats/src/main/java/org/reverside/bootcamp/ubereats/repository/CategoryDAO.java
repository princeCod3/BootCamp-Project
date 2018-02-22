package org.reverside.bootcamp.ubereats.repository;

import java.util.List;

import org.reverside.bootcamp.ubereats.dto.Category;

public interface CategoryDAO {

	boolean addCategory(Category category);
	
	List<Category> list();
	Category get(int id);
	
}
