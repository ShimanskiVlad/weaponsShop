package by.iba.shimanski.weaponsShop;

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
		return "Goods [product=" + product + ", productCost=" + productCost
				+ "]";
	}

	public Goods(T product, double productCost) {
		this.product = product;
		this.productCost = productCost;
	}

	
}
