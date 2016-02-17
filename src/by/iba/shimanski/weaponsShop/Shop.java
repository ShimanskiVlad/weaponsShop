package by.iba.shimanski.weaponsShop;

import java.util.Arrays;

public class Shop {
	private Goods[] products;

	public Shop() {
		products = new Goods[3];
	}

	public Shop(Goods... products) {
		this.products = products;
	}

	
	public Goods[] getProducts() {
		return products;
	}
	

	public void setProducts(Goods[] products) {
		this.products = products;
	}

		
	public void showProducts() {
		int i = 1;
		for (Goods item : products) {
			System.out.println(i + ". " + item);
			++i;
		}
	}
	
	@Override
	public String toString() {
		return "Shop [products=" + Arrays.toString(products) + "]";
	}
	
	
}
