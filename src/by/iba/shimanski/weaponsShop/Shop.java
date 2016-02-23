package by.iba.shimanski.weaponsShop;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Shop {
	
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

	public void deleteProduct(Goods product) {
		products.remove(product);
	}
	
	public Map<Goods, Integer> getProducts() {
		return products;
	}
	
	public void changeProduct(Goods product, Integer newCount) {
		if (newCount > 0) {
			products.replace(product, newCount);
		}
		else {
			products.remove(product);
		}
	}

}
