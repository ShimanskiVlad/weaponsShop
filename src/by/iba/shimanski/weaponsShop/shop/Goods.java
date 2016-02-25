package by.iba.shimanski.weaponsShop.shop;

import by.iba.shimanski.weaponsShop.entity.Weapon;

public class Goods<T extends Weapon> {
	private T product;
	//private int productCount;
	private double productCost;
	
	public Goods() {
	}

	public T getProduct() {
		return product;
	}

	public void setProduct(T product) {
		this.product = product;
	}

	public double getProductCost() {
		return productCost;
	}

	public void setProductCost(double productCost) {
		this.productCost = productCost;
	}

	@Override
	public String toString() {
		return "[product=" + product + ", productCost=" + productCost
				+ "]";
	}

	public Goods(T product, double productCost) {
		this.product = product;
		this.productCost = productCost;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((product == null) ? 0 : product.hashCode());
		long temp;
		temp = Double.doubleToLongBits(productCost);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Goods other = (Goods) obj;
		if (product == null) {
			if (other.product != null)
				return false;
		} else if (!product.equals(other.product))
			return false;
		if (Double.doubleToLongBits(productCost) != Double
				.doubleToLongBits(other.productCost))
			return false;
		return true;
	}

	
}
