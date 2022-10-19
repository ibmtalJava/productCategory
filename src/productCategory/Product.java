package productCategory;

public class Product {
	private String name;
	private String photo;
	private double price;
	private double discountRate;
	private double quantity;
	private Brand brand;
	private Category category;
	public Product() {
		super();
	}
	public Product(String name, String photo, double price, double discountRate, double quantity) {
		super();
		this.name = name;
		this.photo = photo;
		this.price = price;
		this.discountRate = discountRate;
		this.quantity = quantity;
	}
	public Product(String name, String photo, double price, double discountRate, double quantity, Brand brand,
			Category category) {
		super();
		this.name = name;
		this.photo = photo;
		this.price = price;
		this.discountRate = discountRate;
		this.quantity = quantity;
		this.brand = brand;
		this.category = category;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getDiscountRate() {
		return discountRate;
	}
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	public Brand getBrand() {
		return brand;
	}
	public void setBrand(Brand brand) {
		this.brand = brand;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	
	
}
