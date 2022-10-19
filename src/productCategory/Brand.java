package productCategory;

public class Brand {
	private String name;
	private String logo;
	private String email;
	private String address;
	private Company company;
	
	public Brand() {
		super();
	}
	public Brand(String name, String logo, String email, String address) {
		super();
		this.name = name;
		this.logo = logo;
		this.email = email;
		this.address = address;
	}
	public Brand(String name, String logo, String email, String address, Company company) {
		super();
		this.name = name;
		this.logo = logo;
		this.email = email;
		this.address = address;
		this.company = company;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	
	
}
