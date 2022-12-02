package patikaStore.business.concretes;

import java.util.Scanner;

import patikaStore.business.abstracts.IProductService;
import patikaStore.entity.concretes.Product;


public class ProductManager implements IProductService{
	
	Product tulpar = new Product(1,"Notebook", "Monster", "Tulpar",25000,15,10);
	Product redmi = new Product(2,"Phone", "Xiaomi", "Redmi",5000,25,16);
	
	static Scanner s = new Scanner(System.in);
	
	Product p = new Product();
	CategoryManager c = new CategoryManager();
	String pr, pb;
	int pi = 2,pc;
	

public ProductManager(Product p, String pr, String pb, int pi, int pc) {
		super();
		this.p = p;
		this.pr = pr;
		this.pb = pb;
		this.pi = pi;
		this.pc = pc;
	}
	
	public ProductManager() {}
@Override
	public  void add() 
	{
		
		System.out.println("Enter the product brand");
		pb = s.next();
		System.out.println("Enter the product name");
		pr = s.next();
		System.out.println("Dedicate the price");
		int price = s.nextInt();
		System.out.println("Select your category: "
						  + "\n1) Smart Phone with 64 GB Memo."
						  + "\n2) Smart Phone with 128 GB Memo."
						  + "\n3) Notebook.");
		pc = s.nextInt();
		switch (pc) 
		{
		case 1: 
			pi++;
			p.setProductId(pi);p.setBrandName(pb); p.setProductName(pr);p.setCategory("Phone"); p.setPrice(price);
			System.out.println("\nId" + "     |   " + "Brand " + "    |   " + "Model"+"    |  " + "Price");
			System.out.println("\n"+ p.getProductId() + "          " +p.getBrandName()+"          "+p.getProductName()+"           " + p.getPrice());
					
			break;
		case 2:
			pi++;
			p.setProductId(pi);p.setBrandName(pb); p.setProductName(pr);p.setCategory("Phone");p.setPrice(price);
			System.out.println("\nId" + "     |   " + "Brand " + "    |   " + "Model"+"    |  " + "Price");
			System.out.println("\n"+ p.getProductId() + "          " +p.getBrandName()+"          "+p.getProductName()+"           " + p.getPrice());
			
			break;
		case 3:
			pi++;
			p.setProductId(pi);p.setBrandName(pb); p.setProductName(pr);p.setCategory("Notebook");p.setPrice(price);
			System.out.println("\nId" + "     |   " + "Brand " + "    |   " + "Model"+"    |  " + "Price");
			System.out.println("\n"+ p.getProductId() + "          " +p.getBrandName()+"          "+p.getProductName()+"           " + p.getPrice());
			
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + pi);
		}
		
		
	
    }
@Override	
	public  void delete ()
	{
		System.out.println("Write id of the product you want to delete.");
		pi = s.nextInt();
		p.setProductId(pi);p.setProductName(pb);
		System.out.println(pb + " is deleted");
		pi--;
	
	}
@Override	
	public void listBy() //listing products by brands
	{		
		Product p2 = new Product();
	
	
		do 
		{
			System.out.println("Select brand:"
					
					+"\n1) Apple \r\n"
					+ "2) Asus \r\n"
					+ "3) Casper \r\n"
					+ "4) HP \r\n"
					+ "5) Huawei \r\n"
					+ "6) Lenovo \r\n"
					+ "7) Monster \r\n"
					+ "8) Samsung \r\n"
					+ "9) Xiaomi   "
					+ "\n0) Main Menu");
	
			pc = s.nextInt();
		
			switch(pc)
			{
			case 1:
				System.out.println(	"Apple products");
				System.out.println("\nBrand" + "    |   " + "Model"+"   |   "+"Price");
				if (pb == null)
				{
					return;
				}
				else if(pb.equals("Apple"))
				{
					System.out.println("\n"+p.getBrandName()+"       "+p.getProductName()+"      " + p.getPrice());
					
				}
				break;
			case 2:
				System.out.println("Asus products");
				System.out.println("\nBrand" + "    |   " + "Model"+"   |   "+"Price");
				if (pb == null)
				{
					return;
				}
				else if(pb.equals("Asus"))
				{
					System.out.println("\n"+p.getBrandName()+"       "+p.getProductName()+"      " + p.getPrice());
					
				}
				break;
			case 3:
				System.out.println("Casper products");
				System.out.println("\nBrand" + "    |   " + "Model"+"   |   "+"Price");
				if (pb == null)
				{
					return;
				}
				else if(pb.equals("Casper"))
				{
					System.out.println("\n"+p.getBrandName()+"       "+p.getProductName()+"      " + p.getPrice());
					
				}
				break;
			case 4:
				System.out.println("HP products");
				System.out.println("\nBrand" + "    |   " + "Model"+"   |   "+"Price");
				if (pb == null)
				{
					return;
				}
				else if(pb.equals("HP"))
				{
					System.out.println("\n"+p.getBrandName()+"       "+p.getProductName()+"      " + p.getPrice());
					
				}
				break;
			case 5:
				System.out.println("Huawei Products");
				System.out.println("\nBrand" + "    |   " + "Model"+"   |   "+"Price");
				if (pb == null)
				{
					return;
				}
				else if(pb.equals("Huawei"))
				{
					System.out.println("\n"+p.getBrandName()+"       "+p.getProductName()+"      " + p.getPrice());
					
				}
				break;
			case 6:
				System.out.println("Lenovo products");
				System.out.println("\nBrand" + "    |   " + "Model"+"   |   "+"Price");
				if (pb == null)
				{
					return;
				}
				else if(pb.equals("Lenovo"))
				{
					System.out.println("\n"+p.getBrandName()+"       "+p.getProductName()+"      " + p.getPrice());
					
				}
				break;
			case 7:
				System.out.println("Monster products \r\n");
				p2.setProductId(1);c.getNotebook();p2.setBrandName("Monster"); p2.setProductName("Tulpar"); p2.setPrice(25000);
				System.out.println("\nBrand " + "     |   " + "Model"+"    |  "+"Price");
				System.out.println("\n"+p2.getBrandName()+"       "+p2.getProductName()+"      " + p2.getPrice());
				
				if (pb == null)
				{
					return;
				}
				else if(pb.equals("Monster"))
				{
					System.out.println("\n"+p.getBrandName()+"       "+p.getProductName()+"      " + p.getPrice());
					
				}
				break;
			case 8:
				System.out.println("Samsung products");
				System.out.println();
				if (pb == null)
				{
					return;
				}
				else if(pb.equals("Samsung"))
				{
					System.out.println("\n"+p.getBrandName()+"       "+p.getProductName()+"      " + p.getPrice());
					
				}
				break;
			case 9:
				System.out.println("Xiaomi products \r\n");
				p2.setProductId(2);p2.setBrandName("Xiaomi"); p2.setProductName("Redmi"); p2.setPrice(7500);
				System.out.println("\nBrand" + "    |   " + "Model"+"   |   "+"Price");
				System.out.println("\n"+p2.getBrandName()+"       "+p2.getProductName()+"       " +p2.getPrice());
				if (pb == null)
				{
					return;
				}
				else if(pb.equals("Xiaomi"))
				{
					System.out.println("\n"+p.getBrandName()+"       "+p.getProductName()+"      " + p.getPrice());
					
				}
				break;
			default: System.out.println("Loading main menu!");
			}
			
		} while (pc!=0 );
		
		
	}

	@Override
	public String getByCategory()
	{
		
			ProductManager pm = new ProductManager();
			Scanner sc = new Scanner (System.in);
			System.out.println("Enter category number: "
					            + "\n1) Notebook List"
					            +"\n2) Phone List"
					            +"\nEnter 0 to directed main page" );
			int cat = sc.nextInt();
			
			switch (cat) {
			case 1:
				System.out.println("Notebooks\r\n");
				System.out.println("\nId " + "    |   " + "Brand" + "     |   " + "Model"+"    |  "+"Price ");
				System.out.println( tulpar.getProductId() + "           " + tulpar.getBrandName()+ "       "+tulpar.getProductName()+ "       " + tulpar.getPrice());
				
				if (pc == 3)
				{
										
					System.out.println("\n"+p.getProductId()+"        "+p.getBrandName()+"          "+p.getProductName()+"            "+p.getPrice());	
				}
				else return null;
				break;
			case 2:
				System.out.println("Smart Phones \r\n");
				System.out.println("\nId" + "     |   " + "Brand " + "    |   " + "Model"+"    |  " + "Price");
				System.out.println("\n"+redmi.getProductId()+"        "+redmi.getBrandName()+"         "+redmi.getProductName()+"        "+redmi.getPrice()); 
				if(pc == 1 || pc == 2)
				{
					System.out.println("\n"+p.getProductId()+"        "+p.getBrandName()+"          "+p.getProductName()+"            "+p.getPrice());					
				}
				
				
				else return null;
				
				break;
				
			default:
				System.out.println("Main menu!");
				break;
			}
		
		
		return null;
	}

	

}
