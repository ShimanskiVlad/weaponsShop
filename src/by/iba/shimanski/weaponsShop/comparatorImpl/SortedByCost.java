package by.iba.shimanski.weaponsShop.comparatorImpl;

import java.util.Comparator;

import by.iba.shimanski.weaponsShop.shop.Goods;

public class SortedByCost implements Comparator<Goods> {

	@Override
	public int compare(Goods o1, Goods o2) {
		Double d1 = o1.getProductCost();
		Double d2 = o2.getProductCost();
		return d2.compareTo(d1);
	}

}
