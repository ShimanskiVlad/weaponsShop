package by.iba.shimanski.weaponsShop.comparatorImpl;

import java.util.Comparator;

import by.iba.shimanski.weaponsShop.shop.Goods;

public class SortedByName implements Comparator<Goods> {

	@Override
	public int compare(Goods o1, Goods o2) {
		String s1 = o1.getProduct().getProducer().toString();
		String s2 = o2.getProduct().getProducer().toString();
		return s1.compareTo(s2);
	}
	
}
