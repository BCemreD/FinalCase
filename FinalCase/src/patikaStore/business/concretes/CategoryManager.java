package patikaStore.business.concretes;


import java.util.Scanner;

import patikaStore.business.abstracts.ICategoryService;
import patikaStore.entity.concretes.NotebookQuality;
import patikaStore.entity.concretes.PhoneQuality;


public class CategoryManager implements ICategoryService{
//adding category types with 64 gb phone, 128 gb phone and notebook
	final private String phone64 = "Phone", phone128 = "Phone", notebook = "Notebook";
	NotebookQuality nq = new NotebookQuality();
	PhoneQuality pq = new PhoneQuality();
	
	public CategoryManager(){}

	public String getPhone64() {
			return "Memo " + pq.getMemoP64() + " Screen ";
		
	}
	
	public String getPhone128() {
		return "Memo " + pq.getMemoP128();
	}
	public String getNotebook() {
		return notebook;
	}
	
	Scanner s = new Scanner(System.in);
	String p, n;
	
	@Override
	public void add() {
		//for future, adding category type method
		System.out.println("Enter category type with first capital letter (ex: Phone): ");
		n = s.next();
		if (n.equals(phone64) || n.equals(phone128) || n.equals(notebook))
		{
			System.out.println("This category is already declared.");
		}
		
		else System.out.println("New category is " + n);
	}

}
