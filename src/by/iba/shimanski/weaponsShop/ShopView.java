package by.iba.shimanski.weaponsShop;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ShopView {
	
	private static Shop shop;
	private static ShoppingCart cart;
	private static final Scanner scanner = new Scanner(System.in);
	
	static {
		shop = new Shop();
		cart = new ShoppingCart();
		
		MachineGun<String> machineGun = new MachineGun<String>(1.0, 1.0, "qq", Producer.BERETTA);
		Handgun handgun = new Handgun(2.0, 2.0, 5, Producer.ISRAEL);
		Stick stick = new Stick(4.0, 5.6, 3.8, Producer.MAUSER);
		Stick stick2 = new Stick(8.0, 5.6, 4.8, Producer.BERETTA);
		
		Goods<Stick> sticks = new Goods<Stick>(stick, 5);
		Goods<Stick> sticks2 = new Goods<Stick>(stick2, 4);
		Goods<Handgun> handguns = new Goods<Handgun>(handgun, 50);
		Goods<MachineGun<String>> machineguns = new Goods<MachineGun<String>>(machineGun, 33);
		
		shop.addProduct(sticks, 4);
				
		shop.addProduct(sticks2, 2);
		
		shop.addProduct(machineguns, 7);
		
		shop.addProduct(machineguns, 7);
				
		shop.addProduct(handguns, 99);
	}
	
	public static void mainMenu() {
		System.out.println("1. Посмотреть доступные товары в магазине.");
		System.out.println("2. Посмотреть мою корзину.");
		System.out.println("3. Выход.");
		int choice = getChoice(3);
		switch(choice) {
		case 1:
			showProducts();				
			break;
		case 2:
			showCart();
			break;
		case 3:
			sayGoodBuy();
			return;
			}
	}
	
	private static int getChoice(int max) {
		int ans = 0;
		while (true) {
			System.out.println("Ваш выбор:");
			try{
				ans = Integer.parseInt(scanner.next());
				if (checkChoice(ans, max)) {
					break;
				}
			} catch (NumberFormatException e) {
				System.out.println("Еще раз :)");
			}
		}
		return ans;
	}
	
	private static boolean checkChoice(int ans, int max) {
		if (ans <= max && ans > 0) {
			return true;
		}
		return false;
	}
	
	private static void showProducts() {
		System.out.println("\nДоступные товары:");
		int i = 1;
		for (Map.Entry<Goods, Integer> prod: shop.getProducts().entrySet()) {
			System.out.println(i + " " + prod.getKey() + " - " + prod.getValue());
			++i;
		}
		System.out.println(i + ". Назад в главное меню.");
		++i;
		System.out.println(i + ". Выход из магазина.");
		System.out.println("Введите номер товара для добавления его в корзину или для выхода.");
		int choice = getChoice(shop.getProducts().size() + 2);
		doJobWithProducts(choice);		
		
	}

	private static void doJobWithProducts(int choice) {
		int countProds = shop.getProducts().size();
		if (choice >= 1 && choice <= countProds) {
			addProductToCart(choice);
		}
		else if (choice == countProds + 1) {
			mainMenu();
		}
		else {
			sayGoodBuy();
		}
		
	}

	private static void sayGoodBuy() {
		System.out.println("Пока!");
		System.exit(0);
	}

	private static void addProductToCart(int choice) {
		Goods product = null;
		int temp = 0;
		for (Map.Entry<Goods, Integer> prod: shop.getProducts().entrySet()) {
			if (temp == choice - 1) {
				product = (Goods) prod.getKey();
				shop.changeProduct(product, prod.getValue() - 1);//-1 count of this product or remove if count == 1 now
				break;
			}
			++temp;
		}
		cart.addGoods(product);
		mainMenu();
	}

	private static void showCart() {
		int i = 1;
		System.out.println("Ваша корзина:");
		for (Goods item : cart.getPurchases()) {
			System.out.println(i + ". " + item);
			++i;
		}
		System.out.println(i + ". Показать итоговую стоимость.");
		++i;
		System.out.println(i + ". Очистить корзину.");
		++i;
		System.out.println(i + ". Назад в главное меню.");
		++i;
		System.out.println(i + ". Выход из магазина.");
		System.out.println("Введите номер товара для удаления его из корзины или для выхода.");
		int choice = getChoice(cart.getPurchases().size() + 4);
		doJobWithCart(choice);
	}

	private static void doJobWithCart(int choice) {
		if (choice >= 1 && choice <= cart.getPurchases().size()) {
			cart.deleteGoods(choice);
			mainMenu();
		}
		else if (choice == cart.getPurchases().size() + 1) {
			showSummPrice();
			showCart();
		}
		else if (choice == cart.getPurchases().size() + 2) {
			clearCart();
			mainMenu();
		}
		else if (choice == cart.getPurchases().size() + 3) {
			mainMenu();
		}
		else {
			sayGoodBuy();
		}
	}

	private static void clearCart() {
		cart.clearAll();
		System.out.println("Все товары из корзины удалены.");
	}

	private static void showSummPrice() {
		System.out.println(cart.getSummaryPrice());
	}

}
