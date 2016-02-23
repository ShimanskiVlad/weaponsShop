package by.iba.shimanski.weaponsShop;

import java.util.Comparator;

public class SortedByCost implements Comparator<Goods> {

	@Override
	public int compare(Goods o1, Goods o2) {
		Double d1 = o1.getProductCost();
		Double d2 = o2.getProductCost();
		return d2.compareTo(d1);
	}

}
