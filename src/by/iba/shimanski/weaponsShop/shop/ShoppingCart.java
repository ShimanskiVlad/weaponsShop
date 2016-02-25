package by.iba.shimanski.weaponsShop.shop;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
	
	public Double getSummaryPrice() {
		Double summ = 0.0;
		for (Goods item : purchases) {
			summ += item.getProductCost();
		}
		return summ;
	}

	public Set<Goods> getUniqueGoods() {
		return new HashSet<>(purchases);
	}

}
