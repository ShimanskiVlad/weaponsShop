package by.iba.shimanski.weaponsShop;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

	private List<Goods> purchases;
	
	public ShoppingCart() {
		purchases = new ArrayList();
	}
	
	public void addGoods(Goods item) {
		purchases.add(item);
	}
	
	public void deleteGoods(int index) {
		purchases.remove(index - 1);
	}
	
	public void deleteGoods(Goods item) {
		purchases.remove(item);
	}
	
	public List<Goods> getPurchases() {
		return purchases;
	}
	
	public void clearAll() {
		purchases.clear();
	}
	
}
