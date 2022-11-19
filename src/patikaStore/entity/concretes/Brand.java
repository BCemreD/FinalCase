package patikaStore.entity.concretes;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class Brand {
	
	int[] id = { 1,2,3,5,6,7,8,9};

	String[] name =
	{
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

	public void print (Brand brand)
	{ //alphabetical order
		System.out.println("\nBrands are:\n ");
		for (int i = 0; i <name.length; i++)
		{	
			Arrays.sort(name, String.CASE_INSENSITIVE_ORDER);
			System.out.println( name[i] + " ");
		}
	}
}
