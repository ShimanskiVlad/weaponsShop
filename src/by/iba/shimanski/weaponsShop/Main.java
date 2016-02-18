package by.iba.shimanski.weaponsShop;
public class Main {
	public static void main(String[] args) {
		MachineGun<String> machineGun = new MachineGun<String>(1.0, 1.0, "qq", Producer.BERETTA);
		Handgun handgun = new Handgun(2.0, 2.0, 5, Producer.ISRAEL);
		Stick stick = new Stick(4.0, 5.6, 3.8, Producer.MAUSER);		
		
		
		Goods<Stick> sticks = new Goods<Stick>(stick, 5, 100);
		Goods<Handgun> handguns = new Goods<Handgun>(handgun, 50, 300);
		Goods<MachineGun<String>> machineguns = new Goods<MachineGun<String>>(machineGun, 33, 788);
		
		Shop shop = new Shop(4);
		shop.addProduct(handguns);
		shop.addProduct(sticks);
		shop.addProduct(machineguns);
		shop.addProduct(handguns);
		
		shop.showProducts();
		
		shop.deleteProduct(2);
		
		shop.showProducts();
		
		shop.addProduct(handguns);
		
		shop.showProducts();
		
		shop.addProduct(handguns);
		
		shop.showProducts();
	}
}