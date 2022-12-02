package patikaStore.entity.concretes;

public class Product {
	private int productId;
	private String category;
	private String brandName;
	private String productName;
	private int price;
	private int discount;
	private int unitsInStock;
	
	public Product() {}
	
	public Product( int productId, String category,  String brandName, String productName, int price, int discount, int unitsInStock) {
		super();
		this.productId = productId;
		this.category = category;
		this.brandName = brandName;
		this.productName = productName;
		this.price = price;
		this.discount = discount;
		this.unitsInStock = unitsInStock;
	}
	
	
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	
		}
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
		
	
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public boolean setProductName(Product p) {
		return false;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public int getUnitsInStock() {
		return unitsInStock;
	}
	public void setUnitsInStock(int unitsInStock) {
		this.unitsInStock = unitsInStock;
	}
	
}
