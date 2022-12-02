package patikaStore.business.concretes;

import java.util.Arrays;
import java.util.TreeSet;

import patikaStore.business.abstracts.IBrandService;
import patikaStore.entity.concretes.Brand;

public class BrandManager implements IBrandService {


	 static String []brands ={
				"Samsung",
				"Lenovo",
				"Apple",
				"Huawei",
				"Casper",
				"Asus",
				"HP",
				"Xiaomi",
				"Monster"
			};


@Override
	public void listBrand (Brand brand)
//method for alphabetical order of brands
	{ 
	  System.out.println("\nBrands are:\n ");
	  for (int i = 0; i <brands.length; i++)
	  {	
		Arrays.sort(brands, String.CASE_INSENSITIVE_ORDER);
		System.out.println( brands[i] + " ");
	  }
	}

	
}
