package by.iba.shimanski.weaponsShop;

import java.util.Arrays;

public class Shop {
	private Goods[] products;
	private int size;
	private int count = 0;
	
	public Shop(int size) {
		products = new Goods[size];
		this.size = size;
	}

	public Shop(Goods... products) {
		this.products = products;
		this.size = this.count = products.length;
	}

	public Goods[] getProducts() {
		return products;
	}
			
	public void showProducts() {
		int i = 1;
		for (Goods item : products) {
			if (item != null) {
				System.out.println(i + ". " + item);
			}
			++i;
		}
		System.out.println("***********************************************************************************************************");
	}
	
	@Override
	public String toString() {
		return "Shop [products=" + Arrays.toString(products) + "]";
	}
	
	public boolean addProduct(Goods item) {
		if (count != size ) {
			products[count] = item;
			++count;
			return true;
		}
		else {
			System.out.println("No available place!");
		}
		return false;
	}
	
	public boolean deleteProduct(int index) {
		if ( index < count && index > 0) {
			for (int i = index - 1; i < count - 1; ++i) {
				products[i] = products[i + 1];
			}
			products[count - 1] = null;
			--count;
			return true;
		}
		return false;
	}

}
