package patikaStore.business.abstracts;
import patikaStore.entity.concretes.Category;


public interface ICategoryService {
	
	void add(Category category);
	void getAll();
	void run (Category category);

}
