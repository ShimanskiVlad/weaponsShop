package by.iba.shimanski.weaponsShop.entity;

import by.iba.shimanski.weaponsShop.interfaces.Producer;
import by.iba.shimanski.weaponsShop.interfaces.Shootable;

public class Handgun extends Weapon implements Shootable {

	private int version = 0;
	
	public Handgun() {}

	public Handgun(Double damage, Double size, int version, Producer producer) {
		super(damage, size, producer);
		this.version = version;
	}
	
	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}	
	
	@Override
	public String toString() {
		return "Handgun [version=" + version + ", damage=" + getDamage() + ", size="
				+ getSize() + ", producer=" + getProducer() + "]";
	}

	@Override
	public void shoot() {
		System.out.println("Shoot from Handgun!");		
	}

	@Override
	public Double bit() {
		System.out.println("Bit by HandGun!");
		return super.bit();
	}
}
