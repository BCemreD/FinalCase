package patikaStore;

import java.util.Scanner;

import patikaStore.business.concretes.BrandManager;
import patikaStore.business.concretes.CategoryManager;
import patikaStore.business.concretes.ProductManager;


public class Main {
	

	public static void main(String[] args) {
		
		System.out.println("Welcome Patika Store! ");

	//invoke managers to invoke methodes.
		BrandManager b = new BrandManager();
		ProductManager p = new ProductManager();
		CategoryManager c = new CategoryManager();
	//dedicated menu	
		String menu = "\n1- Add product"
		             + "\n2- Delete product"
		             + "\n3- List Products"
		             + "\n4- Filter products by category"
		             + "\n5- Add Category"
		  			 + "\n6- Show brands";
		       int select ;
    //creating user interface    		   
		  do
		  {
			 Scanner scan = new Scanner (System.in);
			 System.out.println(menu);
		     System.out.print("\nPlease choose your operation: ");
		       select = scan.nextInt();
			
				switch (select) 
		        {
				case 1:
					p.add();
					break;
				case 2:
					p.delete();
					break;
				case 3:
					p.listBy();
					break;
				case 4:
					p.getByCategory();
					break;
				case 5:
					//c.add(); This property would be opened if wanted
					System.out.println("\nThis operator is presently out of service.");
					break;
		        case 6:
					b.listBrand(null);
					break;
		      
		        default:
		            System.out.println("\nInvalid input. Please, try again.");
		        }
			}
			while(select !=0);
				
	}

	

}
