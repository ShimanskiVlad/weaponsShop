package by.iba.shimanski.weaponsShop;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Shop {
	//private Goods[] products;
	
	private Map<Goods, Integer> products; //goods and its count
	
	public Shop() {
		products = new HashMap<>();
	}
	
	public void addProduct(Goods product, Integer count) {
		Integer temp = products.get(product);
		if (temp == null) {
			products.put(product, count);
		}
		else {
			products.replace(product, temp + count); 
		}
	}

	public void showProducts() {
		System.out.println("***************************");
		int i = 1;
		for (Map.Entry<Goods, Integer> prod: products.entrySet()) {
			System.out.println(i + " " + prod);
			++i;
		}
	}
	

}
