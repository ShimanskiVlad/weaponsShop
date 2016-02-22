package by.iba.shimanski.weaponsShop;
public class Main {
	public static void main(String[] args) {
		MachineGun<String> machineGun = new MachineGun<String>(1.0, 1.0, "qq", Producer.BERETTA);
		Handgun handgun = new Handgun(2.0, 2.0, 5, Producer.ISRAEL);
		Stick stick = new Stick(4.0, 5.6, 3.8, Producer.MAUSER);
		Stick stick2 = new Stick(8.0, 5.6, 4.8, Producer.BERETTA);
		
		
		Goods<Stick> sticks = new Goods<Stick>(stick, 5);
		Goods<Stick> sticks2 = new Goods<Stick>(stick2, 4);
		Goods<Handgun> handguns = new Goods<Handgun>(handgun, 50);
		Goods<MachineGun<String>> machineguns = new Goods<MachineGun<String>>(machineGun, 33);
		
		Shop shop = new Shop();
			
		shop.showProducts();
		
		shop.addProduct(sticks, 4);
		
		shop.showProducts();
		
		shop.addProduct(sticks2, 4);
		
		shop.showProducts();
		
		shop.addProduct(machineguns, 7);
		
		shop.showProducts();
		
		shop.addProduct(machineguns, 7);
		
		shop.showProducts();
		
		shop.addProduct(handguns, 99);
		
		shop.showProducts();
		
	}
}