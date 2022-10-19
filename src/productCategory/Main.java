package productCategory;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Company> companies=new ArrayList<>();
		companies.add(new Company("Apple","California /USA", "+4724855"));
		companies.add(new Company("Arçelik","İstanbul /Turkey", "+908400445544"));
		companies.add(new Company("Unilever ","Paris /France", "+1004874111"));
		
		ArrayList<Category> categories = new ArrayList<>();
		categories.add(new Category("Elektronik", "elo.png"));// 0
		categories.add(new Category("Kozmetik", "kozmetik.png"));// 1
		categories.add(new Category("Giyim", "giysi.png"));// 2
		categories.add(new Category("Gıda", "ekmek.png"));// 3
		
		ArrayList<Brand> brands = new ArrayList<>();
		brands.add(new Brand("Beko", "beko.png", "info@beko.com", "İstanbul /Türkiye"));// 0
		brands.add(new Brand("Arçelik", "arcelik.png", "destek@arcelik.com.tr", "Bolu"));// 1
		brands.add(new Brand("IPhone", "elma.png", "info@apple.com", "Arizone / USA"));// 2
		brands.add(new Brand("Clear", "sampuan.png", "info@clear.com", "Paris / France"));// 3
		brands.get(0).setCompany(companies.get(1));
		brands.get(1).setCompany(companies.get(1));
		brands.get(2).setCompany(companies.get(0));
		brands.get(3).setCompany(companies.get(2));
		categories.get(2).setPhoto("clouth.jpg");
		System.out.println(categories.get(2).getPhoto());
		System.out.println(categories.get(3).getName());
		ArrayList<Product> products = new ArrayList<>();
		products.add(new Product("IPhone Pro 14", "pro14.png", 48972.45, 20, 145, brands.get(2), categories.get(0)));// 0
		System.out.println(products.get(0).getName());
		System.out.println("Marka :"+products.get(0).getBrand().getName());
		System.out.println("Fiyat :"+products.get(0).getPrice());
		System.out.println(products.get(0).getBrand().getCompany().getName());
		
		for(Product product:products) {
			System.out.println(product.getName());
			System.out.println("Marka :"+product.getBrand().getName());
			System.out.println("Fiyat :"+product.getPrice());
			System.out.println(product.getBrand().getCompany().getName());
		}
	}

}
