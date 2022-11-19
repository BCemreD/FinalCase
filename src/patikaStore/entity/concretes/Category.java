package patikaStore.entity.concretes;

import java.util.Scanner;

import patikaStore.business.abstracts.ICategoryService;

public class Category {

	int categoryId;
	String categoryType;
	public Category(int categoryId, String categoryType) {
		super();
		this.categoryId = categoryId;
		this.categoryType = categoryType;
	}
	
	
	
}
