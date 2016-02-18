package by.iba.shimanski.weaponsShop;

public class Goods<T extends Weapon> {
	private T product;
	private int productCount;
	private double productCost;
	
	public Goods() {
	}

	public Goods(T product, int productCount, double productCost) {
		this.product = product;
		this.productCount = productCount;
		this.productCost = productCost;
	}

	public T getProduct() {
		return product;
	}

	public void setProduct(T product) {
		this.product = product;
	}

	public int getProductCount() {
		return productCount;
	}

	public void setProductCount(int productCount) {
		this.productCount = productCount;
	}

	public double getProductCost() {
		return productCost;
	}	

	public void setProductCost(double productCost) {
		this.productCost = productCost;
	}

	@Override
	public String toString() {
		return "Goods [product=" + product + ", productCount=" + productCount
				+ ", productCost=" + productCost + "]";
	}
	
}
