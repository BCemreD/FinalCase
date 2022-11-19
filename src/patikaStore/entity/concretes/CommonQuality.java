package patikaStore.entity.concretes;

public class CommonQuality {
	
	int id;
	double price;
	double discount;
	int unitsInPrice;
	String name;
	String brand;
	public CommonQuality() {};
	public CommonQuality(int id, double price, double discount, int unitsInPrice, String name, String brand) {
		super();
		this.id = id;
		this.price = price;
		this.discount = discount;
		this.unitsInPrice = unitsInPrice;
		this.name = name;
		this.brand = brand;
	}
	

}
